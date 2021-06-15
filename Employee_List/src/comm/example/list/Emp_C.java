package comm.example.list;

import java.util.Comparator;

public class Emp_C implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		if(e1.getAge()==e2.getAge())
			return e1.getDOJ().compareTo(e2.getDOJ());
		else if(e1.getAge()>e2.getAge())
			return 1;
		else
			return -1;
		
		
	}
}

