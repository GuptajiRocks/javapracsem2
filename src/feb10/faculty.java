package feb10;

public class faculty {
    int i = 0;
    int[] m1 = new int[5];
    String name;
    faculty(String nm) {
        this.name = nm;
    }

    void enter_marks(String name, int marks) {
        m1[i] = marks;
        ++i;
    }


}
