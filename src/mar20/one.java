package mar20;
abstract class AbstractClass
{
    protected abstract int abstractMethod();
}
class one extends AbstractClass{
    protected int abstractMethod(){
        return 1;
    }
    public static void main(String[] args)
    {
        one t=new one();
        System.out.println(t.abstractMethod());
    }
}
