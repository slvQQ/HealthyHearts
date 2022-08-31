import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int askAge = input.nextInt();
        int heartRate = 220 - askAge;
        double minHR = (double) 50/100 * heartRate;
        double maxHR = (double) 85/100 * heartRate;

        int intMinHR = (int) minHR;
        int intMaxHR = (int) maxHR;


        System.out.println(askAge);
        System.out.println("Your maximum heart rate should be " + heartRate + " beats per minute");
        System.out.println("Your target HR Zone is " + intMinHR + " - " + intMaxHR + " beats per minute");
    }
}
