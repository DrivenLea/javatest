package 面向对象;

public class TestPassObject {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		CircleWithPrivateDataFields myCircle =
				new CircleWithPrivateDataFields(1);
		
		int n =5;
		PrintAreas(myCircle,n);
		
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n );

	}
	
	public static void PrintAreas(
			CircleWithPrivateDataFields c, int times) {
		System.out.println("Radius \t\tArea");
		
		while(times >= 1) {
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
		
	}

}
