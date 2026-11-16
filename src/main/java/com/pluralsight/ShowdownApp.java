package com.pluralsight;

public class ShowdownApp {

    public static void main(String[] args) {
        //*Creating a super person
        SuperPerson superPerson = new SuperPerson();
        //*setting the super persons attributes user the setter
        superPerson.setName("Kimball");
        superPerson.setHealth(100);
        superPerson.setExperiencePoints(25);

        SuperHero superHero = new SuperHero();

        superHero.setName("Kimball");
        superHero.setHealth(100);
        superHero.setExperiencePoints(25);

        SuperVillain superVillain = new SuperVillain();

        superVillain.setName("Evil Elman");
        superVillain.setHealth(100);
        superVillain.setExperiencePoints(75);

        //How are the super people feeling
        System.out.println(superHero.getStatus());
        System.out.println(superVillain.getStatus());

        //The showdown starts
        superHero.fight(superVillain);
        superVillain.takeDamage(15);
        superHero.takeDamage(35);


        //How are the super people feeling
        System.out.println(superHero.getStatus());
        System.out.println(superVillain.getStatus());

    }


}
