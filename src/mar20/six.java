package mar20;

import org.w3c.dom.ls.LSOutput;

//Instance initializer
//interface A{
//    {
//        System.out.println("Hi");
//    }
//    static{
//        System.out.println("WHy?");
//    }
//}
class poison{
    interface sik{
        int i = 45;
    }
}
public class six {
    public static void main(String[] args) {
        System.out.println(poison.sik.i);
    }
}
