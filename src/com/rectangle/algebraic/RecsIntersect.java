package com.rectangle.algebraic;

import java.util.HashMap;

public class RecsIntersect {
	
	//Determine Standard Form of a side and store A, B, C in a hashmap
	HashMap<Character, Float> getABCofGeneralForm(Point p1, Point p2){
		HashMap<Character, Float> ABCholder = new HashMap<Character, Float>();
		float m = (p2.y - p1.y)/(p2.x - p1.x);
		
		
		ABCholder.put('A', m);
		ABCholder.put('B', (float) -1);
		ABCholder.put('C', -m*p2.x + p2.y);
		return ABCholder;
}
	//Get Standard Form for a two sides and discover possible point of intersection
	Point getIntersectPoint(Point p1, Point p2, Point p3, Point p4) {
		HashMap<Character, Float> ABCholder1 = getABCofGeneralForm(p1, p2);
		HashMap<Character, Float> ABCholder2 = getABCofGeneralForm(p3, p4);
		float a1 = ABCholder1.get('A');
		float b1 = ABCholder1.get('B');
		float c1 = ABCholder1.get('C');
		
		
		float a2 = ABCholder2.get('A');
		float b2 = ABCholder2.get('B');
		float c2 = ABCholder2.get('C');
		
		
		float xI = (b1*c2 - b2*c1)/(a1*b2 - a2*b1);
		float yI = (a2*c1 - a1*c2)/(a1*b2 - a2*b1 );
		Point intersecPoint= new Point(xI, yI);
		
		
		return intersecPoint;
		
	}
//lines segments may or may not intersect depending on their endpoints. Get the possible points of intersection
// based on equations of the lines the segments lie on.
	public boolean sidesIntersect(Side oneSide, Side anotherSide) {
	Point PossibleIntersecPoint = getIntersectPoint(oneSide.p1, oneSide.p2, anotherSide.p1, anotherSide.p2 );
	float xCoordPIP = PossibleIntersecPoint.x;
	float yCoordPIP = PossibleIntersecPoint.y;

	   
//check if the segments intersect	
	if (xCoordPIP <= Math.max(oneSide.p1.x, oneSide.p2.x) && xCoordPIP >= Math.min(oneSide.p1.x, oneSide.p2.x) &&
	        yCoordPIP <= Math.max(oneSide.p1.y, oneSide.p2.y) && yCoordPIP >= Math.min(oneSide.p1.y, oneSide.p2.y)
	        && xCoordPIP <= Math.max(anotherSide.p1.x, anotherSide.p2.x) && xCoordPIP >= Math.min(anotherSide.p1.x, anotherSide.p2.x) 
	        && yCoordPIP <= Math.max(anotherSide.p1.y, anotherSide.p2.y) && yCoordPIP >= Math.min(anotherSide.p1.y, anotherSide.p2.y))
	    return true;
	
	return false;
	}

}