/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author sofus
 */
public class Counter extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Counter t1 = new Counter();
//        t1.run();//What will happen here?
        t1.start(); //Compared to here?
        Thread.sleep(10);
        System.out.println("Hi");
    }
    
}
