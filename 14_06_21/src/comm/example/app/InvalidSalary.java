package comm.example.app;

public class InvalidSalary extends RuntimeException {
private String msg;
public InvalidSalary(String msg) {
	super();
	this.msg=msg;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}

}
