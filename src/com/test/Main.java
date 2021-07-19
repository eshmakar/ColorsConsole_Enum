package com.test;

public class Main {

    public static void main(String[] args) {
        Colors[] colors = Colors.values();
        for(Colors x: colors){
            System.out.println(x+""+x.name());
        }
    }
}
