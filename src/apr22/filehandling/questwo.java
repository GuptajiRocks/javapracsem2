package apr22.filehandling;

import java.io.File;

public class questwo {
    public static void main(String[] args) {
        File f1 = new File("D:\\Bennett University\\Sem 2\\Projects\\Java CA\\javacontinuous\\src\\apr22\\filehandling\\3.txt");
        long bytelen = new File("D:\\Bennett University\\Sem 2\\Projects\\Java CA\\javacontinuous\\src\\apr22\\filehandling\\3.txt").length();
        System.out.println("File size is bytes is: "+bytelen);
        System.out.println("File size in KiloBytes is: "+(bytelen/1024));
        System.out.println("File size in MegaBytes is: "+((float)(bytelen/1024)/1024));
    }
}
