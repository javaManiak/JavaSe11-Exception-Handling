package com.exceptions.m3;

import java.io.*;

public class TryWithResourcesExample {

    public static void main(String[] args) {

        try (FileInputStream in = new FileInputStream("in.txt");
                FileOutputStream out = new FileOutputStream("out.txt")) {
            out.write(in.readAllBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
