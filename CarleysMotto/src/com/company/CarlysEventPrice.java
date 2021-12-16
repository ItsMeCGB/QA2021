package com.company;
/*
    This program gets an input of guests from the user in the form of a scanner
    then makes calculations to figure the event price

    Colin Batty
    12/12/2021
 */

import javax.swing.plaf.metal.MetalLookAndFeel;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CarlysEventPrice {
    //Global
    static String iData;
    static Scanner inputDevice;
    static DecimalFormat dfMoneyFormat,dfPeople;
    static Integer PRICE_PER_PERSON = 35;
    static boolean trueFalse = false;


    public static void main(String[] args) {
        init();
        int iPeople = input();
        int cTotal = calcs(iPeople);
        output(iPeople, cTotal);
    }

    private static void output(int iPeople, int cTotal) {

        String oPeople = dfPeople.format(iPeople);
        String oPricePerPerson = dfMoneyFormat.format(PRICE_PER_PERSON);
        String oTotal = dfMoneyFormat.format(cTotal);
        carley2.output();
        System.out.printf("%5s%-10s%20s%-10s%15s\n",
                        "Total People", " ", "Price per person", " ", "Cost for event");
        System.out.printf("%5s%-12s%20s%-12s%15s\n",
                oPeople, " ", oPricePerPerson, " ", oTotal);
        if (iPeople > 50){
          trueFalse = true;
          System.out.println("\n \n Is this party big? " + trueFalse);
        }
        else{
            if (trueFalse == false){
                System.out.println("\n \n Is this party big? " + trueFalse);

            }
        }

    }

    private static int calcs(int iPeople) {
        int cTotal = iPeople * PRICE_PER_PERSON;
        return cTotal;

    }

    private static int input() {
        System.out.println("How many guests will be attending? ");
        iData = inputDevice.nextLine();
        int iPeople;
        try{
            iPeople = Integer.parseInt(iData);
        }
        catch (Exception e) {
            System.out.println("ERROR NUMBER NOT A NUMBER!!!!");
            System.out.println("MINUTES SET TO 0");
            iPeople = 0;

        }
        return iPeople;
    }

    private static void init() {
        inputDevice = new Scanner(System.in);
        dfMoneyFormat = new DecimalFormat("$#,###.00");
        dfPeople = new DecimalFormat("##0");
    }


}
