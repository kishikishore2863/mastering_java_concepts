package DSA;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        sub("","kis",list);
        sub("","abc",list1);
        System.out.println(list);
        System.out.println(list1);

    }

    private static void sub(String process ,String unProcess,List<String> list){
        if(unProcess.isEmpty()){
            list.add(process);
            return;
        }

        sub(process+unProcess.charAt(0),unProcess.substring(1),list);
        sub(process,unProcess.substring(1),list);
    }
}
