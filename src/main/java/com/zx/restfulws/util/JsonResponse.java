package com.zx.restfulws.util;

public class JsonResponse<T> {

	private StatusResponse status;
	private String msg;
	private T data;
	
	public JsonResponse(StatusResponse status, String msg, T data){
		this.status = status;
		this.msg = msg;
		this.data = data;
	}
	
	public static <T> JsonResponse<T> success(T data) {
		return new JsonResponse<>(StatusResponse.SUCCESS,
				StatusResponse.SUCCESS.toString(),
				data);
	}

	
	public static <T> JsonResponse<T> fail() {
		return new JsonResponse<>(StatusResponse.FAILED,
				StatusResponse.FAILED.toString(),
				null);
	}

	public StatusResponse getStatus() {
		return status;
	}

	public void setStatus(StatusResponse status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
