public class OperatorsDemo 
{

    void add(int a, int b)
    {
        int sum = a + b;
        System.out.println("Addition:" + sum);
    }

    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Arithmetic Promotion
        byte a = 10, b = 20;
        int result = a + b; // Promotion to int
        System.out.println("Arithmetic Promotion Result: " + result);
// Operators
        int x = 30, y = 20;
        System.out.println("x+y=" + (x + y));
        System.out.println("x-y=" + (x - y));
        System.out.println("x*y=" + (x * y));
        System.out.println("x/y=" + (x / y));
        System.out.println("x%y=" + (x % y));

        // Object Creation and Method Calling
        OperatorsDemo obj = new OperatorsDemo();
        
        // Corrected: Remove the "a:" and "b:" editor hints
        obj.add(5, 7); 
        
        // Corrected: Remove the "a:" and "b:" editor hints
        int product = obj.multiply(4, 6); 
        System.out.println("Multiplication:" + product);
    }
}    
