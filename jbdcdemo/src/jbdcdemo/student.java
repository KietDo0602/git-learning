package jbdcdemo;

public class student {
	private String student_id;
	private String name;
	private String department;
	private String address;
	private String date;
	private String code;
	private String age;

	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public student(String id, String n, String dpt, String a, String d, String cd, String ag) {
		student_id = id;
		name = n;
		department = dpt;
		address = a;
		date = d;
		age = ag;
		code = cd;
	}
	
	public String print_student(String id, String n, String dpt, String a, String d, String cd, String ag) {
		String rs = "ID: " + id + " Name: " + n + "Department: " + dpt + " Address: " + a + " Date: " + d + " Age: " + ag + " Code: " + cd;
		return rs;
	}
	
}
