public class TV {
    public boolean isTVOn;

    public TV(){
        this.isTVOn = false;
    }

    public void playTV(){
        isTVOn = true;
        System.out.println("TV play");
    }

    public void off(){
        isTVOn = false;
        System.out.println("TV off");
    }
}
