package projectClasses;

public class PointInsideLocalSpace {
	
	
	Area a = new Area();
	
	Point p1,p2,p3,p4;
	public boolean check( Point p,Point x1,Point x2, Point x3, Point x4){   
		Point pxy = p;
		this.p1=x1;
		this.p2=x2;
		this.p3=x3;
		this.p4=x4;
	    double trinagle1Area = a.areaOfTriangle(p1, p2, pxy);
	    double trinagle2Area = a.areaOfTriangle(p2, p3, pxy);
	    double trinagle3Area = a.areaOfTriangle(p3, p4, pxy);
	    double trinagle4Area = a.areaOfTriangle(p4, p1, pxy);

	    double rectArea = a.areaOfRectangle(p1, p2, p3, p4);

	    double triangleAreaSum = (trinagle1Area+trinagle2Area+trinagle3Area+trinagle4Area);

	    if(triangleAreaSum%(Math.pow(10, 30))>=0.999999999999999999999999999999999)
	    {
	        triangleAreaSum = Math.ceil(triangleAreaSum);
	    }

	    if(triangleAreaSum==rectArea)
	        return true;
	    else
	        return false;
	}
	
}


