public class Point {

    private int x = 0;
    private int y = 0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(double x, double y) {
        return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
    }

    public double distance(Point another) {
        return Math.sqrt((another.x - x)*(another.x - x) + (another.y - y)*(another.y - y));
    }

}
