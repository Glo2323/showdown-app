package com.pluralsight;

public class SuperVillain extends  SuperPerson {

    public SuperVillain(String name, int health, int powerLevel) {
        super(name, health);

        //*handle all other things the parents constructor can't
        setExperiencePoints(powerLevel);

        //*say something cool
        System.out.printf("%s arrives with a evilness level of %d\n", name, powerLevel);
    }
}
