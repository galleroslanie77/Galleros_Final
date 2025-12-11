
/**
 * Write a description of class Galleros_12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Galleros_12
{
public static void main(String[] args) {
        
        iint[] arr = {7, 2, 7, 4, 7, 5, 1};
        int valueToCheck = 7;
        int count = 0;

         for (int n : arr) {
             if (n == valueToCheck) count++;
        }

        if (count >= 3) {
            // System.out.println(valueToCheck + " appears at least 3 times.");
        } else {
             System.out.println(valueToCheck + " does not appear at least 3 times.");
         }
    }
}
