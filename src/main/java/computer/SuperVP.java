package computer;

public class SuperVP implements HDMI,VGA{
    @Override
    public void view(byte[] data) {
        String message = new String(data);
        System.out.println("''''''superVP via HDMI''''''");
        System.out.println(message);
        System.out.println("''''''superVP via HDMI''''''");

    }

    @Override
    public void print(String msg) {
        System.out.println("-------superVP--via VGA-----");
        System.out.println(msg);
        System.out.println("-------superVP-------");

    }
}
