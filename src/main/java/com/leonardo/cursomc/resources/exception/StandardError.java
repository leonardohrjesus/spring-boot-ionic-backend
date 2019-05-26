package com.leonardo.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer status;
	private String message;
	private Long timestamp;
	private String path;
	private String error;

	public StandardError() {
		super();
	}

	public StandardError( Long timestamp, Integer status, String  error,String message,String path) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
		this.path = path;
		this.error = error;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}


}
