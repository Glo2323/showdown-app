package com.pluralsight;

import java.util.Random;

public class ShowdownApp {

    public static void main(String[] args) {

        Random random = new Random();

        SuperHero hero = new SuperHero("Logan", 100, 100);
        SuperVillain villain = new SuperVillain("Messi", 100, 150);
        hero.fight(villain);
        boolean fighting = true;
        while (fighting) {
            System.out.println(hero.getStatus());
            System.out.println(villain.getStatus());


            villain.takeDamage(random.nextInt(101));
            hero.takeDamage(random.nextInt(101));

            System.out.println(hero.getStatus());
            System.out.println(villain.getStatus());

            if (!villain.isAlive()|| !hero.isAlive()) {
                fighting = false;
                if (villain.isAlive()){
                    System.out.println(villain.getName() + " Winner");
                }
                else if (hero.isAlive()){
                    System.out.println(hero.getName() + " Winner");
                }
            }


        }


    }


}
