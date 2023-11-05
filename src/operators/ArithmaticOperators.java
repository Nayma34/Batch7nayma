package operators;

public class ArithmaticOperators {
    // +, -, *, /
    //  // in java = means assign, = = means equal

    public void arithmatic (){
      int a = 30;
      int b= 60;
      int c= a+b;
      int d= c;
      int e= d;
      int f= b-a;
      int g= a*b;
      System.out.println(g);
      int h= b/a;
    }

    public static void newArithmatic (int a, int b) { // parameter
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

    }

    public static void main(String[] args) {
        ArithmaticOperators obj= new ArithmaticOperators(); // instantiated the class/ created an object of the class
        obj.arithmatic();
        newArithmatic(30,60); // argument
        System.out.println("---------------------");
        newArithmatic(20,40);
        System.out.println("---------------------");
        newArithmatic(50,100);
        System.out.println("---------------------");
    }



}

