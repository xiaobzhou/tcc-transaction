package org.mengyun.springcloud.sample2.entity;

/**
 * @author xiaobzhou
 * date 2019-03-11 21:35
 */
public class Result {

    private boolean success;
    private String status;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}