package com.dsguo.chain;

public class BranchManager extends Manager {

    public BranchManager(String position) {
        super(position);
    }

    public void raisesRequest(String requestName, int requestNumber) {

        // 有权处理300元以内的加薪
        if (requestName.equals("加薪") && requestNumber <= 300) {
            System.out.println(position + "：ok，批准了");
        } else if (superior != null) {

            // 将请求传递给上级
            superior.raisesRequest(requestName, requestNumber);
        }
    }

}
