public class Gleichung {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 2.0;
        double c = 1.0;
        double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}