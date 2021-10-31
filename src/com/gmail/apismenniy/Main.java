package com.gmail.apismenniy;

public class Main {

    public static void main(String[] args) {
        Cat catOne = new Cat("Wiskas", "Black", 4, "Barsik");
        catOne.eat();
        catOne.sleep();
        System.out.println(catOne.getVoice());
        System.out.println();

        Dog dogOne = new Dog("Pedigree", "Grey", 30, "Palkan");
        dogOne.eat();
        dogOne.sleep();
        System.out.println(dogOne.getVoice());
        System.out.println();

        Veterinarian vetOne = new Veterinarian("Georgyi");
        vetOne.treatment(catOne);
        vetOne.treatment(dogOne);



    }
}
