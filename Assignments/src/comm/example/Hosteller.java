package comm.example;

public class Hosteller extends Student {
	private String hostelName;
	private int roomNumber;
	public Hosteller() {
		super();
	}

	public Hosteller(String hostelName, int roomNumber) {
		super();
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}

	public Hosteller(int id, String name, int departmentId, String gender, int phone, String hostelName2,
			int roomNumber2) {
		// TODO Auto-generated constructor stub
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Hosteller [hostelName=" + hostelName + ", roomNumber=" + roomNumber + "]";
	}
	

}
