package sprint;

public class OccurrenceCounter {
    public int countOccurrences(int[] arr, int element, int index){
        if (arr==null||index<0||index>arr.length-1) return 0;
        //System.out.println(element+" "+index);
        if(arr[index]==element){
            return countOccurrences(arr, element, index+1)+1;
        } else {
            return countOccurrences(arr, element, index+1);
        }

    }
}
