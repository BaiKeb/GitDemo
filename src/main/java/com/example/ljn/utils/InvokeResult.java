package com.example.ljn.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * service 执行返回结果对象
 * @param <T> 泛型实体
 * @author NongMianMian
 * @date 2020-02-18 11:19
 * @since 1.0.0
 */
@ToString
public class InvokeResult<T> implements Serializable {
	public static final int SUCCESS = 0;
	private static final int FAIL = 1;

	private static final long serialVersionUID = 1L;
	@Getter
	@Setter
	private String msg = "success";

	@Getter
	@Setter
	private int code;

	@Getter
	@Setter
	private int status;

	@Getter
	@Setter
	private T data;

	public InvokeResult() {
		super();
	}

	public boolean isSuccess(){
		return this.code == SUCCESS;
	}

	public  static <T> InvokeResult success(T data) {
		InvokeResult<T> ir = new InvokeResult<>();
		ir.setCode(SUCCESS);
		ir.setStatus(200);
		ir.setData(data);
		ir.setMsg("success");
		return ir;
	}

	public  static <T> InvokeResult success(T data,String msg) {
		InvokeResult<T> ir = new InvokeResult<>();
		ir.setCode(SUCCESS);
		ir.setData(data);
		ir.setMsg(msg);
		return ir;
	}

	public  static <T> InvokeResult success(T data,String msg, int code) {
		InvokeResult<T> ir = new InvokeResult<>();
		ir.setData(data);
		ir.setMsg(msg);
		// 使用自定义code
		ir.setCode(code);
		return ir;
	}

	public  static  InvokeResult fail(int code) {
		InvokeResult ir = new InvokeResult<>();
		ir.setCode(code);
		ir.setMsg("fail");
		return ir;
	}

	public  static  InvokeResult fail(String msg) {
		InvokeResult ir = new InvokeResult<>();
		ir.setCode(FAIL);
		ir.setMsg(msg);
		return ir;
	}

}
