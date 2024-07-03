package task1codsoft;
import java.util.Scanner;
public class Task1CodSoft {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = false;
        int score = 0, numberOfGuesses = 0, opportunity = 5;
        do {
            boolean firstFlag = false;
            int randomNum = (int) ((Math.random() * 100) + 1);
            while (!firstFlag) {
                System.out.println("Guess an integer number from 1 to 100, You have " + opportunity + " opportunities left. ");
                int num = in.nextInt();
                if (opportunity > 1) {
                    if (num < 1 || num > 100) {
                        System.out.println("Invalid input!");
                        firstFlag = false;
                    } else if (num < randomNum) {
                        System.out.println("Too low.");
                        numberOfGuesses++;
                        opportunity--;
                        firstFlag = false;
                    } else if (num > randomNum) {
                        System.out.println("Too high.");
                        numberOfGuesses++;
                        opportunity--;
                        firstFlag = false;
                    } else {
                        System.out.println("Correct answer , If you want to try again enter 1 if not enter 0.");
                        int ans = in.nextInt();
                        numberOfGuesses++;
                        score++;
                        if (ans == 1) {
                            opportunity = 5;
                            firstFlag = true;
                            flag = false;
                        } else {
                            firstFlag = true;
                            flag = true;
                            System.out.println("Your score is : " + score + " correct from " + numberOfGuesses + " gusses.");
                        }
                    }
                } else {
                    System.out.println("You have used up all your opportunities ,Try again");
                    opportunity = 5;
                    numberOfGuesses++;
                    firstFlag = false;
                }
            }
        } while (!flag);
    }
}
