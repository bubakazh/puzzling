
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    Random randy = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            tenRolls.add(randy.nextInt(21));
        }
        return tenRolls;
    }

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public char getRandomLetter() {
        int n = randy.nextInt(26);
        return alphabet[n];
    }

    public String getRandomPassword(int len) {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456879!@#$%^&*()?";
        SecureRandom random = new SecureRandom();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int randInd = random.nextInt(chars.length());
            string.append(chars.charAt(randInd));
        }
        return string.toString();
    }

    public ArrayList<String> getNewPasswordSet(int len) {
        ArrayList<String> passwords = new ArrayList<String>();
        for (int i = 0; i < len; i++) {
            passwords.add(getRandomPassword(8));
        }
        return passwords;
    }

    public ArrayList<String> shuffleArray(int times) {
        ArrayList<String> shuffledSet = getNewPasswordSet(10);
        System.out.println("Original array: " + shuffledSet);
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < times; i++) {
            int randInd = random.nextInt(shuffledSet.size());
            String temp = shuffledSet.get(randInd);
            int otherRandInd = random.nextInt(shuffledSet.size());
            shuffledSet.set(randInd, shuffledSet.get(otherRandInd));
            shuffledSet.set(otherRandInd, temp);
            //LAST FEW LINES THANKS FOR YOUR HELP CAM DEROBERTIS!!
        }
        return shuffledSet;
    }
}