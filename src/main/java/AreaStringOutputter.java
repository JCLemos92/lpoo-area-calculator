public class AreaStringOutputter {
  private SumProvider agregator;

  public AreaStringOutputter(SumProvider agregator) {
	this.agregator = agregator;
  }

  public String output() {
	return "Sum of areas: " + agregator.sum();
  }
}
