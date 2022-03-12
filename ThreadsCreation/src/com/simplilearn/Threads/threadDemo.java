package com.simplilearn.Threads;

public class threadDemo extends Thread {
	
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		threadDemo mt = new  threadDemo();
  		mt.start();
 	}


}
