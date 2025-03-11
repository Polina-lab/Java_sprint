package sprint;

public class ArraySorter {
    public double[] sortArray(double[] arr) {

        for (int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                //System.out.println("num: "+arr[j]);
                if (arr[j]<arr[minIndex]){
                    minIndex=j;
                }                
            }
            //System.out.println("min: "+arr[minIndex]);
            double temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
