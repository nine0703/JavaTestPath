package testdaima;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException, IllegalAccessException {
        Student s = new Student();
        Teacher t = new Teacher();
        Worker w = new Worker();
        test(s);
        test(t);
        test(w);

    }   // Method main end.
    public static void test(Object obj) throws FileNotFoundException, IllegalAccessException {
        Class<?> clazz = obj.getClass();
        try (PrintStream ps = new PrintStream(new FileOutputStream("src/testdaima/data.txt",true))) {
            ps.println("========" + clazz.getSimpleName() + "========");
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                declaredField.setAccessible(true);
                ps.println(declaredField.getName() + " " + declaredField.get(obj));
            }
        }

    }
}   // Class end.
