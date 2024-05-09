package may08;

public class five {
    public static String replaceSubstring(String original, String substring, String replacement) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < original.length(); i++) {
          if (i + substring.length() <= original.length() && 
              original.substring(i, i + substring.length()).equals(substring)) {
            sb.append(replacement);
            i += substring.length() - 1; // Adjust index to skip the matched substring
          } else {
            sb.append(original.charAt(i));
          }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String fin = replaceSubstring("abababa", "aba", "a");
        System.out.println(fin);

    }
      
    
}
