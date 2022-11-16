//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package code;

import java.awt.geom.Point2D;

public class Coordinates extends Point2D {
	private double x;
	private double y;

	public Coordinates(double x, double y) {
		this.setLocation(x, y);
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public void setLocation(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public int manhattanDistance(Coordinates c)
	{
		return (int) ((this.getX() - c.getX()) + (this.getY() - c.getY()));
	}
}
