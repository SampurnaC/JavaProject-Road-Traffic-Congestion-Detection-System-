package projectClasses;

import java.util.Random;

public class RandPointGenerator {

	private int rx[] = new int[1000];
	private int ry[] = new int[1000];
	
	Point rp[] = new Point[1000];
	
	public void generateRandomPoints(int low, int high){
		
		Random r = new Random();
		for(int i=0;i<1000;i++){
			rx[i] = r.nextInt(high-low) + low;
			ry[i] = r.nextInt(high-low) + low;
			
			rp[i]= new Point(rx[i],ry[i]);
			//System.out.println("Random points"+(i+1)+" ("+rp[i].getX()+","+rp[i].getY()+")" );
		}
		
	}
	
}
