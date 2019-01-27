import java.util.*;
class MyIntQueue
{

	List<Integer> data;
	int pos;
	public MyIntQueue()
	{
		data = new ArrayList<Integer>();
		pos = 0;
	}


	public void enqueue(int element)
	{
		System.out.println("queueing: " + element);
		data.add(element);
	}

	public int dequeue()
	{
		System.out.println("dequeueing.. ");
		return data.remove(pos);
	}

	public void print_status()
	{
		System.out.println(Arrays.toString(data.toArray()));
		System.out.println("Position: " + pos);
	}

	public static void main(String [] args)
	{
		System.out.println("Hello world");
		MyIntQueue miq = new MyIntQueue();
		miq.enqueue(1);
		miq.enqueue(2);
		miq.enqueue(3);
		miq.enqueue(4);
		miq.enqueue(5);

		miq.print_status();

		System.out.println(miq.dequeue());
		System.out.println(miq.dequeue());
		miq.enqueue(6);

		miq.print_status();
		System.out.println(miq.dequeue());
		miq.print_status();	
	}
}

