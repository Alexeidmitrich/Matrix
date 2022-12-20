package firstpackage;

public class DemoClass{

    //Object
    int x;

    public static void main(String[] args) {
        DemoClass c = new DemoClass();
        c.x = 5;
        System.out.println(c);
    }

    @Override
    public String toString() {
        return "x = " + x;
    }
}


