package main;

public class StudentInfo {
	private String name;
    private int age;
    private double gpa;
    
	public StudentInfo() {
		super();
	}
	
	public StudentInfo(String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int tuoi) {
		this.age = tuoi;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String toString() {
		return "Student [name=" + name + ", tuoi=" + age + ", gpa=" + gpa + "]";
	}
}
