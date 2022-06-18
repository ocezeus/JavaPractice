package com.practice2.test2;

public class AnimalOpreator {
    public void useAnimal(Animal a){
        a.eat();
    }

    public Animal getAnimal(){
        Animal a = new Cat();
        return a;
    }
}
