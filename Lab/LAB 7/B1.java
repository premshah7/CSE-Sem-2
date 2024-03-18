interface A{
    int a=10;
    public void print_a();
}
interface A1 extends A{
    int b = 20;
    public void print_b();
}

interface A2 extends A {    
    int c = 30;
    public void print_c();
}

interface A12 extends A1,A2{
    int d = 30;
    public void print_d();
}
class B implements A12{

    
    public void print_a(){
        System.out.println("a="+a);
    }

    public void print_b(){
        System.out.println("b="+b);
    }

    public void print_c(){
        System.out.println("c="+c);
    }

    public void print_d(){
        System.out.println("d="+d);
    }
    
}

public class B1{
    public static void main(String[] args) {
        B a=new B();
        a.print_a();
        a.print_b();
        a.print_c();
        a.print_d();

    }
}
