package com.company;
import java.util.Scanner;
public class Main {
    static String nwStr = "OMG, works!";
    public static void main(String[] args) {
	// write your code here
        int cntr = 30;
        byte myByte = 125;
        int [] myArray = new int[10];
        int [][] dimArray = {{1,2,3},{4,5,5,6}, {7,8,9}};
        String myStr = "OMG, I've started learning!";
        Scanner scan = new Scanner(System.in);

        System.out.println("The World is Mine!");
        System.out.println("Definitely!)");
        while (cntr > 0) {
            cntr--;
            System.out.println("Counter is now: " +cntr);
        }
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x++;
        }
        if (x == 3) {
            System.out.print("Do");
        }
        System.out.println(nwStr);
        System.out.println(myStr);
        System.out.println(((String) myStr).concat(" Oh no way, man!"));
        System.out.println("Please, input your age...");
        myStr = scan.nextLine();
        switch (myStr) {

            case "null" :
                System.out.println("You have born!");
                break;
            case "seven" :
                System.out.println("School is waiting for you");
                break;
             default :
                 System.out.println("No way!");
        }
        //for (int i=0; i < myArray.length; i++) {
          //  myArray[i] = i;
            //System.out.println("Array item # "+ i);
        //}
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.println(dimArray[i][j]);
            }
        }
    }
}
