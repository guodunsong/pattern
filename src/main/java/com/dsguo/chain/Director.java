package com.dsguo.chain;

public class Director extends Manager {

    public Director(String position) {
        super(position);
    }

    public void raisesRequest(String requestName, int requestNumber) {

        // 有权处理100元以内的加薪
        if (requestName.equals("加薪") && requestNumber <= 100) {
            System.out.println(position + "：ok，批准了");
        } else if (superior != null) {
            // 将请求传递给上级
            superior.raisesRequest(requestName, requestNumber);
        }

    }
}

