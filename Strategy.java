class Strategy {
  public static void main(String[] args) {
      System.out.println("This is a redhead.");
      RedheadDuck redhead = new RedheadDuck();
      redhead.fly();

      System.out.println("This is a rubber duck.");
      RubberDuck rd = new RubberDuck();
      rd.fly();
  }
}

abstract class Duck {
  FlyBehavior fb;

  void fly() { fb.fly(); }
  /* Other stable things */
}

class RedheadDuck extends Duck {
  RedheadDuck() {
      fb = new FlyWithWings();
  }
}

class RubberDuck extends Duck {
  RubberDuck() {
      fb = new NoFly();
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

