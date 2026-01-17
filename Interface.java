interface Vehicle {
    String Name = "TVS";       // public static final
    int Speed = 100;           // public static final
    void start();              // public abstract
    void exit();               // public abstract
}

class Customer implements Vehicle {
    @Override
    public void start() {
        System.out.println("Start(): insert key & press Start button");
    }

    @Override
    public void exit() {
        System.out.println("Exit(): remove key");
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        c.start();
        c.exit();
        System.out.println("Speed: " + Vehicle.Speed);
    }
}
