package org.casbin.jcasbin.main;

/**
 * WatcherEx回调函数接口
 */
public interface WatcherExCallback {
    boolean onCallback(String msgStr);
}
