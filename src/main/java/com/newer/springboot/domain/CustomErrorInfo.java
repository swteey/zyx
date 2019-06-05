package com.newer.springboot.domain;

import java.io.Serializable;

public class CustomErrorInfo implements Serializable {

    private String errorMsg;

    public CustomErrorInfo() {
    }

    public CustomErrorInfo(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
