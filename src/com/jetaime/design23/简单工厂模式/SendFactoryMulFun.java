package com.jetaime.design23.简单工厂模式;

public class SendFactoryMulFun {

    public Sender produceMail()
    {
        return new MailSender();
    }

    public Sender produceSms()
    {
        return new SmsSender();
    }

}
