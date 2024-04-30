package aaaaleetcode;
public class prob1768 {
    public static String mergeAlt(String w1, String w2) {
        String s = "";
        if (w1.length() >= w2.length()) {
            int i = 0;
            for (i =0; i < w2.length(); i++) {
                s = s + w1.charAt(i);
                s = s + w2.charAt(i);
            }
            for(int j = i; j<w1.length();j++) {
                s = s+w1.charAt(j);
            }
        } else{
            int i = 0;
            for (i =0; i < w1.length(); i++) {
                s = s + w1.charAt(i);
                s = s + w2.charAt(i);
            }
            for(int j = i; j<w2.length();j++) {
                s = s+w2.charAt(j);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s = mergeAlt("ab", "pqrs");
        System.out.println(s);
    }
}
