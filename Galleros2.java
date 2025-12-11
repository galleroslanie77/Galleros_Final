
/**
 * Write a description of class Galleros2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Galleros2 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 7, 5, 7, 2,7, 9, 10};
        int count = 0;
        for (int n : arr) {
            if (n == 7) count++;
        }
        System.out.println("Number 7 appears " + count + " times.");
    }
}
