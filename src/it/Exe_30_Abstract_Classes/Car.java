package it.Exe_30_Abstract_Classes;
interface Movable {
    void moveForward(int distance);
    void moveBackward(int distance);
}
class Car implements Movable {
    public void moveForward(int distance) {
        System.out.println("Car moving forward " + distance + " meters");
    }
    public void moveBackward(int distance) {
        System.out.println("Car moving backward " + distance + " meters");
    }
}
class Boat implements Movable {
    public void moveForward(int distance) {
        System.out.println("Boat moving forward " + distance + " meters");
    }
    public void moveBackward(int distance) {
        System.out.println("Boat moving backward " + distance + " meters");
    }
}