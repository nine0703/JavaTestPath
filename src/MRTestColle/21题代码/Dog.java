package MRTestColle.xxx;

public class Dog extends Animal implements Sports{
    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    void speak(String str) {
        System.out.println(getName() + "说：" + str);
    }

    @Override
    public void swimming() {
        System.out.println(getName() + "狗刨中");
    }
    public void goPlay(){
        String str = "我去玩了";
        speak(str);
        swimming();
    }
}   // class end.
