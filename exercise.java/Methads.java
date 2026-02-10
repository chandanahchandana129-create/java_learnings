import java.util.Scanner;
class Example1 {    
    void add ( int a, int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.add(10,20);
    
    }

}

class Example3 {
    int getNumber() {
        return 10;
    }
    public static void main(String[] args){
    Example3 obj = new Example3();
    int result = obj.getNumber();
    System.out.println(result);
    
    }
}

class Example6 {
    void greet(String name) {
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scn.nextLine();
        Example6 obj = new Example6();
        obj.greet(name);

    }
}