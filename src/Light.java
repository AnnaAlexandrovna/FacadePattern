public class Light {
    public boolean light;

    public Light(){
        this.light = false;
    }

    public void on(){
        light = true;
        System.out.println("Light on");
    }

    public void off(){
        light = false;
        System.out.println("Light off");
    }
}
