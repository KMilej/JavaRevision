package pl.kamilmilej;

import pl.kamilmilej.drive.Drive;
import pl.kamilmilej.file.File;
import pl.kamilmilej.usbdevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;

    List<USBDevice> usbDevices = new ArrayList<>();

    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }

    public void addFile(File file) {
        drive.addFile(file);
    }
    public void listFiles(){
        drive.listFiles();
    }

    public File findFiles(String fileNAme) {

        return drive.findFile(fileNAme);

    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }

    public void addUSBDevice(USBDevice usbDevice) {
        boolean isConnected = usbDevice.connect();
        if (isConnected) {
            usbDevices.add(usbDevice);
        }
    }
    public void removeUSBDevices(USBDevice usbDevice) {
        boolean isDisconnect = usbDevice.disconnect();
        if (!isDisconnect) {
            System.out.println("USB device is forcefully disconnected");
        }
        usbDevices.remove(usbDevice);
//        if (isDisconnect) {
//            usbDevices.remove(usbDevice);
//        } else {
//            System.out.println("USB device is forcefully disconnected");
//            usbDevices.remove(usbDevice);
//        }
    }
}

