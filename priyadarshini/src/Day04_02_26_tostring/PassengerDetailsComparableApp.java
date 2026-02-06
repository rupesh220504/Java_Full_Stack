package Day04_02_26_tostring;

import java.util.ArrayList;
import java.util.Collections;

public class PassengerDetailsComparableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassangerDetails p = new PassangerDetails(101,"Rupesh","Delhi","Mumbai","Plane");
		PassangerDetails p1 = new PassangerDetails(102,"Suraj","Kolakata","Patna","Train");
		PassangerDetails p2 = new PassangerDetails(103,"Pankaj","Jaipur","Ranchi","Bus");
		
		ArrayList al = new ArrayList();
		al.add(p1);
		al.add(p2);
		al.add(p);
		
		Collections.sort(al);
        System.out.println(al);
		
	}

}

class PassangerDetails implements Comparable{
	int id;
	String name;
	String journeyFrom;
	String journeyTo;
	String travellingMedium;
	public PassangerDetails(int id, String name, String journeyFrom, String journeyTo, String travellingMedium) {
		super();
		this.id = id;
		this.name = name;
		this.journeyFrom = journeyFrom;
		this.journeyTo = journeyTo;
		this.travellingMedium = travellingMedium;
	}
	
	@Override
	public String toString() {
		return "PassangerDetails [id=" + id + ", name=" + name + ", journeyFrom=" + journeyFrom + ", journeyTo="
				+ journeyTo + ", travellingMedium=" + travellingMedium + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJourneyFrom() {
		return journeyFrom;
	}
	public void setJourneyFrom(String journeyFrom) {
		this.journeyFrom = journeyFrom;
	}
	public String getJourneyTo() {
		return journeyTo;
	}
	public void setJourneyTo(String journeyTo) {
		this.journeyTo = journeyTo;
	}
	public String getTravellingMedium() {
		return travellingMedium;
	}
	public void setTravellingMedium(String travellingMedium) {
		this.travellingMedium = travellingMedium;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this.id>(((PassangerDetails)(o)).id)) {
			return 1;
		}
		return -1;
	}
	
}
