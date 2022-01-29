import java.util.Optional;

public interface PaymentMethod {
    public Optional<Payment> makePayment(int amount);
}
