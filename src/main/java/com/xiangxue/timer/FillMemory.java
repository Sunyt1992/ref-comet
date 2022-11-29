package com.xiangxue.timer;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FillMemory extends Thread{
	
	private static Logger logger = LoggerFactory.getLogger(FillMemory.class);
	
	private List<byte[]> listByte = new LinkedList<>();
	
	@Override
	public void run() {
		while(!Thread.currentThread().isInterrupted()) {
			listByte.clear();
			logger.info("开始填充..........");
			for(int i=0;i<500;i++) {
				byte[] bytes = new byte[1*1024*1024];
				listByte.add(bytes);
				
			}
			logger.info("..........填充完毕");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}			
		}

	}
	
	//@PostConstruct
	public void init() {
		this.start();
	}

}
