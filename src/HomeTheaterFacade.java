public class HomeTheaterFacade {
    TV tv;
    PopcornPopper popcornPopper;
    Light light;

    public HomeTheaterFacade(TV tv, PopcornPopper popcornPopper, Light light ){
        this.tv = tv;
        this.popcornPopper = popcornPopper;
        this.light = light;
    }

    public void watchMovie(){
        System.out.println("Get ready to watch movie");
        popcornPopper.madePopcorn();
        tv.playTV();
        light.off();
    }

    public void endMovie(){
        System.out.println("Movie end");
        light.on();
        tv.off();
        popcornPopper.clean();
    }
}
