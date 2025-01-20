class Triangle {
    public void display() {
        System.out.println("I am a Triangle ");
    }
}
class isoscales extends Triangle{
    public void displayIsoscales(){
        System.out.println("I am an Isoscales Triangle ");
    }
}
class equilateral extends isoscales{
    public void displayequilateral(){
        System.out.println("I am an equilateral Triangle ");
    }
}

public class Day69{
    public static void main(String[] args) {
        equilateral eq = new equilateral();
        eq.displayequilateral();
        eq.displayIsoscales();
        eq.display();
    }
}