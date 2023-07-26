package com.exceptions.m3;

import java.io.IOException;

public class TryWithResourcesReverseClose {

    public static void main(String[] args) {

        try (var one = new MyResource("One");
             var two = new MyResource("Two")) {
                throw new RuntimeException();
        }


    }
}
