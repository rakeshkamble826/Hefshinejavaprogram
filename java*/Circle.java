package Constructor;

public class Circle {

	float pi=3.5f;
	
	float Circlearea(float radius)
	{
		float area=radius*radius*pi;
		return area;
	}
	float circumference (float radius)
	{
		float circumference=2*pi*radius;
		return circumference;
	}
}
