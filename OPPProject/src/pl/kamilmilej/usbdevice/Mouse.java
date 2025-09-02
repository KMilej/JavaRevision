package pl.kamilmilej.usbdevice;

public class Mouse implements USBDevice {

    private final String name;

    public Mouse(String name) {
        this.name = name;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean disconnect() {
        System.out.println("mouse disconnected");
        return true;
    }

    @Override
    public boolean connect() {
        System.out.println("mouse connected");
        return true;
    }
}
