package com.hunau.template.netty.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Slf4j
@Component
public class SocketServer {

    @Resource
    private SocketInitializer socketInitializer;

    @Getter
    private ServerBootstrap serverBootstrap;

    public void start(){
        this.init();
        //绑定端口
        int port = 8098;
        this.serverBootstrap.bind(port);
        log.info("Netty started on port 8098");
    }

    private void init(){
        //接收连接
        int bossThread = 1;
        NioEventLoopGroup boss = new NioEventLoopGroup(bossThread);
        //处理业务
        NioEventLoopGroup worker = new NioEventLoopGroup();
        this.serverBootstrap = new ServerBootstrap();
        this.serverBootstrap.group(boss,worker)
                .channel(NioServerSocketChannel.class)
                .childHandler(this.socketInitializer);
    }

}
