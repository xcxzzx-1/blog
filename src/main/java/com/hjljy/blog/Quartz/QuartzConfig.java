package com.hjljy.blog.Quartz;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: HJLJY
 * @Date: 2019/1/22 0022 17:11
 * @Description:
 */
@Configuration
public class QuartzConfig {

    //指定具体的定时任务类
//    @Bean
//    public Trigger uploadTaskTrigger() {
//        //TODO 这里设定执行方式
//        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("*/5 * * * * ?");
//        // 返回任务触发器
//        return TriggerBuilder.newTrigger().forJob(uploadTaskDetail())
//                .withIdentity("MyTask")
//                .withSchedule(scheduleBuilder)
//                .build();
//    }
//    @Bean
//    public JobDetail uploadTaskDetail() {
//        return JobBuilder.newJob(MyTask.class).withIdentity("MyTask").storeDurably().build();
//    }


}
