/**
 * Copyright (C) 2018 	北京中文在线教育科技发展有限公司	慧读技术部
 *
 * @Version: Version 0.1	@see <http://www.huidu.com>
 * @Date: 2018-5-27
 * @Author: Li xiaolei (lixl@chineseall.com)
 */
package com.ray.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.stream.ChunkedWriteHandler;


/**
 * 初始化链接时候的各个组件
 *
 * @author lixiaolei
 */
public class MyWebSocketChnnelHandler extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel e) throws Exception {
        e.pipeline().addLast("http-codec", new HttpServerCodec());
        e.pipeline().addLast("aggregator", new HttpObjectAggregator(65536));
        e.pipeline().addLast("http-chunked", new ChunkedWriteHandler());
        e.pipeline().addLast("handler", new MyWebSocketHandler());
    }
}
