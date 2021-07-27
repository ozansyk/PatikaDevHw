package patikaJavaHw.salaryCalculation;

public class Employee {
	public String name;
	public double salary;
	public double workHours;
	public int hireYear;
	
	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		if(salary<1000) {
			return 0;
		} else {
			return salary*0.03;
		}
	}
	
	public double bonus() {
		if(workHours>40) {
			return workHours*40;
		} else {
			return 0;
		}
	}
	
	public double raiseSalary() {
		if(2021-hireYear<10) {
			return salary*0.05;
		} else if (2021-hireYear>9 && 2021-hireYear<20) {
			return salary*0.1;
		} else {
			return salary*0.15;
		}
	}
	
	public String toString() {
		String s = "Adý: " + this.name +
					"\nMaaþý: " + this.salary +
					"\nÇalýþma saati: " + this.workHours +
					"\nBaþlangýç yýlý: " + this.hireYear +
					"\nVergi: " + this.tax() +
					"\nBonus: " + this.bonus() +
					"\nMaaþ artýþý: " + this.raiseSalary() +
					"\nVergi ve Bonuslar ile birlikte maaþ: " + (salary+bonus()-tax()) +
					"\nToplam maaþ(zam ve bonus dahil): " + (salary+bonus()+raiseSalary()-tax());
		return s;
	}
	
}
