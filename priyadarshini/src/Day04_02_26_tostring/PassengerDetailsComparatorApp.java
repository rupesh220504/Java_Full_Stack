package Day04_02_26_tostring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PassengerDetailsComparatorApp {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		PassangerDetails1 p = new PassangerDetails1(101,"Rupesh","Delhi","Mumbai","Plane");
		PassangerDetails1 p1 = new PassangerDetails1(102,"Suraj","Kolakata","Patna","Train");
		PassangerDetails1 p2 = new PassangerDetails1(103,"Pankaj","Jaipur","Ranchi","Bus");
		
		ArrayList al = new ArrayList();
		al.add(p1);
		al.add(p2);
		al.add(p);
			
		SortComplexobject1 st = new SortComplexobject1();
	     Collections.sort(al,st);
	     System.out.println(al);
	}
}
class SortComplexobject1 implements Comparator{
	@Override    // sorting by id
	public int compare(Object o1, Object o2) {
//		if(((PassangerDetails1)(o1)).id>((PassangerDetails1)(o2)).id) {
//			return 1;
//		}
//		return -1;
	
		// sorting by salary
//		if(((Employee1)(o1)).salary>((Employee1)(o2)).salary) {
//			return 1;
//		}
//		return -1;
		
		/// sorting by name
		int res=(((PassangerDetails1)(o1)).name).compareTo((((PassangerDetails1)(o2)).name));
		if(res>0) {
			return 1;
		}
		else
		return -1;
	}	
}
class PassangerDetails1 {
	int id;
	String name;
	String journeyFrom;
	String journeyTo;
	String travellingMedium;
	public PassangerDetails1(int id, String name, String journeyFrom, String journeyTo, String travellingMedium) {
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
}
