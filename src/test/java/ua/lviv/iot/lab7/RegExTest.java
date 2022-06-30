package ua.lviv.iot.lab7;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegExTest {

    @Test
    void ReplaceHotLineNumbersTest() {
        RegEx regex = new RegEx(
                new File(Paths.get("").toAbsolutePath().toString() +
                        "\\src\\test\\resources", "ProjectReport.txt"));
        String expected = ("I can call on HOT_LINE and I can maybe calling on the number HOT_LINE and if" +
                "  don't can on the phone i can\n" +
                "call on the HOT_LINE\n");
        assertEquals(expected, regex.redactFile());
    }

    @Test
    void emptyFileTest() {
        RegEx regex = new RegEx(new File(Paths.get("").toAbsolutePath().toString() + "\\src\\test\\resources",
                "EmptyFile.txt"));
        assertTrue(regex.redactFile().isEmpty());
    }

    @Test
    void noHotLineNumbersFileTest() {
        RegEx regex = new RegEx(new File(Paths.get("").toAbsolutePath().toString() + "\\src\\test\\resources",
                "NoHotLineNumbersFile.txt"));
        assertFalse(regex.redactFile().isEmpty());
    }
}