package sprint;

import java.util.List;

public class ListManipulator {
    public List<String> manipulateList(List<String> list) {
        if (list.isEmpty()) {
            list.add("first");
            //list.add("The size of the list is "+0);
            return list;
        } else if (list.size()<2){
            //list.add("The size of the list is "+list.size());
            list.set(0,"first");
            return list;
        }
        //list.removeLast();
        list.remove(list.size()-1);
        String last = "The size of the list is "+list.size();
        list.set(list.size()-1,last);
        list.add(list.size(),"last");
        list.set(0,"first");
        //List<String> result = list;
        return list;
    }
}
