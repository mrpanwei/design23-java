package com.jetaime.design23.简单工厂模式;

import com.jetaime.design23.Proxy.Proxy;
import com.jetaime.design23.Proxy.Sourceable;
import com.jetaime.design23.Singleton.Singleton;
import com.jetaime.design23.adapter.Adapter;
import com.jetaime.design23.adapter.Targetable;
import com.jetaime.design23.factorymethod.Provider;
import com.jetaime.design23.factorymethod.SendMailFactory;

public class 普通 {
    public  static  void main(String[] args)
    {
        //简单工厂模式-普通
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();

        //简单工厂模式-多个方法
        SendFactoryMulFun factorymul = new SendFactoryMulFun();
        Sender senderMul = factorymul.produceMail();
        senderMul.Send();

        //简单工厂模式-多个静态方法
        Sender senderstatic = SendFactoryStatic.produceMail();
        senderstatic.Send();

        //23种设计模式之-工厂方法
        /*
        其实这个模式的好处就是，如果你现在想增加一个功能：发及时信息，
        则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，
        无需去改动现成的代码。这样做，拓展性较好！
        */
        Provider provider = new SendMailFactory();
        com.jetaime.design23.factorymethod.Sender sender1 = provider.produce();
        sender1.Send();

        //23种设计模式之-单例模式
        /*
        需要频繁的进行创建和销毁的对象；
        创建对象时耗时过多或耗费资源过多，但又经常用到的对象；
        工具类对象；
        频繁访问数据库或文件的对象。
        */
        Singleton.read();

        //23种设计模式之-适配器模式
        /*
        核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口是Targetable，通过Adapter类，将Source的功能扩展到Targetable里
        */
        Targetable target = new Adapter();
        target.method1();
        target.method2();

        //23种设计模式之-代理模式
        Sourceable source = new Proxy();
        source.method();
    }
}
