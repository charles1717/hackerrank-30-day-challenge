package com.codetests;

public class Person {
    private int age;

    public Person(int initialAge) {
        if(initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0");
        }
        else
            this.age = initialAge;
    }

    public void yearPasses() {
        this.age += 1;
    }
}
