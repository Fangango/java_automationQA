package ru.stqa.sandbox;

public class App {
	
	public static void main(String[] args) {
		
		Point p1 = new Point(2,2);
		Point p2 = new Point(4, 4);
		Square s = new Square(5);
		Rectangle r = new Rectangle(5, 5);

		System.out.println(Point.distance(p1, p2));
		System.out.println(s.area());
		System.out.println(r.area());
	}

	//public static double distance(Point point1, Point point2) {
	//    double distance = Math.sqrt(Math.pow((point2.x - point1.x), 2) + Math.pow((point2.y - point1.y), 2));
	//    return distance;
	//}
}