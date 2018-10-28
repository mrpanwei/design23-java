package com.jetaime.design23.factorymethod;

public class SendMailFactory implements  Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
