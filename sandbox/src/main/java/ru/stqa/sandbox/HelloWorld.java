package ru.stqa.sandbox;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		Point p1 = new Point(2,5);
		Point p2 = new Point(7, 10);

		double distance = Point.distance(p1, p2);
		System.out.println(distance);
	}

	//public static double distance(Point point1, Point point2) {
	//    double distance = Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2));
	//    return distance;
	//}
}