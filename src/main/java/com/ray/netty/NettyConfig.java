/**
 * Copyright (C) 2018 	北京中文在线教育科技发展有限公司	慧读技术部
 *
 * @Version: Version 0.1	@see <http://www.huidu.com>
 * @Date: 2018-5-27
 * @Author: Li xiaolei (lixl@chineseall.com)
 */
package com.ray.netty;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * 存储整个工程的全局配置
 *
 * @author lixiaolei
 */
public class NettyConfig {
    /**
     * 存储每一个客户端接入时的channel对象
     */
    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
