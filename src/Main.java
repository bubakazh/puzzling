public class Main {
    public static void main(String[] args) {

        PuzzleJava test = new PuzzleJava();

        System.out.println(test.getTenRolls());
        System.out.println(test.getRandomLetter());
        int len = 10;
        System.out.println(test.getRandomPassword(10));
        System.out.println(test.getNewPasswordSet(10));
        System.out.println("Shuffled array: " + test.shuffleArray(69));
    }

}