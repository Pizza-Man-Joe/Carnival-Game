import org.w3c.dom.ls.LSOutput;
import java.security.SecureRandom;
import java.util.Random;

public class meth {

    public static void main(String[] args) {
       // Creating variables
        double failedTimes = 0;
        double level1Times = 0;
        double level2Times = 0;
        double level3Times = 0;
        int counter = 0;
        double sampleSize = 1000;
        while (counter < sampleSize) { // Main loop, loops 1000 times
            counter = counter + 1;
            SecureRandom rand = new SecureRandom(); // The Random function
            int upperbound = 20;
            int int_random1 = rand.nextInt(upperbound) + 1; // rolling the 1st die
            int int_random2 = rand.nextInt(upperbound) + 1; // rolling the 2nd die
            if (int_random1 + int_random2 >= 25) { // The rule to check if level 1 has been passed
                level1Times = level1Times + 1;
                System.out.println("Level 1 Complete!");
                int int_random3 = rand.nextInt(upperbound) + 1; // rolling the 1st die
                int int_random4 = rand.nextInt(upperbound) + 1; // rolling the 2nd die
                if (int_random3 >= 19 || int_random4 >= 19 && int_random3 + int_random4 >= 25) { // The rule to check if level 2 has been passed
                    level2Times = level2Times + 1;
                    System.out.println("Level 2 Complete!");
                    int int_random5 = rand.nextInt(upperbound) + 1; // rolling the 1st die
                    int int_random6 = rand.nextInt(upperbound) + 1; // rolling the 2nd die
                    if (int_random5 >= 19 || int_random6 >= 19 && int_random3 + int_random4 >= 34) { // The rule to check if level 3 has been passed
                        level3Times = level3Times + 1;
                        System.out.println("Level 3 Complete!");
                    }
                }
            }else {
                failedTimes = failedTimes + 1;
                System.out.println("Failed :(");
            }

        }
        double failedRatio = failedTimes / sampleSize; // Ratio Calculators
        double level1Ratio = level1Times / sampleSize; // Ratio Calculators
        double level2Ratio = level2Times / sampleSize; // Ratio Calculators
        double level3Ratio = level3Times / sampleSize; // Ratio Calculators
        System.out.println("You Failed: " + failedTimes + " Times" );
        System.out.println("You Won Level 1: " + level1Times + " Times");
        System.out.println("You Won Level 2: " + level2Times + " Times");
        System.out.println("You Won Level 3: " + level3Times + " Times");
        System.out.println("The Fail Rate Is: " + failedRatio * 100 + "%");
        System.out.println("The Level 1 Win Rate Is: " + level1Ratio * 100 + "%");
        System.out.println("The Level 2 Win Rate Is: " + level2Ratio * 100 + "%");
        System.out.println("The Level 3 Win Rate Is: " + level3Ratio * 100 + "%");
        System.out.println("Done!");
    }
}