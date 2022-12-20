package demo;

class DemoStatic {


    public final static String STATIC_VARIABLE = "AAAAA";

    String a;


    public static void main(String[] args) {
       String d= DemoStatic.STATIC_VARIABLE;
      // DemoStatic.STATIC_VARIABLE = "BBB";
       DemoStatic d1 = new DemoStatic();
       d1.a = "A";
       DemoStatic d2 = new DemoStatic();
        d2.a = "A";
    }

}
