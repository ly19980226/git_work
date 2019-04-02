package com.qf.git.Common;

public class SysResult {
    private boolean result;
    private String data;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SysResult{" +
                "result=" + result +
                ", data='" + data + '\'' +
                '}';
    }
}
