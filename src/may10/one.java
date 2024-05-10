package may10;
import java.util.*;


public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a1 = s.split(" ");
        //System.out.println(Arrays.toString(a1));
        List<String> arr1 = Arrays.asList(a1);
        LinkedHashSet<String> s1 = new LinkedHashSet<>(arr1);
        Object[] fina = s1.toArray();
        


    }
    
}
