package ClassWork.TimiGame;

public abstract class Game {
    String type ;
    String name ;
    abstract void play();

    public Game() {
    }

    public Game(String type, String name) {
        this.type = type;
        this.name = name;
    }
}   // class end.
