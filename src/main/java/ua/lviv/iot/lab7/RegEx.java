package ua.lviv.iot.lab7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class RegEx {
    public static final String HOT_LINE_PHONE_NUMBER = "(0(800| 800| \\(800\\))(\\s\\d*\\s\\d*|\\d*\\s\\d*))";
    private File file;

    private String fileToString() {
        StringBuilder result = new StringBuilder();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                result.append(scanner.nextLine()).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }
    
    public String redactFile() {
        Pattern findNumbers = Pattern.compile(HOT_LINE_PHONE_NUMBER);
        String replaceHotLineNumbers = findNumbers.matcher(fileToString()).replaceAll("HOT_LINE");
        return replaceHotLineNumbers;
    }
}