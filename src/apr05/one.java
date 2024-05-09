package apr05;

//Levels of abstraction
//Access modifier
//public, private, protected, (default) - to be checked
interface s1 {
    int a2 = 34;
    public abstract void billi();
}
//class why implements s1{
//    void billi() {
//    }
//
//}
interface s2 extends s1 {
    abstract void billi();
    int a22 = 54;
}
abstract class juicy implements s2 {
    public int getS() {
        return s;
    }
    int s = s1.a2;
    abstract void cutie();
    void billo() {
        System.out.println();
    }
}
public class one extends juicy {
    public static void main(String[] args) {
        one ss = new one();
        System.out.println(ss.s);
        System.out.println(s1.a2);
    }
    void cutie() {
    }
    @Override
    public void billi() {

    }
}
//Programming Design Pattern
//Encapsulation, Inheritance, Abstraction, Polymorphism
//MSP - Method Substitution Principle
//Interface segregation principle
//Principles of Software Development - Code sharing, Re-utilising, Substitution

