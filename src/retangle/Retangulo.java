package retangle;

public class Retangulo {
	public double a;
	public double b;
	
	public double area(){
		double p = a * b;
		return p;
	}
	public double perimetro(){
		double x = (2*a)+(2*b);
		return x;
	}
	public double diagonal(){
		double D = Math.sqrt((2*a)+(2*b));
		return D;
	}
}
