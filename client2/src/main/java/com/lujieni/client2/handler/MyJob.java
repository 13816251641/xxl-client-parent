package com.lujieni.client2.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
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
        System.out.println("client2");
        Thread.sleep(60 * 1000);
        return ReturnT.SUCCESS;
    }
}
