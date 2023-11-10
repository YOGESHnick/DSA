import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int queue[]=new int[10];
		int front=0;
		int rear=0;
		while(true)
		{
		    System.out.println("Enter operation:");
		    String op=sc.nextLine();
		    if(op.equals("enq"))
		    {
		        System.out.println("Enter number to enqueue:");
		        if(rear==10)
		        {
		            System.out.println("Full");
		        }
		        else
		        {
		           int num=sc.nextInt();
		           queue[rear++]=num;
		            
		        }
		    }
		    if(op.equals("deq"))
		    {
		        if(front > rear || front > 10)
		        {
		            System.out.println("underflow");
		        }
		        else
		        {
		            front++;
		        }
		    }
		    if(op.equals("dis"))
		    {
		        for(int i=front;i<rear;i++)
		        {
		            System.out.print(queue[i]+" ");
		        }
		    }
		    if(op.equals("q"))
		    break;
		}
	}
}
