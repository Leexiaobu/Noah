package cn.leexiaobui.core;

/**
 * @author Leexiaobu
 * @date 2021-02-04 10:25
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable {
  @Override
  public void run() {
    for (int x = 0; x < 100; x++) {
      System.out.println(Thread.currentThread().getName() + ":" + x);
    }
  }
}

public class ThreadPoolTest {
  public static void main(String[] args) {
    // 创建一个线程池对象，控制要创建几个线程对象。
    // public static ExecutorService newFixedThreadPool(int nThreads)
    ExecutorService pool = Executors.newFixedThreadPool(2);
    // 可以执行Runnable对象或者Callable对象代表的线程
    pool.submit(new MyRunnable());
    pool.submit(new MyRunnable());

    //结束线程池
    pool.shutdown();
  }
}