package mar03;
class Animal {
    int age;
    Animal(int a) {
        this.age = a;
    }

    void display() {
        System.out.println(age);
    }
}

class cow extends Animal{
    int ms;
    cow(int a) {
        super(a);
        this.ms = a;
    }
}
public class one {
    public static void main(String[] args) {
        cow s1 = new cow(40);
        s1.display();
    }
}
