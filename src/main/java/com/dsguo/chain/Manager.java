package com.dsguo.chain;

public abstract class Manager {

    protected Manager superior;
    protected String position;

    // 设置管理对象的名称
    public Manager(String position) {
        this.position = position;
    }

    // 设置上级对象
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    // 处理加薪请求的方法
    public abstract void raisesRequest(String requestName,int requestNumber);
}
