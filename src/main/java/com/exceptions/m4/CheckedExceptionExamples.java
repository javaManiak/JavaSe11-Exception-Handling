package com.exceptions.m4;

import java.io.*;

public class CheckedExceptionExamples {

    public static void main(String[] args) throws IOException {
//        String s = "1";
//        Object obj = s;
//        Integer n = (Integer) obj; // ClassCastException

//        String s1 = null;
//        s1.toLowerCase();  // NullPointerException

        try (var in = new FileInputStream("file.txt")){
            System.out.println();
        } catch(IOException e){
            throw new IOException();
        }

        try {
            var br = new BufferedReader(new FileReader("file.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
