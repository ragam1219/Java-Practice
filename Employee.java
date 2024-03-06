package Demo1;
public class Employee1 {
public int id;
public String Ename;
public double Empsalary;
public void Employee(int id, String Ename, double Empsalary)
{
	this.id=id;
	this.Ename=Ename;
	this.Empsalary=Empsalary;
	}
}
public class Main
{
	public static void main(String [] args)
	{
		Employee1 e1=new Employee1();
		Employee1 e2=new Employee1();
		String s1=e1.toString();
		String s2=e2.toString();
		System.out.println(s1);
		System.out.println(s2);
		boolean b=e1.equals(e2);
		System.out.println(b);
		int h1=e1.hashCode();
		int h2=e2.hashCode();
		System.out.println(h1);
		System.out.println(h2);
		
	}
}
