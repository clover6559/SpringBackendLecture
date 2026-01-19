package org.example.head06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileToListExample {
    public static void main(String[] args) {
        List<String> loadItems = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("items.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    loadItems.add(line);
                }
                if (line.startsWith("#")) continue;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("로드된 리스트: " + loadItems);
    }
}
