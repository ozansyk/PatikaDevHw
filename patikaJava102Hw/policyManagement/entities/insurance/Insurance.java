package patikaJava102Hw.policyManagement.entities.insurance;

import java.time.LocalDate;

public abstract class Insurance {
	private String name;
	private double price;
	private LocalDate startDate;
	private LocalDate endDate;
	
	public abstract double calculate();
}
