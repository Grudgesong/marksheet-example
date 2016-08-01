/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sangraj.slc.util;

import java.util.Scanner;

/**
 *
 * @author Song Grudge Ranjit
 */
public class Reportcard {

    double eng, sci, opm, com, cma, sst, nep, acc;
    double passmark = 32;
    double fullmark = 800;
    Scanner input;
    
    public Reportcard(){
    input=new Scanner(System.in);    
    }
    
    public Reportcard(Scanner input){
        this.input=input;
        
    }

    public void entry() {
        System.out.println("Enter the marks of English:");
        eng = input.nextDouble();
        System.out.println("Enter the marks of Science:");
        sci = input.nextDouble();
        System.out.println("Enter the marks of Optional Math/Optional English:");
        opm = input.nextDouble();
        System.out.println("Enter the marks of Computer:");
        com = input.nextDouble();
        System.out.println("Enter the marks of Compulsary Math:");
        cma = input.nextDouble();
        System.out.println("Enter the marks of Social Studies:");
        sst = input.nextDouble();
        System.out.println("Enter the marks of Nepali:");
        nep = input.nextDouble();
        System.out.println("Enter the marks of Account:");
        acc = input.nextDouble();
    }

    public boolean isFail() {
        return (eng < passmark || sci < passmark || opm < passmark || com < passmark || cma < passmark || sst < passmark || nep < passmark || acc < passmark);
    }

    public double getTotal() {
        return (eng + sci + opm + com + cma + sst + nep + acc);
    }

    public double getPercentage() {
        return (getTotal() / fullmark) * 100;
    }
    public String getGrade() {
        double per = getPercentage();
        String grade = "";
        if (per >= 80) {
            grade = "Distinction";
        } else if (per < 80 && per >= 60) {
            grade = "First Division";
        } else if (per < 60 && per >= 50) {
            grade = "Second Division";
        } else {
            grade = "Third Division";
        }
        return grade;
    }
}
