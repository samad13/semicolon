package boyfriend;

public class Girl {
    private final Boyfriend boyfriend;

    public Girl(Boyfriend myGuy) {
       this.boyfriend = myGuy;
    }


    public void spend(){
        boyfriend.spend();
    };

    public void last(){
        boyfriend.last();
    }
    public void care(){
        boyfriend.care();
    }
}
