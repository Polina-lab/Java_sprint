package sprint;

import java.util.Iterator;
import java.util.List;

public class CustomIterator implements Iterator<Integer> {
    private List<Integer> nums;
    private int index;
    public CustomIterator(List<Integer> numbers){
        index=0;
        nums = numbers;
    }

    @Override
    public boolean hasNext() {
        return index < nums.size();
    }

    @Override
    public Integer next() {
        int num = nums.get(index);
        index++;
        return num;
    }
    
}
