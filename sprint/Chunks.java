package sprint;

public class Chunks {
    public static int search(int[] sortedArray, int target) {
        if (sortedArray.length==0) return 0;

        return searchAlgorithm(sortedArray, target, 0,sortedArray.length-1,0);
    }

    private static int searchAlgorithm(int[] arr, int target, int left, int rigth, int steps){
        if(left>rigth){
            return steps;
        }
        int mid = left + (rigth - left) /2;

        steps++;

        if (arr[mid]==target) return steps;
        else if (arr[mid]>target) return searchAlgorithm(arr, target, left, mid-1, steps);
        else return searchAlgorithm(arr, target, mid+1, rigth, steps);
    }
}
