package com.galvanize;

public class Application {

    public static void main(String... args) {
        String it = args.length > 0 ? args[0] : "It";
        System.out.println(String.format("%s works!", it));
    }
}
