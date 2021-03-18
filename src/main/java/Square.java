public class Square implements AreaShape{
  private double Side;

  public Square(double side) {
    Side = side;
  }

  public void setSide(double side) {
	Side = side;
  }

  public double getSide() {
    return this.Side;
  }

  @Override
  public double getArea() {
    return Math.pow(this.getSide(), 2);
  }

  @Override
  public void draw() {
    System.out.println("Square");
  }
}
