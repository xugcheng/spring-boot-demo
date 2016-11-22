package com.xugc.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 异步执行任务
 * Created by xuguocheng on 2016/11/22.
 */
@Component
public class AsyncTask {

    public static Random random = new Random();

    @Async
    public Future<String> doSomethingOne() throws Exception {
        System.out.println("任务1 - 开始");
        long start = System.currentTimeMillis();
        TimeUnit.SECONDS.sleep(random.nextInt(10));
        long end = System.currentTimeMillis();
        System.out.println("任务1 - 结束,耗时:" + (end - start) + "毫秒.");
        return new AsyncResult<String>("任务1完成");
    }

    @Async
    public Future<String> doSomethingTwo() throws Exception {
        System.out.println("任务2 - 开始");
        long start = System.currentTimeMillis();
        TimeUnit.SECONDS.sleep(random.nextInt(10));
        long end = System.currentTimeMillis();
        System.out.println("任务2 - 结束,耗时:" + (end - start) + "毫秒.");
        return new AsyncResult<String>("任务2完成");
    }

    @Async
    public Future<String> doSomethingThree() throws Exception {
        System.out.println("任务3 - 开始");
        long start = System.currentTimeMillis();
        TimeUnit.SECONDS.sleep(random.nextInt(10));
        long end = System.currentTimeMillis();
        System.out.println("任务3 - 结束,耗时:" + (end - start) + "毫秒.");
        return new AsyncResult<String>("任务3完成");
    }

}
