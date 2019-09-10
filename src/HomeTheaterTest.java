public class HomeTheaterTest {
    public static void main(String[] args) {
        TV tv = new TV();
        PopcornPopper popcornPopper = new PopcornPopper();
        Light light = new Light();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(tv, popcornPopper, light);
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
