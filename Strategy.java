class Strategy {
  public static void main(String[] args) {
      System.out.println("This is a redhead.");
      RedheadDuck redhead = new RedheadDuck();
      redhead.fly();
      redhead.quack();

      System.out.println("This is a rubber duck.");
      RubberDuck rd = new RubberDuck();
      rd.fly();
      rd.quack();
  }
}

abstract class Duck {
  FlyBehavior fb;
  QuackBehaviors qb;

  void fly() { fb.fly(); }
  void quack() { qb.quack();}
  /* Other stable things */
}

class RedheadDuck extends Duck {
  RedheadDuck() {
      fb = new FlyWithWings();
      qb = new NormalQuack();
  }
}

class RubberDuck extends Duck {
  RubberDuck() {
      fb = new NoFly();
      qb = new SqueakQuack();
  }
}

class WoodenDuck extends Duck {
  WoodenDuck() {
    fb = new NoFly();
    qb = new NoQuack();
  }
}

// add quack behaviors; NormalQuack and SqueakQuack
//class WoodenDuck  - cannot fly
              //    - cannot quack: add NoQuack

interface FlyBehavior {
  public void fly();
}

class FlyWithWings implements FlyBehavior {
  public void fly() {
      System.out.println("Flying!");
  }
}

class NoFly implements FlyBehavior {
  public void fly() {
      System.out.println("Not flying!");
  }
}

interface QuackBehaviors{
  public void quack();
}

class NormalQuack implements QuackBehaviors{
  public void quack() {
    System.out.println("Quack!");
  }
}

class SqueakQuack implements QuackBehaviors{
  public void quack() {
    System.out.println("Squeak!");
  }
}

class NoQuack implements QuackBehaviors{
  public void quack() {
    System.out.println("...");
  }
}

