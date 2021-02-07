package src.sortAlgorithms;

public class InsertionSort {

    public static void main(String[] args){

        // O(n^2)

        // before the sort starts, intArray[0] is considered sorted
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                // this shifts elements to the right if newElement is bigger than their value
                intArray[i] = intArray[i -1];
            }

            // this assigns the newElement's value to the spare space left by shifted values
            intArray[i] = newElement;
        }

        for (int loop = 0; loop < intArray.length; loop++) {
            System.out.println(intArray[loop]);
        }
    }
}
