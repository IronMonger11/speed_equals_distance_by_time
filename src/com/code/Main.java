package com.code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter the formula (s = find the speed), (d = find the distance), (t = find the time)");
        String formula = a.next();
        if (formula.equals("s")) {
            System.out.println("enter d (distance)");
            int d = a.nextInt();
            System.out.println("enter t (time)");
            int t = a.nextInt();
            int s = d * t;
            System.out.println("speed = " + s);
        }
        if (formula.equals("d")) {
            System.out.println("enter s (speed)");
            int s = a.nextInt();
            System.out.println("enter t (time)");
            int t = a.nextInt();
            int d = t * s;
            System.out.println("distance = " + d);
        }
        if (formula.equals("t")) {
            System.out.println("enter s (speed)");
            int s = a.nextInt();
            System.out.println("enter d (distance)");
            int d = a.nextInt();
            int t = s / d;
            System.out.println("time = " + t);
    }
}
