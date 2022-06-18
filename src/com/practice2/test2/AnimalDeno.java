package com.practice2.test2;

public class AnimalDeno {
    public static void main(String[] args) {
        AnimalOpreator ao = new AnimalOpreator();
        Animal a = new Cat();

        ao.useAnimal(a);
        Animal a1 = ao.getAnimal();
    }
}
