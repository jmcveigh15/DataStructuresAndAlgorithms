package src.sortAlgorithms;

public class BubbleSort {

    // O(n^2)

    public static void main(String[] args){
        int[] num = {5,4,3};
        for (int lastUnsortedIndex = num.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex; i++){
                if(num[i] > num[i + 1]){
                    swap(num, i, i+1);
                }
            }
        }
        for (int loop = 0; loop < num.length; loop++){
            System.out.println(num[loop]);
        }
    }

    public static void swap(int[] num, int i, int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
