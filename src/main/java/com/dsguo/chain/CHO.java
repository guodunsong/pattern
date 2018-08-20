package com.dsguo.chain;

public class CHO extends Manager {

    public CHO(String position) {
        super(position);
    }

    public void raisesRequest(String requestName, int requestNumber) {

        // 有权处理600元以内的加薪
        if (requestName.equals("加薪") && requestNumber <= 600) {
            System.out.println(position + "：ok，批准了");
        } else if (superior != null) {

            // 将请求传递给上级
            superior.raisesRequest(requestName, requestNumber);
        }
    }
}
