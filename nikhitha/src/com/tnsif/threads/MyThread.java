package com.tnsif.threads;

public class MyThread extends Thread{
	public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            try {
                Thread.sleep(500); // just to slow it down
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


