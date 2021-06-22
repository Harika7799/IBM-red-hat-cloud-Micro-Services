package org.example.dao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class EmployeeNotFoundException extends RuntimeException {
private static final long serialVersionUID =-35454564524595956l;
private String Message;
}
