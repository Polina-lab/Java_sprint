package sprint;

public class ArrayAdder {
    public static int[] concatArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length+arr2.length];
        int i = 0;

        for (int num : arr1){
            result[i]=num;
            i++;
        }

        for (int num : arr2){
            result[i]=num;
            i++;
        }

        return result;
    }
}
