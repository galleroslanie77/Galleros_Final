
/**
 * Write a description of class Galleros_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Galleros_4
{
public static void main(String[] args) {

        int[] arr = {10, 3, 25, -5, 0};
        int min = arr[0];
        int max = arr[0];

        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }

        System.out.println("Smallest: " + min + ", Largest: " + max);
    }
}
