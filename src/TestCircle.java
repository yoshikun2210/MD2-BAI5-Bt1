public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(15.5);
        System.out.println("bán kính đường tròn 1 :" + circle1.getRadius());
        System.out.println("diện tích đường tròn 1:" + circle1.getArena());
        System.out.println("bán kính đường tròn 2 :" + circle2.getRadius());
        System.out.println("diện tích đường tròn 2 :" + circle2.getArena());
        System.out.println("color2 :" + circle2.getColor());

    }

}
