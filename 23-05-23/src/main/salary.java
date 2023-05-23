package main;

import java.util.Scanner;

public class salary {
	Scanner sc = new Scanner(System.in);

	private double basic;
	private double gross;
	private double da = 2000;
	private double pf = 5000;
	private double net;

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getGross() {
		return gross;
	}

	public void setGross(double gross) {
		this.gross = this.basic + this.da;
	}

	public double getNet() {
		return net;
	}

	public void setNet(double net) {
		this.net = this.gross - this.pf;
	}

	public void basic(double amount) {
		setBasic(amount);
	}

	public void net() {
		setGross(this.basic);
		setNet(this.gross);
		System.out.println("Net Salary: " + this.net);
	}
}
