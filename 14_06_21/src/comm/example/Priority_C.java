package comm.example;

import java.util.Comparator;

public class Priority_C implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(((Team)o1).getTeamPriority()==((Team)o2).getTeamPriority()) {
			return 0;
		}
		if(((Team)o1).getTeamPriority() < ((Team)o2).getTeamPriority()) {
			return 1;
		}else
		return -1;
	}
	

}
