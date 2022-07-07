package ua.lviv.iot.lab2.writer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.lab2.manager.impl.SportWearManager;
import ua.lviv.iot.lab2.manager.impl.SportWearManagerTest;
import ua.lviv.iot.lab2.models.*;

import java.io.*;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SportWearWriterTest extends SportWearManagerTest {
    List<SportWear> sportWears = createdListOfSportWears();
    File csvOutputFile = new File("src/test/resources/SportWearsWriter.csv");

    @Test
    void writingEmptyListToFileTest() throws IOException {
        List<SportWear> sportWears = new LinkedList<>();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            SportWearWriter.writeToFile(sportWears);
        });
         assertTrue(csvOutputFile.exists());
    }
    @Test
    void writingOneElementToFileTest() throws IOException {
        List<SportWear> sportWears = new LinkedList<>();
        sportWears.add(new Backpack("Backpack" , 4,"Afghanistan", "Gray", 1300,
                "Unisex", "cotton", true, "Puma", 46.2f, 3,true));
        int count = 0;
        try (FileWriter writer = new FileWriter(csvOutputFile);
             BufferedReader bufferedReader = new BufferedReader(new FileReader(csvOutputFile));) {
            SportWearWriter.writeToFile(sportWears);
            while(bufferedReader.readLine()!=null){
                count++;
            }
        }
        assertEquals(2,count);
    }
    @Test
    void writingToFileTest() throws IOException {
        Assertions.assertFalse(sportWears.isEmpty());
        try (FileWriter writer = new FileWriter(csvOutputFile)) {

            SportWearWriter.writeToFile(sportWears);
        }
        assertTrue(csvOutputFile.exists());
    }
}
