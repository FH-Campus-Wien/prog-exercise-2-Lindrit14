package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here

        Scanner sc = new Scanner(System.in);

        double inputNumber;
        int count = 1;
        double biggestNumber= 0;

        do {
            System.out.print("Number " + count + ": ");
            inputNumber = sc.nextDouble();

            if (inputNumber <= 0 && count == 1){
                System.out.println("No number entered.");
            }

            if (inputNumber > biggestNumber) {
                biggestNumber = inputNumber;
            }

            if (inputNumber <= 0 && count > 1) {
                System.out.printf("The largest number is %,.2f", biggestNumber);
                System.out.println();
            }


            count++;
        }while(inputNumber > 0);



    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.print("n: ");
        int numberOfRows = sc.nextInt();

        if (numberOfRows <= 0) {
            System.out.println("Invalid number!");
        } else {
            for (int i = 1; i <= numberOfRows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(count + " ");
                    count++;
                }
                System.out.println();
            }
        }


    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here
        final int NUMBER_OF_ROWS = 6;


        for (int i = 1; i<=NUMBER_OF_ROWS; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k<(i*2)-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }





    //todo Task 4
    public void printRhombus(){

    Scanner sc = new Scanner(System.in);
    System.out.print("h: ");
    int height = sc.nextInt();
    System.out.print("c: ");
    char character = sc.next().charAt(0);

        if (height % 2 == 0) {
            System.out.println("Invalid number!");
        }else {

            //FIRST HALF
            for (int i = 0; i <= height/2; i++) {

            for (int j = height/2; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < (i*2)+1 ; k++) {

                System.out.print((char) (character - Math.abs(k-i)));
            }
            System.out.println();




            }
            //SECOND HALF
            for (int i = (height/2)-1; i >= 0; i--) {

                for (int j = height/2; j > i; j--) {
                    System.out.print(" ");
                }

                for (int k = 0; k < (i*2)+1; k++) {
                    System.out.print((char) (character - Math.abs(k-i)));
                }

                System.out.println();
            }


    }



    }

    //todo Task 5
    public void marks(){
        // input your solution here

        Scanner sc = new Scanner(System.in);
        double mark;
        double avg = 0;
        double numberOfMarks = 0;

        int counter = 1;
        int negativeMarks = 0;

        do {

            System.out.print("Mark " + counter + ": ");
            mark = sc.nextInt();

            if (mark <= 5) {
                avg += mark;
                numberOfMarks++;
                counter++;
            }

            if (mark == 5){
                negativeMarks++;
            }

            if(mark > 5){
                System.out.println("Invalid mark!");
            }

        }while (mark !=0);


        if (avg == 0 && numberOfMarks == 1) {
            System.out.println("Average: 0.00");
            System.out.println("Negative marks: "+ negativeMarks);
        }else {
            System.out.printf("Average: %,.2f", avg/(numberOfMarks-1));
            System.out.println();
            System.out.println("Negative marks: " + negativeMarks);

        }


    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here

        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int happyNumber = sc.nextInt();
        int partSum = 0;
        int endSum = 0;
        int digit;


        while (happyNumber != 0){
            digit = happyNumber%10;
            partSum += Math.pow(digit,2);
            happyNumber/=10;

            if (happyNumber==0){
                happyNumber = partSum;
                endSum = partSum;
                partSum=0;
            }

            if (endSum==1){
                System.out.println("Happy number!");
                break;
            }else if (endSum == 4){
                System.out.println("Sad number!");
                break;
            }

        }

    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}