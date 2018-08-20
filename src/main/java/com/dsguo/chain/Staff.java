package com.dsguo.chain;

public class Staff {

    public static void main(String[] args) {

        // 实例化各个管理者对象
        Manager director = new Director("主管");
        Manager branchManager = new BranchManager("部门经理");
        Manager cho = new CHO("人力资源总监");
        Manager generalManager = new GeneralManager("总经理");

        // 设置上级与下级
        director.setSuperior(branchManager);
        branchManager.setSuperior(cho);
        cho.setSuperior(generalManager);

        director.raisesRequest("加薪",100);
        director.raisesRequest("加薪",300);
        director.raisesRequest("加薪",600);
        director.raisesRequest("加薪",1000);
        director.raisesRequest("加薪",1500);

    }
}
