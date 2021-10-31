package com.gmail.apismenniy;

public class Dog extends Animal{
    private String name;

    public Dog() {
        super();
    }

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getVoice() {
        return "Woof woof";
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating "+ getRation());
    }

    @Override
    public void sleep() {
        System.out.println(name + "is sleeping");
    }
}
