class Test2
{
	int x;
}
class Test
{
	public static void m1(StringBuffer s1)
	{
		/*x=20;
		t.x=100;
		System.out.println("in fun x = "+x);
		System.out.println("in fun t.x = "+t.x);*/
		s1.append("hell0");
		//s1=new StringBuffer("Jignesh Desai");
		
		System.out.println("in b = "+s1);
	}
	public static void main(String args[])
	{
		/*Integer x=10;
		Test2 t = new Test2();
		t.x=50;
		System.out.println("before t.x = "+t.x);*/
	
		StringBuffer b = new StringBuffer("Jig");
			System.out.println("before b = "+b);
		m1(b);
	     System.out.println("after b = "+b);

	}
}