package pl.praktycznajava.module4.cleancode.challenge6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Challenge6Service {

    // ---------------------------------------------------------------------------------------------
    // Challenge 6. Zrefaktoryzuj ciało poniższej metody w taki sposób, aby była jasna i czytelna.
    //              Zwróć uwagę na to, aby rozdzielić obsługę błędów od zwykłego przetwarzania.
    // --------------------------------------------------------------------------------------

    public void readFile() throws IOException {
        String filePath = "path/to/your/file.txt";
        String line;
        BufferedReader reader = getBufferedReader(filePath);
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    private static BufferedReader getBufferedReader(String filePath) {
        try {
            return new BufferedReader(new FileReader(filePath));
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
            return null;
        }
    }

}
