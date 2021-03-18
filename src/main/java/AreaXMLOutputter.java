public class AreaXMLOutputter {
  private SumProvider aggregator;

  public AreaXMLOutputter(SumProvider areaAggregator) {
	this.aggregator = areaAggregator;
  }

  public String outputXML(){
    return "<area>" + aggregator.sum() + "</area>";
  }
}
