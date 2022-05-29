package com.chapter_6;

public class Point {
	private final int x;
	private final int y;
	
	Point(final int x, final int y){
		this.x = x;
		this.y = y;
	}
	
	int getX() {
		return x;
	}
	
	int getY() {
		return y;
	}
	
	@Override
	public boolean equals(final Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		
		final Point point = (Point) o;
		
		if(x != point.x) return false;
		return y == point.y;
	}
	
	@Override
	public int hashCode() {
		int result = x;
		result = 31 * result + y;
		return result;
	}
	
	final static Point p1 = new Point(1, 2);
	final static Point p2 = new Point(1, 2);
	
	public static void main(String[] args) {
		System.out.println(p1.equals(p2));	  //true
		System.out.println(p1 == p2);        //false
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
	
}
