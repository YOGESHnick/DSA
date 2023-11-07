import java.util.*;
class Main
{
  Node head = null;
  Node temp=null;
  public class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
  void ins(int n)
  {
    Node nn = new Node(n);
    if(head==null){
      head=nn;
      temp=nn;
    }else
    {
      temp.next=nn;
      temp=nn;
    }
  }
void dis(){
    Node temp=head;
    while(temp!=null)
    {
      System.out.println(temp.data);
      temp=temp.next;
    }
  }
  public static void main(String args[])
  {
    Main o = new Main();
	Scanner sc = new Scanner(System.in);
    while(true)
    {
      int n=sc.nextInt();
      if (n==-1)
        break;
      else
      {
        o.ins(n);
      }
    }
    o.dis();
  }
}
