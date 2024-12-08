package Encapsulation;

class First {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class SetterAndGetter {
    public static void main(String[] args) {
        First obj = new First();
        obj.setId(65);
        // obj.setName("Shorya Rastogi");
        // int stuId = obj.getId();
        // String sruName = obj.getName();
        System.out.println(obj.getId());
    }
}
