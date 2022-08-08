package Projeto.Singleton;

public class SingletonLazy {
    private static SingletonLazy instancia;
     private SingletonLazy() {
         super();
     }

    public static SingletonLazy getInstancia() {
         return instancia;
    }
}
