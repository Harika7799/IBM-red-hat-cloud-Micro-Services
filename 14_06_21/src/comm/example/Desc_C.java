package comm.example;

import java.util.Comparator;

public class Desc_C implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		return ((Team)o1).getTeamDesc().compareTo(((Team)o2).getTeamDesc());
	}
	

}
