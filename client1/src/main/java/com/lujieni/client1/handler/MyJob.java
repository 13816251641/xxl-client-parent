package com.lujieni.client1.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.springframework.stereotype.Service;

/**
 * @Auther ljn
 * @Date 2020/1/7
 */
@Service
public class MyJob {

    /**
     * 1、简单任务示例（Bean模式）
     */
    @XxlJob("myJob")
    public ReturnT<String> myJob(String param) throws Exception {
        XxlJobLogger.log("myJob start");
        System.out.println("client1");
        //Thread.sleep(10 * 1000);
        System.out.println(param); //打印入参
        XxlJobLogger.log("myJob end");
        return ReturnT.SUCCESS;
    }

}
