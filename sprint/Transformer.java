package sprint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Transformer {
    public static int[] transform(int[] arr){
        //Arrays.sort(arr);
        LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
        for (int i = 0; i < arr.length; i++) s.add(arr[i]);

        List<Integer> result = new ArrayList<Integer>(s);
        Collections.sort(result, Collections.reverseOrder());

        for (int i = 2; i < result.size(); i += 3) {
            result.set(i, result.get(i - 1) + result.get(i - 2));
        }

        Collections.reverse(result);

        int[] completed = new int[result.size()];
        for(int i=0;i<result.size();i++){
            completed[i]=result.get(i);
        }
        System.out.println(completed);

        return completed;
    }
}