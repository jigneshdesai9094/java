import java.util.Scanner;

class Stack {
  int top = -1, s[], max;
  Scanner s1 = new Scanner(System.in);;

  Stack() {
    max = 5;
    s = new int[max];
  }

  Stack(int len) {
    max = len;
    s = new int[max];
  }

  void push() {
    int ele;
    if (top == max - 1)
      System.out.println("\nStack is Overflow..!!");
    else {
      top++;
      System.out.println("Enter New Element : ");
      ele = s1.nextInt();
      s[top] = ele;
    }
  }

  void pop() {
    if (top == -1)
      System.out.println("\nStack is Underflow..!!");
    else {
      System.out.println("\nRemove Element : " + s[top]);
      top--;
    }
  }

  void traverse() {
    if (top == -1)
      System.out.println("\nStack is Underflow..!!");
    else {
      System.out.print("Elements : ");
      for (int i = top; i >= 0; i--)
        System.out.print(s[i] + " ");
    }
  }
}

class P7 {
  static Scanner sc=new Scanner(System.in);
  public static void operation(Stack s)
  {
      while (true)
      {
         System.out.println("\n1.PUSH");
         System.out.println("2.POP");
         System.out.println("3.Traverse");
         System.out.println("4.Exit");
         System.out.println("Enter Your Choice : ");
         int c=sc.nextInt();
         switch (c) {
          case 1:
            s.push();
            break;
          case 2:
            s.pop();
            break;
          case 3:
            s.traverse();
            break;
          case 4:
            System.exit(0);
          default:System.out.println("\nPlease,enter valid one above choice");
            break;
         }
      }
  }
  public static void main(String args[])
  {

    boolean t=true;
    while(t)
    {
	     System.out.println("1.Default Stack");
       System.out.println("2.User Length Stack");
       System.out.println("Enter Your Choice : ");
       int c=sc.nextInt();
       if(c==1)
       {
          Stack s1=new Stack();
          operation(s1);
          t=false;
       }
       else if(c==2)
       {
           System.out.println("Enter Stack Length : ");
           c=sc.nextInt();
           Stack s2=new Stack(c);
           operation(s2);
           t=false;
       }
      else
      {
       System.out.println("\nPlease,enter one of above choice");
      }
  }
  }
}