package front.Demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"nihao","heloo","你好","n你噶那么！~");
        List<String> newList = list.stream()
                .filter(s->(s.length()>4 && s.startsWith("n")))
                .toList();
        System.out.println(newList);
        Stream fileStream = (Stream) list.stream();



    }   //  method main end.

}   // class end.
