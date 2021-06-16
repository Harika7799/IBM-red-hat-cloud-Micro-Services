package comm.model.example;

import java.util.ArrayList;
import java.util.List;

public class Order_S1 implements Order_S {
	private List<Order> ord = null;
	{
		ord =new ArrayList<Order>();
	}

	@Override
	public Order create(Order o1) {
		ord.add(o1);
		return o1;
	}

	@Override
	public List<Order> getAllOrder() {
	
		return ord;
	}
	

}
