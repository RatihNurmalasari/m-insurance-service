package com.manulife.util;

public class CustomErrorType {

    private String errorCode;
    private String errorMessage;

    public CustomErrorType(String errorMessage){
		this.errorCode = "";
	    this.errorMessage = errorMessage;
	}
    
    public CustomErrorType(String errorCode, String errorMessage){
    		this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

	public String getErrorCode() {
		return errorCode;
	}

}