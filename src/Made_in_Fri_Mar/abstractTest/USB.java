package Made_in_Fri_Mar.abstractTest;

public interface USB {
    void connect();
    void disconnect();
    default void hello(){
        System.out.println("hello");
    }
    static void helloStatic(){
        System.out.println("hello static .");
    }
}   // interface end.
