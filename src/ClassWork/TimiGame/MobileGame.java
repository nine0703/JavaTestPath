package ClassWork.TimiGame;

public class MobileGame extends Game{
    public MobileGame() {
    }

    public MobileGame(String type, String name) {
        super(type, name);
    }

    @Override
    public void play() {
        System.out.println("名称为"+name+"的"+type+"类游戏非常流行。");
    }
    private void efforts(){
        System.out.println("晚上不睡觉玩"+name);
    }
    private void damage(){
        System.out.println("导致白天上课困，毕业后找不到工作");
    }
    public void prepare(){
        efforts();
        damage();
    }

}   // class end.
