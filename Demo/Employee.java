package Demo;

public class Employee extends person {
	public void per() {
	super.emp();;;;;;;;;
		System.out.println("this is persn classm");
	}
	float salary;
	public Employee(String name, int age,float salary) {
			super(name, age);
			this.salary=salary;

		}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
	Employee e=new Employee("aniket", 30, 24210f);
	System.out.println(e);
	
	e.per();
	}
}
