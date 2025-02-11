public class Gleichung {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 1.0;

        // Read a, b and c from buffer
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);

        if ( a == 0) {
            double x = -c / b;

            System.out.println("x = " + x);
        } else if (b*b == 4*a*c) {
            double x = -b / (2 * a);

            System.out.println("x = " + x);            
        } else {
            double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);    
        }
        
    }
}
