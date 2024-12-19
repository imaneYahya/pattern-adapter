package computer.adapter;

import computer.HDMI;
import computer.TV;
import computer.VGA;

public class HdmiVgaAdapter implements VGA {
    private HDMI hdmi;
    @Override
    public void print(String msg) {
        System.out.println("-------- adapter ------");
        byte[] data = msg.getBytes();
        hdmi.view(data);
        System.out.println("-------- /adapter ------");


    }

    public void setHdmi(HDMI hdmi) {
        this.hdmi = hdmi;
    }
}
