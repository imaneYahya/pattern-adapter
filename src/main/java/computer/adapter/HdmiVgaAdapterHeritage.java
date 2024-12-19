package computer.adapter;

import computer.HDMI;
import computer.TV;
import computer.VGA;

public class HdmiVgaAdapterHeritage extends TV implements VGA {

    @Override
    public void print(String msg) {
        System.out.println("-------- adapter ------");
        byte[] data = msg.getBytes();
        super.view(data);
        System.out.println("-------- /adapter ------");


    }


}
