public class Sample{
    public static void main(String [] args)
    {
        Sample s1=new Sample();
        String res1=s1.toString();
        Sample s2=new Sample();
        String res2=s2.toString();
        System.out.println(res1);
        System.out.println(res2);
        System.out.println("------------------------------------------------------------------------");
        
            
            boolean b= s1.equals(s2);
            System.out.println(b);
        

    }
}