package comm.example.Serialization;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor

public class Director implements Serializable{
	public Director(String string, int id2, String name2) {
		
	}
	private int Id;
	private String Name;

}
