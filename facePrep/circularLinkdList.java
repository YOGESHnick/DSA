import java.util.*;
class Main
{
  Node head=null;
  Node temp=null;
  class Node{
    int data;
    Node next;
    Node(int n){
      this.data=n;
      this.next=null;
    }
  }
  void insert(int n,int x)
  {
    Node nn=new Node(n);
    if(head==null)
    {
      head=nn;
      temp=nn;
    }
    else
    {
      temp.next=nn;
      temp=nn;
      if(x==0)
      {
        temp.next=head;
      }
    }
  }
  void display(){
   Node temp=head;
    while(temp.next!=head)
    {
      System.out.print(temp.data+" ");
      temp=temp.next;
    }System.out.print(temp.data);
  }
  public static void main(String args[])
  {
    Main o = new Main();
    Scanner sc = new Scanner(System.in);
    while(true)
    {
      int n = sc.nextInt();
      int x=sc.nextInt();
      o.insert(n,x);
      if(x==0)
        break;

    }
    o.display();
  }
}
