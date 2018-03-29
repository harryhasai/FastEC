package com.harry.harry_core.app;

/**
 * Created by Harry on 2018/3/29.
 */
public enum ConfigType {
    //枚举在整个项目里是唯一的单例, 并且只能被初始化一次
    API_HOST,   //网络请求的域名
    APPLICATION_CONTEXT,    //全局上下文
    CONFIG_READY,   //控制初始化或者配置是否完成
    ICON    //存储自己的初始化项目
}
