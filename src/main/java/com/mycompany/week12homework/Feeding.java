/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week12homework;

/**
 *
 * @author Sound Room
 */
public class Feeding {

    public static void main(String[] args) {

        //Declare and create an array of the TroughPosition class, with size 4. 
        TroughPosition[] troughPosArray = new TroughPosition[4];

        //Declare and create 4 objects of the ThroughPosition class and store them in the array. 
        TroughPosition trough1 = new TroughPosition(1, 9, 1, 2);
        TroughPosition trough2 = new TroughPosition(2, 3, 4, -1);
        TroughPosition trough3 = new TroughPosition(3, 5, 6, -1);
        TroughPosition trough4 = new TroughPosition(4, 7, 8, 10);

        troughPosArray[0] = trough1;
        troughPosArray[1] = trough2;
        troughPosArray[2] = trough3;
        troughPosArray[3] = trough4;

        //Declare and create 10 thread objects belonging to the Philosopher class  
        Philosopher phil1 = new Philosopher(1, trough1);
        Philosopher phil2 = new Philosopher(2, trough1);
        Philosopher phil3 = new Philosopher(3, trough2);
        Philosopher phil4 = new Philosopher(4, trough2);
        Philosopher phil5 = new Philosopher(5, trough3);
        Philosopher phil6 = new Philosopher(6, trough3);
        Philosopher phil7 = new Philosopher(7, trough4);
        Philosopher phil8 = new Philosopher(8, trough4);
        Philosopher phil9 = new Philosopher(9, trough1);
        Philosopher phil10 = new Philosopher(10, trough4);

        //Run the threads
        phil1.start();
        phil2.start();
        phil3.start();
        phil4.start();
        phil5.start();
        phil6.start();
        phil7.start();
        phil8.start();
        phil9.start();
        phil10.start();

    }

}
