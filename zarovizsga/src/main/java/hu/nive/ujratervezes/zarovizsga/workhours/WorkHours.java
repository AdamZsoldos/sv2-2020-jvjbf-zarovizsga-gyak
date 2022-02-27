package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WorkHours {

    public String minWork(String file) {
        try {
            List<String> lines = Files.readAllLines(Path.of(file));
            return parseLines(lines);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
    }

    private String parseLines(List<String> lines) {
        int minHours = Integer.MAX_VALUE;
        String result = null;
        for (String line : lines) {
            String[] fields = line.split(",");
            int hours = Integer.parseInt(fields[1]);
            if (hours < minHours) {
                minHours = hours;
                result = fields[0] + ": " + fields[2];
            }
        }
        if (result == null) {
            throw new IllegalStateException("Empty list");
        }
        return result;
    }
}
