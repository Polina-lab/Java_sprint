package sprint;

public class ArrayInitializer {
    public int[] fillArray(int max) {
        int[] result={};
        if (max<0){
            return result;
        }
        result = new int[max];
        for (int i=0;i<max;i++){
            result[i]=i+1;
        }
        return result;
    }
}
