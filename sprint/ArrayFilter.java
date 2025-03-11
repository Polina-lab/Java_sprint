package sprint;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilter {
    public int[][] filterBySum(int [][] _2dArray, int value){
        int i = 0;
        List<int[]> saveArray = new ArrayList<>();
        
        for (int [] nums : _2dArray){
            int sum=0;
            for (int num : nums){
                sum+=num;
            }
            if (sum>value) {
                saveArray.add(nums);
                i++;
            }
        }
        int[][] resultArray = new int[i][];
        for (int j = 0; j<i;j++){
            resultArray[j] = saveArray.get(j);
        }

        return resultArray;
    }
}
