package com.jetaime.design23.factorymethod;

public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is smssender!");
    }
}
