package com.xugc.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  定时任务
 * Created by Administrator on 2016/11/22.
 */
@Component
public class ScheduledTask {

    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static Logger logger = LoggerFactory.getLogger(ScheduledTask.class);

    @Scheduled(fixedRate = 60*1000)
    public void reportCurrentTime(){
        logger.debug("现在时间:{}",sdf.format(new Date()));
        logger.info("现在时间:{}",sdf.format(new Date()));
    }
}
