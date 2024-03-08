import java.text.SimpleDateFormat;
import java.util.Locale;

public class UpdateTimeMachine {
    public static void main(String[] args) {
        String s = "Update ";
        SimpleDateFormat sdf = new SimpleDateFormat("EE MMM dd ⏱ HH:mm <z> yyyy", Locale.ENGLISH);
        long time = System.currentTimeMillis();
        s += sdf.format(time);
        System.out.println(s);


    }   //  method main end.

}   // class end.
