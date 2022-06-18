package com.practice2.animal;

import com.practice1.catsanddogs.Cats;

public class Demo {
    public static void main(String[] args) {
        Operator op = new Operator();
        Cat cat = new Cat();
        op.useAnimal(cat);

        Dog dog = new Dog();
        op.useAnimal(dog);
    }

}
