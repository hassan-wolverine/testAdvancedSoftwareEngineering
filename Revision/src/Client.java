import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		// get aread of a rectangle
		IArea r = new Rectangle(3, 4);
		System.out.println(r.getArea());
		// get aread of a square
		r = new Square(5);
		System.out.println(r.getArea());

		ArrayList<Shape> l = new ArrayList<>();
		l.add(new Rectangle(3, 4));
		l.add(new Square(5));
		for (Shape shape : l) {
			System.out.println(shape.getCircumference());
		}

	}
}
