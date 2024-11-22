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
      return (rear==data.length && front==0)?true:false;
  }
  boolean isEmpty()
  {
      return !isFull();
  }
  public void enQueue(int value)throws Exception
  {
	  if(isFull())
		  throw new Exception("Queue is overflow");
	  else
	  {
		  if(rear==data.length)
			  rear=-1;
		  data[++rear]=value;
		  if(rear==0 && front==-1)
			  front=0;
	  }
  }
  public int deQueue()throws Exception
  {
	  if(isEmpty())
	    throw new Exception("Queue is Underflow");
	  else
	  {
		if(front==data.length)
			front=0;
		front++;
	  }
	  return data[front-1];
  }
  public String toString()
  {
	  StringBuffer sb=new StringBuffer();
	  for(int i=front;i<data.length;i++)
	  {
		    sb.append(data[i]+"\n");
	       if(i==rear)
			   break;
	  }
	  return sb.toString();	   
  }
}