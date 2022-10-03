package lab12_oop_exceptions.restaurantTask;

public class NoSuchJobException extends RuntimeException{
   public NoSuchJobException(String exceptionMessage){
       super(exceptionMessage);
   }
}

