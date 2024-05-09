package apr10;
class laudekaexception extends Exception {
    public laudekaexception(String message) {
        super(message);
    }
}
class whywhy{
    private int id;
    private String name;
    public void set_id(int i) {
        this.id = i;
        System.out.println(id+name);
    }
}
public class two {
    public static void main(String[] args) {
        try {
            throw new laudekaexception("Why this juicy pussy?");
        } catch (laudekaexception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Why?");
    }
}
