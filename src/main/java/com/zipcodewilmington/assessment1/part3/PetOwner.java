package com.zipcodewilmington.assessment1.part3;


import java.util.*;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {


    private final String name;

    private final List<Pet> petList ;


    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name= name;
        if( pets == null)
            this.petList = new ArrayList<>();
        else{

        this.petList = new ArrayList<>(Arrays.asList(pets));

        for (int i = 0; i < pets.length; i++) {
            Pet pet = pets[i];
            pet.setOwner(this);


        }
        }


    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

    petList.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
    petList.remove(pet);

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        if(petList.contains(pet))

        return true;
        else
            return false;
    }

    /**
     * @return the age of the Pet object whse age field is the lowest amongst all Pets in this class
     */
    public int getYoungetPetAge() {

       int minAge = Integer.MAX_VALUE;

        for (int i = 0; i < petList.size(); i++) {
            Pet tempAge = petList.get(i);
            int petAge = tempAge.getAge();
             minAge = Math.min(minAge, petAge);
        }
        return minAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {


        Pet oldest = null;
        int age=0;
        for (Pet p : petList) {
            if (oldest == null || p.getAge() > oldest.getAge())
                oldest = p;
            age =p.getAge();
        }

        return age;

//        int oldestAge = Integer.MIN_VALUE;
//        for (int i = 0; i < petList.size(); i++) {
//            Pet tempAge = petList.get(i);
//            int petAge = tempAge.getAge();
//
//            oldestAge = Math.max(petAge, oldestAge);
//        }
//        return oldestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {


        float sum = 0;
        for (Pet p : petList) {
            sum += p.getAge();
        }

        return sum / petList.size();

    }
//
//        float avgAge ;
//        int sum = 0;
//        for (int i = 0; i < petList.size(); i++) {
//            Pet tempAge = petList.get(i);
//            int petAge = tempAge.getAge();
//            sum += petAge;
//        }
//        avgAge = sum / 2;
//        return avgAge;





    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {


        return  petList.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        return petList.toArray(new Pet[1]);

//        Pet[] result = petList.toArray(new Pet[petList.size()]);
//
//        if (result.length==0) {
//            result = new Pet[1];
//        }
//
//        return result;


      // return petList.toArray(new Pet[petList.size()]);
    }
}
