package com.transaction.model;

import java.util.HashMap;
import java.util.Map;

public class JsonBean {

    private boolean status;
    private String msg;
    private int id;
    private Object obj;
    private Map<String, Object> map=new HashMap<String, Object>();

    //包含true的msg方法
    public static  JsonBean correct(String msg) {
        JsonBean bean = new JsonBean();
        bean.setStatus(true);
        bean.setMsg(msg);
        return bean;
    }
    //包含false的msg方法
    public static JsonBean wrong(String msg) {
        JsonBean bean = new JsonBean();
        bean.setStatus(false);
        bean.setMsg(msg);
        return bean;
    }
    //包含true的map方法
    public static JsonBean Tmap(Map<String,Object> map) {
        JsonBean bean = new JsonBean();
        bean.setMap(map);
        bean.setStatus(true);
        return bean;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

}
