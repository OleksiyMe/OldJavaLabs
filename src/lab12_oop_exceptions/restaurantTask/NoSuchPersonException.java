package lab12_oop_exceptions.restaurantTask;

public class NoSuchPersonException  extends RuntimeException {
    public NoSuchPersonException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
