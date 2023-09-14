package labsheet4;

public class Manager {
    protected int id;
    protected String name;  

    public void display(){
        System.out.println("i am a manager");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
