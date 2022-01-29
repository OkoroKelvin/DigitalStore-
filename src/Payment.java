import java.util.UUID;

public class Payment {
    private final PaymentMethod paymentMethod;
    private final UUID transactionId;
    private int value;

    public Payment(PaymentMethod paymentMethod, UUID transactionId, int value) {
        this.paymentMethod = paymentMethod;
        this.transactionId = transactionId;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentMethod=" + paymentMethod +
                ", transactionId=" + transactionId +
                ", value=" + value +
                '}';
    }
}
