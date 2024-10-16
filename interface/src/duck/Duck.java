package duck;

import boyfriend.Boyfriend;

public class Duck {
   private final Quack quack;
    private final Fly fly;

    public Duck(Quack quack, Fly fly) {
        this.quack = quack;
        this.fly = fly;
    }
    public void fly(){
      fly.fly();
    };
    public void quack(){
        quack.quack();
    }


}
