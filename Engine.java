package DR7Zad1;

class Engine {
	private String strModel;
	private int iPower;
	private int iDisplacement;
	private char cEfficiency;
	
	public Engine() {
		this.strModel = "";
		this.iPower = 0;
		this.iDisplacement = 0;
	}
	public Engine(String model,int power,int displacement, char efficiency) {
		this.strModel = model;
		this.iPower = power;
		this.iDisplacement = displacement;
		this.cEfficiency = efficiency;
	}
	public int getDisplacement() {return this.iDisplacement;}
	public void setDisplacement(int displacement) {this.iDisplacement = displacement;}
	public int getPower() {return this.iPower;}
	public void setPower(int power) {this.iPower = power;}
	public String getModel() {return this.strModel;}
	public void setModel(String model) {this.strModel = model;}
	public char getEfficiency() {return this.cEfficiency;}
	public void setEfficiency(char efficiency) {this.cEfficiency = efficiency;}
	@Override
	public String toString() {return " "+this.strModel+"\n  Power:"+this.iPower+"\n  Displacement:"+((this.iDisplacement == 0)?"n/a":this.iDisplacement)+"\n  Efficiency:"+((this.cEfficiency == '\0')?"n/a":this.cEfficiency); }
}
