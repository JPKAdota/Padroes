package Projeto;

import Projeto.Singleton.SingletonEager;
import Projeto.Singleton.SingletonHolder;
import Projeto.Singleton.SingletonLazy;
import Projeto.Strategy.*;
import Projeto.facade.Facade;

public class test {
    public static void main(String[] args) {
        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonHolder holder = SingletonHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonHolder.getInstancia();
        System.out.println(holder);

        //Strategy
        comportamento normal = new compotamentoNormal();
        comportamento defensivo = new compotamentoDefensivo();
        comportamento agressivo = new compotamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //Facade

        Facade facade =new Facade();
        facade.migrarCliente("João", "03136040");


    }
}
