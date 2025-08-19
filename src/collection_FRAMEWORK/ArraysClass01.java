package collection_FRAMEWORK;

import java.util.Arrays;

public class ArraysClass01 {
    public static void main(String[] args) {
        int [] numbers = {10, 2, 32, 12, 15, 76, 17, 48, 79, 9};
        int [] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index1 = Arrays.binarySearch(numbers1,9); // here the array [numbers1] is sorted so the binary search is working

        int index = Arrays.binarySearch(numbers,12);// coz the array [numbers] is not sorted so the binary search is not working
        System.out.println(index1);
        System.out.println(index);

        // so first we will sort the array[numbers], them we will apply the binarySearch.
        Arrays.sort(numbers); // once you do Arrays.sort(name),its elements are rearranged in ascending order right there in memory,
        // and any subsequent operations on that array will use the sorted version.
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers,15));

        Arrays.fill(numbers,69);
        System.out.println(Arrays.toString(numbers));

        // OR --> we can use for each loop for sorting

        for (int a: numbers){
            System.out.print(a+" ");
        }




    }
}
