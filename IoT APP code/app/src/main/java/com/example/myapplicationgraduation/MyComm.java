package com.example.myapplicationgraduation;

public class MyComm {
    private String operation;
    private String data;
    private String status_code;
    private String username;
    private String password;
    private String device_key;

    public String format_comm_data(String operation, String data, String status_code){
        this.operation = operation;
        this.data = data;
        this.status_code = status_code;
        return operation + "|" + data + "|" + status_code;
    }


}
