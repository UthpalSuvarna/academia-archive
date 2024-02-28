import java.util.*;

import java.lang.*;



class Queueitem{

	int n;

	boolean valueset=true;

	synchronized int get() {

		while(!valueset) 

			try {

				Thread.sleep(1000);

				wait();

			}

			catch(Exception e) {

				System.out.println(" IntrruptedException caught");

			}

			System.out.println("GET "+n);

			valueset=false;

			notify();	

		return n;

	}

	synchronized void put(int n) {

		while(valueset)

			try {

				Thread.sleep(1000);

				wait();

			}

		catch(Exception e) {

			System.out.println("IntrruptedException caught");

		}

		this.n=n;

		valueset=true;

		System.out.println("PUT" +n);

		notify();

		

	}

	

	

}







class Producer implements Runnable{

	Queueitem q;

	Producer(Queueitem q){

		this.q=q;

		new Thread(this,"Producer").start();

	}

	public void run() {

		int i=0;

		while(true) {

			q.put(i++);

		}

	}

}



class Consumer implements Runnable{

	Queueitem q;

	Consumer(Queueitem q){

		this.q=q;

		new Thread(this, "Consumer").start();

	}public void run() {

		while(true) {

			q.get();

		}

	}

}

public class interthread {

	public static void main(String[] args) {

		Queueitem q=new Queueitem();

		Producer p=new Producer(q);

		Consumer c=new Consumer(q);

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter e to exit");

		char ch=sc.next().charAt(0);

		if(ch=='e') {

			System.out.println("Stopped");

			System.exit(0);

		}

		

	}

}
