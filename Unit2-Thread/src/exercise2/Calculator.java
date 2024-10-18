package exercise2;

import java.util.Scanner;

public class Calculator implements Runnable{

    private int points = 0;

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()){
            // Generate a math question
            int num1 = (int) (Math.random()*20)+1;
            int num2 = (int) (Math.random()*20)+1;
            int result = num1+num2;
            // Get the answer from the user
            System.out.println("¿"+num1+" + "+num2+"?");
            Scanner sc = new Scanner(System.in);
            int numUser = sc.nextInt();
            // Determine wether is right or wrong
            if(numUser == result)
                points++;
        }
        System.out.println("Points: "+points);
    }

    public int getPoints() {
        return points;
    }
}
