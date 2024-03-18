import java.util.Scanner;
abstract class Vegetable {
    String color;
    
    Vegetable(String color) {
        this.color = color;
    }

    abstract String getName();

    public String toString() {
        return "Color: " + color + "";
    }
}

class Potato extends Vegetable {
    String a;
    Potato(String color) {
        super(color);
    }

    String getName() {
        return "Potato";
    }
}

class Brinjal extends Vegetable {

    Brinjal(String color) {
        super(color);
    }

    String getName() {
        return "Brinjal";
    }
}

class Tomato extends Vegetable {
    
    Tomato(String color) {
        super(color);
    }

    String getName() {
        return "Tomato";
    }
}

public class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Vegetable's Name:");
        String a = sc.nextLine();
        
        Potato p =new Potato("Brown");
        Tomato t =new Tomato("Red");
        Brinjal b = new Brinjal("Purple");

        if(a.equals("Potato") || a.equals("potato")){
            System.out.println(p.toString());
        }
        
        else if(a.equals("Tomato") || a.equals("tomato")){
            System.out.println(t.toString());
        }
        
        else if(a.equals("Brinjal") || a.equals("brinjal")){
            System.out.println(b.toString());
        }
        
        else{
            System.out.println("----------Invalid Input----------");
        }



        // System.out.println("Vegetable:"+a+" "+""+b);
        // System.out.println("Vegetable:"+a+" "+""+c);
        // System.out.println("Vegetable:"+a+" "+""+d);
    }
}
