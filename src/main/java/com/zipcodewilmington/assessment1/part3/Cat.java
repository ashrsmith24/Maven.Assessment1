package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {


    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        this.getName();
        this.getAge();

    }
    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
    this.getAge();

    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
       this.getName();

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        String talk = "Meow";
        return talk;
    }
}
