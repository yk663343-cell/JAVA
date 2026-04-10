class Transport {
    String type;
    int speed;


    Transport(String t, int s) {
        type = t;
        speed = s;
    }

    void display() {
        System.out.println("Transport Type: " + type);
        System.out.println("Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        
        Transport t1 = new Transport("Car", 120);
        Transport t2 = new Transport("Train", 200);

    
        t1.display();
        t2.display();
    }
}
