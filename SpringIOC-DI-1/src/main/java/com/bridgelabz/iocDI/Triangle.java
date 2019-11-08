package com.bridgelabz.iocDI;

import java.util.List;

public class Triangle {

	List<Point> points;

	/**
	 * @return the points
	 */
	public List<Point> getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	void show()
	{
		for(Point r:points)
		{
			System.out.println(r.getX()+ "  "+ r.getY());
		}
	}
}
