package sprint;

import java.util.ArrayList;

public class Combinations {
    public ArrayList<String> combN(int num){
        ArrayList<String> result=new ArrayList<>();
        if (num<=0){
            return result;
        }

        genComb("", 0, num, result);

        return result;
    }

    private void genComb(String current, int start, int n, ArrayList<String> arr){
        if (current.length() == n) {
            arr.add(current);
            return;
        }
        for (int i = start; i <= 9; i++) {
            genComb(current + i, i + 1, n, arr);
        }
    }
}
