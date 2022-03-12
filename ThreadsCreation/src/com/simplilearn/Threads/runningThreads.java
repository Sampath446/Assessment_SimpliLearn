package com.simplilearn.Threads;

public class runningThreads {
	
    public static int myCount = 0;
    public runningThreads(){
         
    }
    public void run() {
        while(runningThreads.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++runningThreads.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        runningThreads mrt = new runningThreads();
        Thread t = new Thread();
        t.start();
        while(runningThreads.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++runningThreads.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }


}
