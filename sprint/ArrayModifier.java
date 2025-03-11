package sprint;
import java.util.List;

public class ArrayModifier {
    public static List<Double> removeElementsBetween(List<Double> list, int index1, int index2) {
        System.out.println(index1+" "+index2);
        if (index1>index2) {
            int temp = index1;
            index1=index2;
            index2=temp;
        }
        if (index1==index2&&index1>0){
            if (index1>list.size()){
                index1 = Math.min(list.size(), index1);
                index2 = Math.min(list.size(), index2);
            }
            return list;
        } else {
            if (index1<0) index1 = Math.max(0, index1);
            if (index2>list.size()) index2 = Math.min(list.size(), index2);
            list.subList(index1, index2).clear();
            return list;
        }
        
        
    }
}
