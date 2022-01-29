import java.util.Optional;
import java.util.UUID;

public class CreditCard implements PaymentMethod {
    private final long cardNumber;

    public CreditCard(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public Optional<Payment> makePayment(int value){
        if(Math.random()>0.3){
            return null;
        }else{
            return null;
        }
    }
}
