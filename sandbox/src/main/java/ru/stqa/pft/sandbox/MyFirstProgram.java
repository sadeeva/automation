package ru.stqa.pft.sandbox;

import java.awt.*;

public class MyFirstProgram {

	public static void main(String[] args) {

		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

		Point p = new Point(3,6,-4,0);
		System.out.println( "Расстояние между точками = " + p.distance());


	}




}
