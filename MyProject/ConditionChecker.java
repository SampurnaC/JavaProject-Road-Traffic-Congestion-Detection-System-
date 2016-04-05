package projectClasses;

public class ConditionChecker {

	Point p1,p2,p3,p4;

	public boolean countChecker(String space) {
		String lclSpace= space;
		PointInsideLocalSpace pir = new PointInsideLocalSpace();
		int threshold = 0;
		
		
		switch(lclSpace){
		case "localspace1":
			this.p1 = new Point(1,1);
			this.p2 = new Point(1,10);
			this.p3 = new Point(10,10);
			this.p4 = new Point(10,1);
			threshold=8;
			break;
		case "localspace2":
			this.p1 = new Point(20,80);
			this.p2 = new Point(20,90);
			this.p3 = new Point(80,90);
			this.p4 = new Point(80,80);
			threshold=39;
			break;
		case "localspace3":
			this.p1 = new Point(83,82);
			this.p2 = new Point(83,85);
			this.p3 = new Point(85,82);
			this.p4 = new Point(85,79);
			threshold=5;
			break;
		case "localspace4":
			this.p1 = new Point(28,30);
			this.p2 = new Point(32,33);
			this.p3 = new Point(34,29);
			this.p4 = new Point(30,26);
			threshold=4;
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		    	
	
		
		    	int count = 0;
		    	RandPointGenerator rpg = new RandPointGenerator();
		    	rpg.generateRandomPoints(1,100);
		    	for(int j=0 ; j<1000;j++){
		        Point p = new Point(rpg.rp[j].getX(),rpg.rp[j].getY());
		 
		         if(pir.check(p,p1,p2,p3,p4)) 
		        	 count++;
		    	}
		  
		    	if(count>=threshold){
		    		return true;
		    		//return ("Congestion Detected on"+lclSpace) ;
		    	
		    	}
		    	else{
		    		//return ("No Congestion on"+lclSpace);
		    		return false;
		    	}
		 	
		    
		}
}
