package myPackage;

/**
 * Insertion sort example
 * O(n^2)
 */

public class InsertionSort {

    public static void main(String[] args){
        int[] myArray = {40, -20, 11, -25, 1, 72};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < myArray.length; firstUnsortedIndex++){
            int newElement = myArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && myArray[i - 1] > newElement; i--){
                myArray[i] = myArray[i - 1];
            }

            myArray[i] = newElement;
        }

        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }
}
