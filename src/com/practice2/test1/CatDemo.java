package com.practice2.test1;

public class CatDemo {
    public static void main(String[] args) {
        CatOperator op1 = new CatOperator();
        Cat cat1 = new Cat();
        op1.useCat(cat1);

        Cat cat2 = op1.getCat();
    }
}
