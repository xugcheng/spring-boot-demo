package com.xugc.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

/**
 * Created by xuguocheng on 2016/11/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AsyncTaskTest {

    @Autowired
    private AsyncTask task;

    @Test
    public void test() throws Exception {
        long start = System.currentTimeMillis();
        Future<String> future1 = task.doSomethingOne();
        Future<String> future2 = task.doSomethingTwo();
        Future<String> future3 = task.doSomethingThree();
        while (true) {
            if (future1.isDone() && future2.isDone() && future3.isDone()) {
                break;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("总共耗时:" + (end - start) + "毫秒.");
    }
}
