public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }
    public Circle (double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public  double getArena(){
        return this.radius*this.radius*Math.PI;
    }
    public String getColor(){
        return this.color;
    }


}
