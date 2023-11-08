import java.util.*;
class Main
{
  Node head=null;
  Node temp=null;
  class Node{
    int data;
    Node next;
    Node(int n)
    {
      this.data=n;
      this.next=null;
    }
  }
  void ins(int n)
  {
    Node nn = new Node(n);
    if(head==null)
    {
      head=nn;
      temp=nn;
    }
    else
    {
      temp.next=nn;
      temp=nn;
    }
  }
  void max()
  {
    int max=0;
    Node temp = head;
    while(temp!=null)
    {
      if(temp.data>max)
      {max=temp.data;}
      temp=temp.next;
    }
    System.out.println(max);
  }
  public static void main(String args[])
  {
    Main o = new Main();
    Scanner sc = new Scanner(System.in);
    while(true)
    {
      int n=sc.nextInt();
      if(n<0)
        break;
      o.ins(n);
    }
    o.max();
  }
}
