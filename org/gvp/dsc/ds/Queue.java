package org.gvp.dsc.ds;
public class Queue
{
  private int rear,front;
  private int data[];

  public Queue(int size)
  {
	  rear=front=-1;
	  data=new int[size];
  }
  boolean isFull()
  {
      return (rear==data.length-1 && front==0) || rear==front-1?true:false;
  }
  boolean isEmpty()
  {
      return front==-1 ?true:false;
  }
  public void enQueue(int value)throws Exception
  {
	  if(isFull())
		  throw new Exception("Queue is overflow");
	  else
	  {
		  if(rear==data.length-1)
			  rear=-1;
		  data[++rear]=value;
		  if(rear==0 && front==-1)
			  front=0;
	  }
  }
  public int deQueue()throws Exception
  {
   
	 int d;
	  if(isEmpty())
	  {  
		throw new Exception("Queue is Underflow");
      } 
	  else
	  {
		d=data[front];
		front++;
		if(front==rear+1)
			front=rear=-1;
		if(front==data.length)
		    front=0;
	  }
	  return d;
  }
  public String toString()
  {
	  StringBuffer sb=new StringBuffer();
	  for(int i=front;i<data.length;i++)
	  {
		    sb.append(data[i]+"\n");
	       if(i==rear)
			   break;
		   if(i==data.length-1)
			   i=-1;
	  }
	  return sb.toString();	   
  }
}