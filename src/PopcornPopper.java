public class PopcornPopper {

    public boolean thereIsPop;

    public PopcornPopper(){
        thereIsPop = false;
    }

    public void madePopcorn(){
        thereIsPop = true;
        System.out.println("Popcorn +");
    }

    public void clean(){
        thereIsPop = false;
        System.out.println("Popcorn popper clean");
    }
}
