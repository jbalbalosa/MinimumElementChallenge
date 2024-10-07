import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringArray = "";

        System.out.println("Minimum Element Challenge!");
        System.out.println("Enter the comma delimited list of integers:");
        stringArray = scanner.nextLine();

        String[] splitString = stringArray.split(",");
        //print the value of the arrays
        System.out.println(Arrays.toString(readIntegers(stringArray)));

        //create an array of the same size;
        int[] intArray = new int[splitString.length];

        //convert string array to int;
        for (int i = 0; i < splitString.length; i++) {
            intArray[i] = Integer.parseInt(splitString[i]);
        }

        //find the minimum value
        int minValue = findMin(intArray);
        System.out.println("Minimum value: " + minValue );
    }

    private static String[] readIntegers(String csvIntegers){
        String[] strArray = csvIntegers.split(",");
        return  strArray;
    }

    private static int findMin(int[] array){
        int temp = 0;
        temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if(temp > array[i]){
                temp = array[i];
            }
        }
        return temp;
    }
}
