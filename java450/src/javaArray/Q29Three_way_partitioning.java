package javaArray;
//Given an array and a range [lowVal, highVal], partition the array around the range such that array is divided in three parts. 
//
//All elements smaller than lowVal come first. 
//All elements in range lowVal to highVal come next. 
//All elements greater than highVal appear in the end. 
public class Q29Three_way_partitioning{
    public static void threeWayPartition(int[] arr, int l, int h) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int i = 0; // Moved initialization here
        while (i <= endIndex) { // Changed loop condition from i < arr.length to i <= endIndex
            if (arr[i] < l) {
                int temp = arr[startIndex];
                arr[startIndex] = arr[i];
                arr[i] = temp;
                startIndex++;
                i++;
            } else if (arr[i] > h) {
                int temp = arr[endIndex];
                arr[endIndex] = arr[i];
                arr[i] = temp;
                endIndex--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};

        threeWayPartition(arr, 10, 20);

        System.out.println("Modified array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
