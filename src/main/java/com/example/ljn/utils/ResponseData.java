package com.example.ljn.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class ResponseData {
    private int status;
    private String msg;
    private Object data;

    public ResponseData(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ResponseData(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) { this.data = data; }

    public String toJSONString() {
        JSONObject json = (JSONObject) JSON.toJSON(this);
        return json.toJSONString();
    }
}
