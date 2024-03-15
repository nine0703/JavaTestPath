package front.FileBehavior;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FilesMake {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        map.put("你好",1);
        map.put("你好2",1);
        System.out.println(map);
    } // method main end.

}   // class end.
