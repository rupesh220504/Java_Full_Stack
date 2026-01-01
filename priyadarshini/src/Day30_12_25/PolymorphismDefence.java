package Day30_12_25;


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

public class PolymorphismDefence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duty(new Army());
		duty(new Navy());
		duty(new AirForce());

	}
	static void duty(SecurityForce s) {		
		s.job();
		s.protect();
	}
	}


