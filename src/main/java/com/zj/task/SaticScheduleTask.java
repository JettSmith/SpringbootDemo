/*
 * package com.zj.task;
 * 
 * import java.text.SimpleDateFormat;
 * 
 * import org.springframework.context.annotation.Configuration; import
 * org.springframework.scheduling.annotation.Async; import
 * org.springframework.scheduling.annotation.EnableAsync; import
 * org.springframework.scheduling.annotation.EnableScheduling; import
 * org.springframework.scheduling.annotation.Scheduled; import
 * org.springframework.stereotype.Component;
 * 
 *//**
	 * springboot 定时任务测试
	 * 
	 * @author ZJ
	 *
	 *//*
		 * @Component
		 * 
		 * @EnableScheduling
		 * 
		 * @EnableAsync public class SaticScheduleTask { SimpleDateFormat sdf = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); long lastTime; String test = "test";
		 * 
		 * //@Scheduled(fixedRate = 6000) //@Scheduled(fixedDelay = 6000) //@Async
		 * 
		 * @Scheduled(cron = "0/6 * * * * *") private void startTask() {
		 * System.out.println("zj:"+test); System.out.println("线程1,当前时间："+
		 * sdf.format(System.currentTimeMillis()));
		 * 
		 * }
		 * 
		 * //@Async
		 * 
		 * @Scheduled(cron = "0/8 * * * * *") private void startTaskTwo() {
		 * System.out.println("zj:"+test); System.out.println("线程2：,当前时间："+
		 * sdf.format(System.currentTimeMillis()));
		 * 
		 * } }
		 */