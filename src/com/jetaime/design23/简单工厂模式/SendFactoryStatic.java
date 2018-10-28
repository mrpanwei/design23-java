package com.jetaime.design23.简单工厂模式;

public class SendFactoryStatic {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}
