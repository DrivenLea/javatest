package 面向对象;

public class TestCircleWithPrivateDataFields {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CircleWithPrivateDataFields myCircle =
				new CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius " + 
				myCircle.getRadius() + " is " + myCircle.getArea() );
		
		myCircle.setRadius(myCircle.getRadius() * 1.1 );
		
		System.out.println("The area of the circle of radius " + 
				myCircle.getRadius() + " is " + myCircle.getArea() );
		
		System.out.println("The number of objects craeted is " + 
				CircleWithPrivateDataFields.getNumberOfObjects() );
		
	}

}
