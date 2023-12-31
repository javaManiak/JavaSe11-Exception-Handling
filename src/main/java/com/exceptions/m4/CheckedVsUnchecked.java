package com.exceptions.m4;

import java.io.IOException;
import java.nio.file.Files;

public class CheckedVsUnchecked {

    public static void main(String[] args) {
        doThis();
        try {
            doThat();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("This will not run");
    }

    private static void doThat() throws IOException {
        throw new IOException();
    }

    private static void doThis() throws IllegalArgumentException {
        throw new IllegalArgumentException();
    }
}
