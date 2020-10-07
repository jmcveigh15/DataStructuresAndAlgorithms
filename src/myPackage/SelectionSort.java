package myPackage;

/**
 * Selection sort example
 * O(n^2) but usually less swaps than bubble sort
 */

public class SelectionSort {

    public static void main(String[] args){
        int[] myArray = {90, 50, 72, -45, 0, 32};

        for (int lastUnsortedIndex = myArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (myArray[i] > myArray[largest]){
                    largest = i;
                }
            }
            swap(myArray, largest, lastUnsortedIndex);
        }

        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }

    public static void swap(int[] numArray, int i, int j){

        if(i == j){
            return;
        }

        int temp = numArray[i];
        numArray[i] = numArray[j];
        numArray[j] = temp;

    }

}
