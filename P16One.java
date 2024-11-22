import org.gvp.dsc.ds.Stack;
import org.gvp.dsc.ds.Queue;
import java.util.Scanner;
class P16One
{
	public static void main(String args[])
	{
		    Scanner s1=new Scanner(System.in);
			while(true)
			{
		    System.out.println("1.Stack");
			System.out.println("2.Queue");
			System.out.println("3.exit");
			System.out.println("\nenter your choice");
			int choice=s1.nextInt();
			
			if(choice==1)
			{
				       System.out.println("Enter Stack Size");
					   int size=s1.nextInt();
					   Stack s=new Stack(size);
					   innerLoop:
					   while(true)
					   {
						   System.out.println("1.PUSH");
						   System.out.println("2.POP");
						   System.out.println("3.PEEK");
						   System.out.println("4.Display");
						   System.out.println("5.exit");
						   System.out.println("enter your choice");
						   choice=s1.nextInt();
						   try
						   {
						   switch(choice)
						   {
							   case 1:System.out.println("Enter New Value : ");
							          int d=s1.nextInt();
									  s.push(d);
									  break;
							  case 2:System.out.println("Pop element is : "+s.pop());
							          break;
							  case 3:System.out.println("Top element is : "+s.peek());
							          break;
							  case 4:System.out.println(s);
							          break;
							  case 5:break innerLoop;
							  default:System.out.println("\nPlease,enter valid choice");
						   }
						   }catch(Exception e)
						   {
							   System.out.println("Error : "+e.getMessage());
						   }
					   }

			}
			else if(choice==2)
			{
				System.out.println("Enter Queue Size");
					   int size=s1.nextInt();
					   Queue s=new Queue(size);
					   innerLoop2:
					   while(true)
					   {
						   System.out.println("1.EnQueue");
						   System.out.println("2.DeQueue");
						   System.out.println("3.Display");
						   System.out.println("4.exit");
						   System.out.println("enter your choice");
						   choice=s1.nextInt();
						   try
						   {
						   switch(choice)
						   {
							   case 1:System.out.println("Enter New Value : ");
							          int d=s1.nextInt();
									  s.enQueue(d);
									  break;
							  case 2:System.out.println("Pop element is : "+s.deQueue());
							          break;
							 
							  case 3:System.out.println(s);
							          break;
							  case 4:break innerLoop2;
							  default:System.out.println("\nPlease,enter valid choice");
						   }
						   }catch(Exception e)
						   {
							   System.out.println(e.getMessage());
						   }
					   }
			}
			else
			  System.exit(0);
			
			}
	}
}