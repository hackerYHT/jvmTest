package com.yht.controller;

import com.yht.service.TimeTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author xiehaitao
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class DockerTestController {

    @GetMapping(value = "/yht")
    public String getNginxConfig() {
        String res = "叶海涛   " + TimeTest.yht();
        System.out.println(res);
        return res;
    }

    @GetMapping(value = "/yht2")
    public String getNginxConfig2() {
        String res = "叶海涛2   " + TimeTest.yht();
        System.out.println(res);
        return res;
    }

    @GetMapping(value = "/yht3")
    public String getNginxConfig3() {
        String res = "叶海涛3   " + TimeTest.yht();
        System.out.println(res);
        return res;
    }

    @PostMapping(value = "/yht")
    public String getNginxConfig(@RequestParam @Validated String method) {
        String res = "叶海涛_" + method + "    " + TimeTest.yht();
        System.out.println(res);
        return res;
    }

    @PostMapping(value = "/yht2")
    public String getNginxConfig2(@RequestParam(required =false) String method) {
        String res = "叶海涛_" + method + "    " + TimeTest.yht();
        System.out.println(res);
        return res;
    }

    @GetMapping(value = "/destinRuleTest")
    public String destinRuleTest() {
        String res = "收到请求时间：   " + TimeTest.yht() + "\n";
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        res += "返回请求时间：   " + TimeTest.yht();
        return res;
    }

}
