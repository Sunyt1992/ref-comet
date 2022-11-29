package com.xiangxue.sse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 *类说明：实现sse推送
 */
@Controller
public class NobleMetalController {

    private static Logger logger = LoggerFactory.getLogger(NobleMetalController.class);

    @RequestMapping("/nobleMetal")
    public String stock(){
        byte[]  b1 = new byte[1*1024*1024]; //1M的大小
        return "nobleMetal";
    }

    @RequestMapping(value="needPrice",produces = "text/event-stream;charset=UTF-8")
    @ResponseBody
    public String push(){
        Random r = new Random();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //字符串拼接
        StringBuilder sb = new StringBuilder("");
        sb.append("retry:2000\n")
                .append("data:")
                .append((r.nextInt(1000)+50)+",")
                .append((r.nextInt(800)+100)+",")
                .append((r.nextInt(2000)+150)+",")
                .append((r.nextInt(1500)+100)+",")
                .append("\n\n");
        return sb.toString();

    }

}
