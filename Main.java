class Main {
  public static void main(String[] args) {
		Duck mallard = new Duck(Duck.MALLARD);
		mallard.fly();
  }
}

class Duck {
	final static int MALLARD = 1, RUBBER = 2;
	int type;

	public Duck(int type) { this.type = type; }

	public void fly() {
		switch (type) {
			case MALLARD:
				System.out.println("Flying!");
				break;
      case RUBBER:
        System.out.println("No fly!");
        break;
			default:
				System.out.println("Undefined!");
				break;
		}
	}
}
