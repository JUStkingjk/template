package com.hunau.template.listener;

import com.hunau.template.netty.server.SocketServer;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import javax.annotation.Resource;

/*
 * 监听spring启动后
 * 启动netty
 * */
public class NettyStartListener implements ApplicationRunner {
    @Resource
    private SocketServer server;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.server.start();
    }
}
