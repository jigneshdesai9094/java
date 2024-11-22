import java.io.*;
class Student implements Serializable
{
     int rollno;
     String name;
     int marks[];
    Student(int rollno,String name,int sub1,int sub2,int sub3)
    {
       this.rollno=rollno;
       this.name=name;
       marks=new int[3];
       marks[0]=sub1;
       marks[1]=sub2;
       marks[2]=sub3;
    }
    double cal_percentage()
    {
        int total=0;
        for(int i=0;i<marks.length;i++)
        {
            total=total+marks[i];
        }
        return total/3.0;
    }
}
class P14
{
    public static void main(String args[])
    {
       Student s1=new Student(7,"jignesh",80,90,70);
       Student s2=new Student(8,"Hemal",95,78,67);
       Student s3=new Student(9,"Sunny",80,70,60);
       try
       {
       ObjectOutputStream  dos = new ObjectOutputStream (new FileOutputStream("studentinfo.txt"));
       dos.writeObject(s1);
       dos.writeObject(s2);
       dos.writeObject(s3);
       dos.close();

       ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentinfo.txt"));
       Student obj = (Student)ois.readObject();
       System.out.println(obj.rollno);
       System.out.println(obj.name);
       System.out.println(obj.marks[0]+" "+obj.marks[1]+" "+obj.marks[2]);
       obj = (Student)ois.readObject();
       System.out.println(obj.rollno);
       System.out.println(obj.name);
       System.out.println(obj.marks[0]+obj.marks[1]+obj.marks[2]);
       obj = (Student)ois.readObject();
       System.out.println(obj.rollno);
       System.out.println(obj.name);
       System.out.println(obj.marks[0]+obj.marks[1]+obj.marks[2]);
       }
       catch(Exception e)
       {
        e.printStackTrace();
       }
    }
}