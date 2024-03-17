class Demo{
private String name;
private int age;
private long phoneno;
public String getName(){
	return name;
}
public int getAge(){
return age;
}
public long getPhoneno(){
return phoneno;
}
public void setName(String name){
this.name=name;
}
public void setAge(int age){
this.age=age;
}
public void setPhoneno(long phoneno){
this.phoneno=phoneno;
}
}
public class Demo1
{
	public static void main(String [] args)
	{
		Demo d1=new Demo();
		d1.setName("RAKESH");
		d1.setAge(24);
		d1.setPhoneno(7995695900l);
		String s=d1.getName();
		int i=d1.getAge();
		long l=d1.getPhoneno();
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println("**************************************************************************");
		d1.setName("Shekar");
		d1.setAge(24);
		d1.setPhoneno(799569580l);
		String s1=d1.getName();
		int i1=d1.getAge();
		long l1=d1.getPhoneno();
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println("******************************************************");
		d1.setName("Sai");
		d1.setAge(24);
		d1.setPhoneno(6956859010l);
		String s2=d1.getName();
		int i2=d1.getAge();
		long l2=d1.getPhoneno();
		System.out.println(s2);
		System.out.println(i2);
		System.out.println(l2);


	}
}

