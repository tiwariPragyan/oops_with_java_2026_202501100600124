package oops_with_java_2026_202501100600124;

// write a program to demonstrate abstraction in java.

abstract class Device {
    String brand = "Samsung";
    abstract void turnOn();
    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

interface Camera {
    int max_zoom = 10;
    void takePhoto();
    default void cameraInfo() { // either default or static method can be used in interface
        System.out.println("camera is ready to take photo");
    }
}

interface MusicPlayer {
    String type = "Digital";
    void playMusic();
    default void musicInfo() {
        System.out.println("music player is ready to play music");
    }
}

class Smartpone extends Device implements Camera, MusicPlayer {
    // Multiple inheritance is achieved by implementing multiple interfaces
    void turnOn() {
        System.out.println("Smartphone is turning on...");
    }

    public void takePhoto() {
        System.out.println("Taking photo with max zoom: " + max_zoom);
    }

    public void playMusic() {
        System.out.println("Playing music of type: " + type);
    }
}

public class Abstract_Interface {
    public static void main(String[] args) {
        Smartpone sp = new Smartpone();
        sp.turnOn();
        sp.showBrand();
        sp.takePhoto();
        sp.playMusic();
        sp.cameraInfo();
        sp.musicInfo();
    }
}