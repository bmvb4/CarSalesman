package DR7Zad1;

public class Car {
	private String strModel;
	private Engine engine;
	private int iWeight;
	private String strColor;

	public Car() {
		this.strModel = "";
		this.strColor = "";
		this.iWeight = 0;
	}
	
	public Car(String model, Engine eng, int weight, String color) {
		this.strModel = model;
		this.engine = eng;
		this.iWeight = weight;
		this.strColor = color;
	}
	
	public String getModel() {return this.strModel;}
	public void setModel(String model) {this.strModel = model;}
	public int getWeight() {return this.iWeight;}
	public void setWeight(int weight) {this.iWeight = weight;}
	public String getColor() {return this.strColor;}
	public void setColor(String color) {this.strColor = color;}
	public Engine getEngine() {return this.engine;}
	public void setEngine(Engine eng) {this.engine = eng;}
	@Override
	public String toString() {return this.strModel+"\n"+this.engine.toString()+"\n Weight:"+((this.iWeight == 0)?"n/a":this.iWeight)+"\n Color:"+((this.strColor.isEmpty())?"n/a":this.strColor);}
}
