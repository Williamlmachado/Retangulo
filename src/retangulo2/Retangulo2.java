package retangulo2;

import java.util.Locale;
import java.util.Scanner;

import retangle.Retangulo;

public class Retangulo2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo x;
		x = new Retangulo();
		System.out.println("Escolha os valores dos lados A e B");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		
		double areaX = x.area();
		System.out.printf("Triangle X area: %.4f%n", areaX);
		double perimetroX = x.perimetro();
		System.out.printf("Triangle X perimetro: %.4f%n", perimetroX);
		double diagonalX = x.diagonal();
		System.out.printf("Triangle X diagonal: %.4f%n", diagonalX);
		}
}


