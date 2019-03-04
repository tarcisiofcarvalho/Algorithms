package sorting;

public class MergeSort{

    public static void main(String[] args){

    }

    private static void mergeSort(int array[], int low, int high){
        // Check if low is smaller than higher
        // this is the exit condition for the recursive solution
        if (low < high){

            // get the index of the element in the middle
            int mid = low + (high - low) / 2;

            // sort the left side of the array
            mergeSort(array, low, mid);
            // sort the right side of the array
            mergeSort(array, mid + 1, high);
            // Combine the two arrays
            merge(array, low, mid, high);
        }
    }

    private static void merge(int[] array, int low, int mid, int high) {
        int[] aux = new int[array.length];

        // Copy both parts into the auxiliary array
        for (int i = low; i <= high; i++){
            aux[i] = array[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;

        // Merge the left and right parts of the array while comparing their values
        while (i <= mid && j <= high){
            if (aux[i] <= aux[j]){
                array[k] = aux[i];
                i++;
            } else{
                array[k] = aux[j];
                j++;
            }
            k++;
        }


        while (i <= mid){
            array[k] = aux[i];
            k++;
            i++;
        }

    }
}