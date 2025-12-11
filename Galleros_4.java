
/**
 * Write a description of class Galleros_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Galleros_4
{
public static void main(String[] args) {

        int[] arr = {10, 3, 30, 9, 7};
        int min = arr[0];
        int max = arr[0];

        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }

        System.out.println("Smallest: " + min + ", Largest: " + max);
    }
}
