package apr01;
import java.util.PriorityQueue;

public class two {
    public static void main(String[] args) {
        PriorityQueue<Integer> qu = new PriorityQueue<>();
        qu.add(43);
        qu.add(787);
        System.out.println(qu);
        qu.poll();
        System.out.println(qu);
    }
}
