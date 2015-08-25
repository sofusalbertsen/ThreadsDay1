/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SyncExample { 
    public static int x;
    public static int y;
  private static Object lockObject = new Object();
  
  private static class Thread1 extends Thread { 
    public void run() { 
      synchronized (lockObject) {
        x = y = 0;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SyncExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(x);
      }
    }
  }

  private static class Thread2 extends Thread { 
    public void run() { 
      synchronized (lockObject) {
        x = y = 1;
        System.out.println(y);
      }
    }
  }

  public static void main(String[] args) {
      for (int i = 0; i < 1; i++) {
          
    new Thread1().start();
    new Thread2().start();
      }
  }
}