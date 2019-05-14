package com.kdyzm.spring.helloworld.aopDirk;


/**
 * @Author: dirk
 * @CreateDate: 2019-04-28 10:18
 */
public class TestBean implements TestInterface{
    private String testStr = "testStr";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public void test(){
        System.out.println("test");
    }
}
