package main.org.datastructure.arrays.problems;

public class ReverseCharMain {

    public static void main(String[] args) {
        ReverseChar reverseChar = new ReverseChar();
        char[] toBeReversed = new char[] {'o', 'i', 'o', 'a'};
        reverseChar.reverseString(toBeReversed);

        for(char c : toBeReversed) {
            System.out.println("reversed char: "+c);
        }
    }
}
