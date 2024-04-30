package apr02;
interface a1{
    int a = 20;
}
interface a2{
    int b = 800;
}
class apr021{
    void juicy() {
        interfacelearn s2 = new interfacelearn();
        System.out.println(s2.b);
    }
}
public class interfacelearn extends apr021 implements a1,a2{
    public static void main(String[] args) {
        interfacelearn s1 = new interfacelearn();
        System.out.println(s1.a);
        s1.juicy();
    }
}
