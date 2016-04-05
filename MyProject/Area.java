package projectClasses;

public class Area {

	private double side1,side2,side3,length,bredth,area,semi_perimeter;
	public double areaOfTriangle(Point pa , Point pb, Point pxy)
	{
		side1 = Math.sqrt(Math.pow(Math.abs(pa.getY()-pb.getY()),2) + Math.pow(Math.abs(pa.getX()-pb.getX()),2));
	   	side2 = Math.sqrt(Math.pow(Math.abs(pa.getY()-pxy.getY()),2) + Math.pow(Math.abs(pa.getX()-pxy.getX()),2));
	    side3 = Math.sqrt(Math.pow(Math.abs(pb.getY()-pxy.getY()),2) + Math.pow(Math.abs(pb.getX()-pxy.getX()),2));

	    semi_perimeter = (side1+side2+side3)/2;

	    area = Math.sqrt(semi_perimeter*(semi_perimeter-side1)*(semi_perimeter-side2)*(semi_perimeter-side3));

	    return area;
	}
	
	public double areaOfRectangle(Point p1,Point p2,Point p3,Point p4)
	{

	   length = Math.sqrt(Math.pow(Math.abs(p1.getY()-p2.getY()),2) + Math.pow(Math.abs(p1.getX()-p2.getX()),2));
	   bredth = Math.sqrt(Math.pow(Math.abs(p2.getY()-p3.getY()),2) + Math.pow(Math.abs(p2.getX()-p3.getX()),2));

	   area = length*bredth;

	    return area;

	}
}
