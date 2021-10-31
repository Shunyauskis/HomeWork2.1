package com.gmail.apismenniy;

public class Animal {
    private String ration;
    private String color;
    private int weight;

    public Animal() {
        super();
    }

    public Animal(String ration, String color, int weight) {
        super();
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "ration='" + ration + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
    public String getVoice(){
        return "voice";
    }
    public void eat(){
        System.out.println("eat" + ration);

    }
    public void sleep(){
        System.out.println("sleep");
        return;

    }
}
