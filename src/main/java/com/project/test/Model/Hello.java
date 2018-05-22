package com.project.test.Model;

/**
 * @author Magla
 *
 */
public class Hello {

	
	private long id;
	
	private String msg;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Hello(long id, String msg) {
		super();
		this.id = id;
		this.msg = msg;
	}
	
	
}
