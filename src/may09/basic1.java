package may09;

import java.io.*;
class basic1 implements Serializable {
 int id;
 String name;
 static int count;
 basic1(int id, String name){
 this.id = id;
 this.name = name;
 count++;
 }
 void display(){
 System.out.println("Created object name-"+this.name+
 " id-"+this.id);
 System.out.println("Objects no.-"+count);
 }
 static int area(int n){
 System.out.println("square-"+n*n);
 return n*n;
 }
 static int area(int n, int o){
 System.out.println("rectangle-"+n*o);
 return n*o;
 }
 static double area(double n, double o){
 System.out.println("triangle-"+0.5*n*o);
 return 0.5*n*o;
 }
 static void area(double n){
 System.out.println("circle-"+3.14*n*n);
 }
 public static void main(String[] args) {
 basic1 obj = new basic1(123,"mine");
 obj.display();
 /*System.out.println(area(obj.id));
 System.out.println(area(obj.id,obj.id));
 System.out.println(area((float)obj.id,(float)obj.id));
 area((long)obj.id);*/
 try {
 obj.file_io(obj);
 }
 catch(IOException e) {
 e.printStackTrace();
 }
 }
 void file_io(basic1 obj) throws IOException {
 File file = new File("curr.dat");
 FileOutputStream fileStream1 = new FileOutputStream(file);
 ObjectOutputStream objStream1 = new 
ObjectOutputStream(fileStream1);
 obj.id++;
 objStream1.writeObject(obj);
 objStream1.close();
 FileInputStream fileStream2 = new FileInputStream(file);
 ObjectInputStream objStream2 = new ObjectInputStream(fileStream2);
 //Object new_obj = objStream2.readObject();
 try{
 Object new_obj = objStream2.readObject();
 //new_obj.display();
 basic1 obj2 = (basic1) new_obj;
 obj2.display();
 }
 catch(Exception e){
 e.printStackTrace();
 }
 objStream2.close();
 }
}