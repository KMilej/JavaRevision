package pl.kamilmilej.usbdevice;

public class MemoryStick implements  USBDevice {

    private final String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("memory stick connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (ejected) {
            System.out.println("memory stick disconnected");
            return true;
        } else {
            System.out.println("memory stick not disconnected properly");
        }
        System.out.println("memory stick disconnected");
        return false;
    }

    public void eject() {
        System.out.println("ejected memoryStick");
        ejected = true;
    }

    @Override
    public String getName() {
        return name;
    }
}
