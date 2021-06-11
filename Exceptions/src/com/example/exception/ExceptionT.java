package com.example.exception;

public class ExceptionT {

	private static String TodoId;
	private String Desc;
	private boolean IsCompleted;
	
	public ExceptionT() {
		super();
	}
	public ExceptionT(String todoId, String desc, boolean isCompleted) {
		super();
		this.TodoId = todoId;
		this.Desc = desc;
		this.IsCompleted = isCompleted;
	}
	public static String getTodoId() {
		return TodoId;
	}
	public void setTodoId(String todoId) {
		TodoId = todoId;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public boolean isIsCompleted() {
		return IsCompleted;
	}
	public void setIsCompleted(boolean isCompleted) {
		IsCompleted = isCompleted;
	}
	@Override
	public String toString() {
		return "ExceptionT [TodoId=" + TodoId + ", Desc=" + Desc + ", IsCompleted=" + IsCompleted + "]";
	}
	

}
