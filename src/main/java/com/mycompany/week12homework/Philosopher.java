/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week12homework;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sound Room
 */
public class Philosopher extends Thread {

    //variables
    int id;
    TroughPosition troughPosition;

    //constructor
    public Philosopher(int ID, TroughPosition TroughPos) {

        this.id = ID;
        this.troughPosition = TroughPos;

    }

    @Override
    public void run() {

        //display a message to show the id and the number of times 
        System.out.println("Philosopher #" + id + " waiting. Number of times to feed: 1");

        //call startEating with id as the argument until it returns true
        while (troughPosition.startEating(id) != true) {
            troughPosition.startEating(id);
        }

        //sleep for a random amount of time (between 1 and 50 milliseconds)
        Random random = new Random();
        int sleepTime = random.nextInt(50);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }

        //display a message to show the id and the number of times 
        System.out.println("Philosopher #" + id + " waiting. Number of times to feed: 2");

        //call startEating with id as the argument until it returns true
        while (troughPosition.startEating(id) != true) {
            troughPosition.startEating(id);
        }

        //sleep for a random amount of time (between 1 and 50 milliseconds)
        int sleepTime2 = random.nextInt(50);
        try {
            Thread.sleep(sleepTime2);
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }

        //display a message to show the id and the number of times 
        System.out.println("Philosopher #" + id + " waiting. Number of times to feed: 3");

        //call startEating with id as the argument until it returns true
        while (troughPosition.startEating(id) != true) {
            troughPosition.startEating(id);
        }

        //sleep for a random amount of time (between 1 and 50 milliseconds)
        int sleepTime3 = random.nextInt(50);
        try {
            Thread.sleep(sleepTime3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
