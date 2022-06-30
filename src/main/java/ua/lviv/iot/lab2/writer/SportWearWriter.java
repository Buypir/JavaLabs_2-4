package ua.lviv.iot.lab2.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.lab2.manager.impl.SportWearManager;
import ua.lviv.iot.lab2.models.*;

public class SportWearWriter extends SportWearManager {
    public static void writeToFile(List<SportWear> sportWears) throws IOException {
        if (!sportWears.isEmpty()) {
            File csvOutputFile = new File("src/test/resources/SportWearsWriter.csv");
            Charset charSet = StandardCharsets.UTF_8;
            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(
                    csvOutputFile.toPath(), charSet)) {
                String previousClassName = "";
                sportWears.sort(Comparator.comparing(sportWear -> sportWear.getClass().getName()));
                for (SportWear sportWear : sportWears) {
                    if (!sportWear.getClass().getSimpleName().equals(previousClassName)) {
                        bufferedWriter.write(sportWear.getHeaders());
                        bufferedWriter.write("\r\n");
                        previousClassName = sportWear.getClass().getSimpleName();
                    }
                    bufferedWriter.write(sportWear.toCSV());
                    bufferedWriter.write("\r\n");
                }
            }
        } else {
            throw new IllegalArgumentException("No SportWears to write to file");
        }
    }
}
