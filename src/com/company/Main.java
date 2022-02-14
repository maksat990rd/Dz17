package com.company;

public class Main {

    public static void main(String[] args) {
        Animal shark = new Shark();
        Animal eagle = new Eagle();
        Animal turtle = new Turtle();

        Animal[] animals = {turtle, eagle, shark};

        for (Animal s : animals) {
            if (s instanceof Shark) {
                ((Shark) s).attack();
            }
            if (s.getClass().getName().equals("work: Shark")) {
                ((Shark) s).attack();
            }

            if (s instanceof Turtle) {
                ((Turtle) s).swim();
            }
            if (s.getClass().getName().equals("work: Turtle")) {
                ((Turtle) s).swim();
            }
            if (s instanceof Eagle) {
                ((Eagle) s).fly();
            }
            if (s.getClass().getName().equals("work: Eagle")) {
                ((Eagle) s).fly();
            }
            System.out.println();
        }
        Animal[] reptile = {turtle};
        Animal[] fish = {shark};
        Animal[] bird = {eagle};

    }
}
