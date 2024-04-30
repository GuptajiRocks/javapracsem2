package apr29;

//import java.lang.foreign.MemorySegment;

public class one {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        //System.out.println(MemorySegment.ofAddress(i1));
        System.out.println(i1 == i2);
    }
}

