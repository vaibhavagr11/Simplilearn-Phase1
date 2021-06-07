package June4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class SerialDesirial {

	public static void main(String[] args) throws IOException{
		
		Student  obj = new Student(21, 2017178, "CSE");
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		
		List<Student> as = new ArrayList<Student>();
		as.add(new Student(21, 2017178, "CSE"));
		as.add(new Student(22, 2017188, "ECE"));
		as.add(new Student(23, 2017198, "CSD"));
		
		try {
			fs = new FileOutputStream("object.ser");
			os = new ObjectOutputStream(fs);
			os.writeObject(as);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			fs.close();
			os.close();
		}
		
//		Student o = null;
		List<Student> ls = null;
		
		try {
			FileInputStream fis = new FileInputStream("object.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ls = (List<Student>) ois.readObject();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Student age: " + ls.get(0).getAge());
		System.out.println("Student department: " + ls.get(0).getAge());
		System.out.println("Student roll number: " + ls.get(0).getAge());

	}

}

class Student implements Serializable{
	private int age;
	private int roll_number;
	private String dept;
	
	Student(int age, int roll_number, String dept) {
		this.age = age;
		this.roll_number = roll_number;
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(int roll_number) {
		this.roll_number = roll_number;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
