/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sangraj.slc;

/**
 *
 * @author Song Grudge Ranjit
 */
import com.sangraj.slc.util.Reportcard;
import java.util.Scanner;

public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalpass=0;
        int totalfail=0;
        Reportcard m = new Reportcard();
        Scanner input = new Scanner(System.in);

        while (true) {
            m.entry();
            if (m.isFail()) {
                totalfail++;
                System.out.println("You have failed");
            } else {
                double total = m.getTotal();
                double percentage = m.getPercentage();
                String grade = m.getGrade();
                System.out.println("Total is " + total);
                System.out.println("Percentage is " + percentage);
                System.out.println("Grade is " + grade);
                totalpass++;
                        
            }
            System.out.println("Do you want to continue[Y/N]?");
            String choice = input.next();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("Total Pass=" + totalpass);
        System.out.println("Total Fail=" + totalfail);
    }
}
