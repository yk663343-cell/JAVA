interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("Taking a 48MP photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing your favorite track...");
    }
}

public class MultipleInterface {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.takePhoto();
        myPhone.playMusic();
    }
}