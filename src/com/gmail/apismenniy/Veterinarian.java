package com.gmail.apismenniy;

public class Veterinarian {
    private String name;

    public Veterinarian() {
        super();
    }

    public Veterinarian(String name) {
        super();
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
        return "Veterinarian{" +
                "name='" + name + '\'' +
                '}';
    }
    public void treatment(Animal animal){
        System.out.println("My name is "+ name + " And I treat " + animal);

    }

}
