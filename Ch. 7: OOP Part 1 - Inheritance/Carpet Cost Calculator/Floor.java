public class Floor {

    private double length = 0;
    private double width = 0;

    public Floor(double length, double width) {
        this.length = length<0 ? 0 : length;
        this.width = width<0 ? 0 : width;
    }

    public double getArea() {
        return this.length*this.width;
    }

}
