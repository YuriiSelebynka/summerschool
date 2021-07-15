public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Rectangle r1 = new Rectangle(3,4);
        int area = r1.getArea();
        System.out.println(area);

        System.out.println(2 * Math.PI * 4);
        System.out.println(2 * Math.PI * 4 * 4);
        System.out.println(Math.PI * 4 * 4);
        System.out.println(2 * Math.PI * 4 * (4 + 4));
        System.out.println(Math.PI * 4 * 4 * 4);
    }
}
