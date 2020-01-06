package com.budwk.sb.commons.base;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Mirror;
import org.nutz.lang.Strings;

import java.io.Serializable;

/**
 * @author wizzer(wizzer@qq.com) on 2016/12/21.
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    private int code;
    private String msg;
    private Object data;

    public Result() {

    }

    public static Result NEW() {
        return new Result();
    }


    public Result addCode(int code) {
        this.code = code;
        return this;
    }

    public Result addMsg(String msg) {
        this.msg = Strings.sNull(msg);
        return this;
    }

    public Result addData(Object data) {
        this.data = data;
        return this;
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = Strings.sNull(msg);
        this.data = data;
    }

    public static Result success(String content) {
        return new Result(0, content, null);
    }

    public static Result success(String content, Object data) {
        return new Result(0, content, data);
    }

    public static Result success(Object data) {
        return new Result(0, "system.success", data);
    }

    public static Result error(int code, String content) {
        return new Result(code, content, null);
    }

    public static Result error(String content) {
        return new Result(500101, content, null);
    }

    public static Result success() {
        return new Result(0, "system.success", null);
    }

    public static Result error() {
        return new Result(500100, "system.error", null);
    }


    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    public String toJsonString() {
        return Json.toJson(this, JsonFormat.compact());
    }

}
