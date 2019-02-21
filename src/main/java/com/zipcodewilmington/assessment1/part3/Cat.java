package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {

    /**
     * @param name name of this Cat
     * @param age age of this Cat
     *
     */
    public Cat(String name, Integer age) {

            super(name, age);

        //this.getName();
        //this.getAge();
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        super("Cat name", age);


    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {

        super("Name of Cat", 0);

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {

    super("Cat name" , 0);

    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }

    /*//Delete below code if it is not working

    public String getName() {

        //return getName();
        return "Cat name";
    }


    public Integer getAge() {

        //return getAge();
        return 0;
        //return  Integer.MAX_VALUE;

    }*/
}
