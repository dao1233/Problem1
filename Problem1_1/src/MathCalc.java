
public class MathCalc {
	float radius;
	public MathCalc(float diameter) {
		radius = diameter/2;
	}
	public double Volume() {
		double volume;
		volume = (float) (4*Math.PI*(Math.pow(radius, 3)))/3;
		return volume;
	}
	public static void main(String[] args){ 
//		double radius = 0.0;
//		double circleArea = 100.0;
//		int feet = 0;
//		int inches = 0;
//		radius = Math.sqrt(circleArea/Math.PI);
//		feet = (int)Math.floor(radius);
//		inches = (int)Math.round(12.0*(radius - feet));
//		System.out.println("The radius of a circle with area " + circleArea + " square feet is\n " + feet + " feet " + inches + " inches"); 
		MathCalc Earth = new MathCalc(7600);
		System.out.println("The volume of the Earth is " + Earth.Volume() + " cubic miles");
		MathCalc Sun = new MathCalc(865000);
		System.out.println("The volume of the Sun is " + Sun.Volume() + " cubic miles");
		System.out.println("the ratio of the volume of the Sun to the volume of the Earth is " + Sun.Volume()/Earth.Volume());
	}
}
