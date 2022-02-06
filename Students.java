package week3.day1;

public class Students {
	
	public static void main(String[] args) {
		Students students = new Students();
		students.getStudentInfo(5);
		students.getStudentInfo(6, "Krishnapriya");
		students.getStudentInfo("abc@gmail.com", 9884412345L);

		}

		public void getStudentInfo(int id) {
		System.out.println("Student ID is " +id);
		}

		public void getStudentInfo(int id,String name) {
		System.out.println("Student ID is " +id);
		System.out.println("Student name is "+name);
		}

		public void getStudentInfo(String emailId, long phNumber) {
		System.out.println("Student email ID is "+emailId);
		System.out.println("Student phone number is "+phNumber);
		}


}
