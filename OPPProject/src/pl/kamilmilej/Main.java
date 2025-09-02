package pl.kamilmilej;

import pl.kamilmilej.drive.Drive;
import pl.kamilmilej.drive.SSDDrive;
import pl.kamilmilej.file.File;
import pl.kamilmilej.file.image.GIFImageFile;
import pl.kamilmilej.file.image.JPGImageFile;
import pl.kamilmilej.file.music.MP3File;
import pl.kamilmilej.usbdevice.MemoryStick;
import pl.kamilmilej.usbdevice.Mouse;
import pl.kamilmilej.usbdevice.USBDevice;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Monitor dell = new Monitor("Dell");

        Drive ssdDrive = new SSDDrive();
        Computer computer = new Computer(dell, ssdDrive);
//        ssdDrive.addFile(new File("photo.jpg"));
//        ssdDrive.listFiles();
//
//        computer.addFile(new File("file.png"));
//        computer.listFiles();

        Mouse mysz = new Mouse("Mysz");

        MemoryStick pendrive = new MemoryStick("Pendrive");
        computer.addUSBDevice(mysz);
        computer.addUSBDevice(pendrive);

        List<USBDevice> usbDevices = computer.getUsbDevices();

        for (USBDevice devices : usbDevices) {
            System.out.println(devices.getName());
        }

        computer.removeUSBDevices(mysz);

        pendrive.eject();
        computer.removeUSBDevices(pendrive);

        for (USBDevice devices : usbDevices) {
            System.out.println(devices.getName());
        }

        System.out.println("make from 0");

        MP3File mp3File = new MP3File("AudioMP3.mp3", 4000, "Rammstein", "Sonne", 100);

        GIFImageFile gifImageFile = new GIFImageFile("funnyDog.gif", 150);

        JPGImageFile jpgImageFile = new JPGImageFile("holidays.jpg", 400, 80);

        SSDDrive ssdDrive1 = new SSDDrive();

        computer.addFile(mp3File);
        computer.addFile(gifImageFile);
        computer.addFile(jpgImageFile);

        computer.listFiles();

        System.out.println(" nx topic ");

        File files = computer.findFiles("AudioMP3.mp3");
        System.out.println(files.getName());
        System.out.println(files.getSize());
        System.out.println(files.getType());
        System.out.println(files);










/*        System.out.println (dell.getResolution());
        dell.setLowResolution();
        System.out.println(dell.getResolution());*/

    }
}