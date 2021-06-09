package comm.example.model;
import comm.example.model.Todo;
public class App {
	


public static void main(String[] args) {
	App app=new App();
	Todo todo=new Todo();
	todo.createTodo("Compile", false);
	System.out.println(todo.toString());
	Todo todo1=new Todo();
	todo1.createTodo("Compile", false);
	System.out.println(todo1.toString());
	System.out.println(todo==todo1);
	System.out.println(todo.equals(todo1));

	
}
}