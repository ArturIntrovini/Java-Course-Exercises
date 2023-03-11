public class Carpet {

    private double cost = 0;

    public Carpet(double cost) {
        this.cost = cost<0 ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }

}
