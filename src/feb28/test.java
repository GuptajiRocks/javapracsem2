package feb28;

class Animal{
    int age;
    Animal() {
        age = 40;
    }
    public void display() {
        System.out.println(age);
    }
}
class Mammal extends Animal{
    Mammal() {
        age = 30;
    }
}
class Cow extends Mammal{
    Cow() {
        age = 20;
    }
    public void display() {
        super.display();
        System.out.println(this.age);
    }
}
class tyre {

}
public class test {
    public static void main(String[] args) {
        Cow ob = new Cow();
        ob.display();
    }
}