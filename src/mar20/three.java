package mar20;
interface ones{
    int i = 222;
    interface onetwo{
        int i = ones.i+ones.i;
        interface onetwothree{
            int i = onetwo.i+onetwo.i;
        }
    }
}
public class three {
    public static void main(String[] args) {
        System.out.println(ones.onetwo.onetwothree.i);
    }

}
