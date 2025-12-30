package Day29_12_25;

class SecurityForce {
	void job() {
		System.out.println("To Protect Nation");
	}
    void protect() {
        System.out.println("Protect -- Security Force");
    }
}
class Army extends SecurityForce {
   
    void protect() {
        System.out.println("Protect -- Army");
    }

    void useTank() {
        System.out.println("Use Tank");
    }
}
class Navy extends SecurityForce {
   
    void protect() {
        System.out.println("Protect -- Navy");
    }

    void useShips() {
        System.out.println("Use Ships");
    }
}
class AirForce extends SecurityForce {
    
    void protect() {
        System.out.println("Protect -- AirForce");
    }

    void useJets() {
        System.out.println("Use Jets");
    }
}
public class ArmyApp {
    public static void main(String[] args) {
    	
    	Army a = new Army();
    	Navy n = new Navy();
    	AirForce af = new AirForce();
    	System.out.println("-----------Army-------------");
    	a.job();
    	a.protect();
    	a.useTank();
    	
    	System.out.println("-----------Navy-------------");
    	a.job();
    	n.protect();
    	n.useShips();
    	
    	System.out.println("-----------Airforce-------------");
    	a.job();
    	af.protect();
    	af.useJets();
    	

   
    }
}

