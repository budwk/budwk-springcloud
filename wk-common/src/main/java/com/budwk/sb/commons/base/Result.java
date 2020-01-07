package com.budwk.sb.commons.base;

import lombok.Data;
import org.nutz.castor.Castors;
import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.nutz.lang.Each;
import org.nutz.lang.Lang;
import org.nutz.lang.Strings;
import org.nutz.lang.util.NutMap;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author wizzer(wizzer.cn) on 2016/12/21.
 */
@Data
public class Result extends NutMap implements Serializable {
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

    public String toJsonString() {
        return Json.toJson(this, JsonFormat.compact());
    }

}
