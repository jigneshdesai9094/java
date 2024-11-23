package org.gvp.dsc.ds;
public class Stack
{
	private int top;
	private int data[];

	public Stack(int size)
	{
		top=-1;
		data=new int[size];
	}
	boolean isFull()
	{
		return(top==data.length-1)?true:false;
	}
	boolean isEmpty()
	{
	    return(top==-1)?true:false;
	}
	public void push(int value)throws Exception
	{
		if(!isFull())
		 data[++top]=value;
	    else
		  throw new Exception("Stack is OverFlow");
	}
	public int pop()throws Exception
	{
		if(!isEmpty())
		{ 	top--;
		    return data[top+1];
		}
		else
			throw new Exception("Stack is UnderFlow");
	}
	public int peek()throws Exception
	{
		if(!isEmpty())
		  return data[top];
		else
			throw new Exception("Stack is UnderFlow");
    }
	public String toString()
	{
		StringBuffer sb=new StringBuffer();
		
		for(int i=top;i>=0;i--)
		{
			sb.append(data[i]+"\n");
		}

		return sb.toString();
	}

}