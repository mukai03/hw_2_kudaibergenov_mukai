package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(walk(18,5));
        System.out.println(walk(19,10));
        System.out.println(walk(10,21));
        System.out.println(walk(20,-5));
        System.out.println(walk(14,-10));
        System.out.println(generateRandomAge() + " " + walk(generateRandomAge(),10));
    }

    public static String walk(int personsAge, int temperature) {
        String mercedes = "Можно идти гулять";
        String joe = "Оставайтесь дома";
        if (personsAge >= 20 && personsAge <= 45 && temperature >= -20 && temperature <= 30) {
            return mercedes;
        } else if (personsAge <= 20 && temperature > 0 && temperature <= 28) {
            return mercedes;
        } else {
            return joe;
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int bmw = random.nextInt(10000);
        return bmw;
    }
}
