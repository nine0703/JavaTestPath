package MRTestColle.xxx;

public abstract class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    abstract void speak(String str);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}   // class end.
