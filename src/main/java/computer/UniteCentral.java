package computer;

public class UniteCentral {

    private VGA vga;

    public void print(String msg){
        System.out.println("*********");
        vga.print(msg);
        System.out.println("**********");
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
