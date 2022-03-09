package Server021221;

public class Container <T extends Comparable<T>> implements Comparable<Container> {
    private  T genericMember;

    @Override
    public int compareTo(Container o) {
        return 0;
    }
}
