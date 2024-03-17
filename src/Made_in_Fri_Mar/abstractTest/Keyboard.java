package Made_in_Fri_Mar.abstractTest;

public class Keyboard implements USB{
    @Override
    public void connect() {
        System.out.println("connect!");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect!");
    }
}   // class end.
