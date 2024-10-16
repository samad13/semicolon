package boyfriend;

public class YabaBoyfriend implements Boyfriend {

    @Override
    public void spend() {
        System.out.println("YabaBoyfriend  no  dey spend");
    }

    @Override
    public void last() {
        System.out.println("YabaBoyfriend  last for 3hours");
    }

    @Override
    public void care() {
        System.out.println("YabaBoyfriend  cares a little");
    }

};