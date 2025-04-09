/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week12homework;

import java.util.Random;

/**
 *
 * @author Sound Room
 */
public class TroughPosition {

    //trough position number
    int id;

    //integer variables that keep track of the philosophers eating at this trough position
    //if there are only 2 philosophers, pos3 has value -1
    int pos1;
    int pos2;
    int pos3;

    //boolean variable that keeps track of whether anyone is feeding at this trough
    boolean feeding;

    //constructor 1: 2 philosophers per trough position
    public TroughPosition(int id, int position1, int position2) {

        this.id = id;
        this.pos1 = position1;
        this.pos2 = position2;

        //set pos3 to -1 because there is no third philosopher
        this.pos3 = -1;

    }

    //constructor 2: 3 philosophers per trough position
    public TroughPosition(int id, int position1, int position2, int position3) {

        this.id = id;
        this.pos1 = position1;
        this.pos2 = position2;
        this.pos3 = position3;

    }

    //finish eating
    public void finishEating() {
        this.feeding = false;
    }

    //start eating
    public boolean startEating(int philosopherID) {

        try {

            //display a message to show the id of the philosopher that is feeding
            System.out.println("Philosopher #" + philosopherID + " is eating.");

            //set the attribute feeding to true
            this.feeding = true;

            //simulate time spent eating by generating a random integer between 1 and 100
            Random random = new Random();
            int TimeSpentEating = random.nextInt(100);
            Thread.sleep(TimeSpentEating);

            //call the finishEating method
            this.finishEating();

            //display a message to show that the philosopher has finished eating. 
            System.out.println("Philosopher #" + philosopherID + " has finished eating.");

            //return true if everything executed
            return true;

        } catch (Exception e) {

            //return false if there was an error
            return false;
        }

    }

}
