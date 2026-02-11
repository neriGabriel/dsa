package main.org.datastructure.arrays.problems;

public class ContainsDuplicateMain {

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean hasDup = containsDuplicate.hasDuplicate(new int[] {});
        System.out.println("Contains duplicate: "+hasDup);
    }
}
