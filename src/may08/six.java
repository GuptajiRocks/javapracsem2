package may08;

public class six {
    public static String replaceSubstringSplitJoin(String original, String substring, String replacement) {
        return String.join(replacement, original.split(substring));
    }

    public static void main(String[] args) {
        String s = replaceSubstringSplitJoin("bennett university is great", "bennett university", "BU");
        System.out.println(s);
    }
    
    
}
