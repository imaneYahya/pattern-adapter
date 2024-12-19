import computer.*;
import computer.adapter.HdmiVgaAdapter;
import computer.adapter.HdmiVgaAdapterHeritage;

public class Test {
    public static void main(String[] args) {
        UniteCentral uniteCentral = new UniteCentral();
        uniteCentral.setVga(new Ecran());
        uniteCentral.print("hello imane");
        uniteCentral.setVga(new VideoProjector());
        uniteCentral.print("add video projetcor");


        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());

        uniteCentral.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.print("ccc ccc");

        HdmiVgaAdapterHeritage hdmiVgaAdapterH = new HdmiVgaAdapterHeritage();

        uniteCentral.setVga(hdmiVgaAdapterH);
        hdmiVgaAdapterH.print("test heritage ");



        uniteCentral.setVga(new SuperVP());
        uniteCentral.print("hello");


        HdmiVgaAdapter hdmiVgaAdapter1 = new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentral.setVga(hdmiVgaAdapter1);
        uniteCentral.print("Bonj");

    }
}
