package com.rectangle.algebraic;

public class RecsIntersecDriver {
	
	public static void main(String[] args) {
		RecsIntersect verifyIntersect = new RecsIntersect();
		
		
		Point pt1 = new Point(39,2);
		Point pt2 = new Point(52,25);
		Point pt3 = new Point(39,32);
		Point pt4 = new Point(26,10);

		Point pnt1 = new Point(48,5);
		Point pnt2 = new Point(53,13);
		Point pnt3 = new Point(35,23);
		Point pnt4 = new Point(30,15);
		
		
		
		Side side_1 = new Side(pt1, pt2);
		Side side_2 = new Side(pt2,pt3);
		Side side_3 = new Side(pt3, pt4);
		Side side_4 = new Side(pt4, pt1);
		
		Side sideOne = new Side(pnt1, pnt2);
		Side sideTwo = new Side(pnt2, pnt3);
		Side sideThree = new Side(pnt3, pnt4);
		Side sideFour = new Side(pnt4, pnt1);
		
		Rectangle rectangleA = new Rectangle(side_1, side_2, side_3, side_4);
		Rectangle rectangleB = new Rectangle(sideOne, sideTwo, sideThree, sideFour);
		
		Side [] Asides = {side_1, side_2, side_3, side_4};
		Side [] Bsides = {sideOne, sideTwo, sideThree, sideFour};
		
		System.out.println("Points of Intersection are: ");
		for (int i = 0; i < Asides.length; i++)
			for (int j = 0; j < Bsides.length; j++)
				if (verifyIntersect.sidesIntersect(Asides[i], Bsides[j])) {
				System.out.println("rectangle A side " + (i + 1) + " rectangle B side " + (j + 1) + ":" );
				System.out.println("x = " + verifyIntersect.getIntersectPoint(Asides[i].p1, Asides[i].p2, Bsides[j].p1, Bsides[j].p2).x);
				System.out.println("y = " + verifyIntersect.getIntersectPoint(Asides[i].p1, Asides[i].p2, Bsides[j].p1, Bsides[j].p2).y);
				}
		
	
			
			
		
		
		//System.out.println(verifyIntersect.sidesIntersect(rectangleA.side2, rectangleB.side2));
		
		
		
		
		//System.out.println(calcABC.getIntersectPoint(pt1, pt2, pt3, pt4).x + " " + calcABC.getIntersectPoint(pt1, pt2, pt3, pt4).y);
	}
	
	

}
//vanilla for pitchbook not working
//Point pt1 = new Point(3,2);
//Point pt2 = new Point(8,2);
//Point pt3 = new Point(8,6);
//Point pt4 = new Point(3,6);
//
//Point pnt1 = new Point(4,3);
//Point pnt2 = new Point(7,3);
//Point pnt3 = new Point(7,8);
//Point pnt4 = new Point(4,8);

//REctangles for pitch book:
//Point pt1 = new Point(39,2);
//Point pt2 = new Point(52,25);
//Point pt3 = new Point(39,32);
//Point pt4 = new Point(26,10);
//
//Point pnt1 = new Point(48,5);
//Point pnt2 = new Point(53,13);
//Point pnt3 = new Point(35,23);
//Point pnt4 = new Point(30,15);

//Point pt1 = new Point(15,10);
//Point pt2 = new Point(49,25);
//Point pt3 = new Point(29,5);
//Point pt4 = new Point(32,32);

//Point pt1 = new Point(0, 0);
//Point pt2 = new Point(2, 2);
//Point pt3 = new Point(0,2);
//Point pt4 = new Point(4, 2);

//Point pt1 = new Point(15, -5);
//Point pt2 = new Point(30, 35);
//Point pt3 = new Point(-5,15);
//Point pt4 = new Point(20, 20);