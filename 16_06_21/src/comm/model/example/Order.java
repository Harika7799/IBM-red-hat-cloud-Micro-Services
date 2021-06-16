package comm.model.example;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Order implements Serializable {
	
private static final long SUID = 3944939832200940222l;
private Integer OId;
private Date ODate;

public void setQuantity(int quantity) {
	
	
}

public void setOrderBy(String orderBy) {

	
}

public void setOName(String orderName) {
	
	
}

}
