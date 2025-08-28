import java.util.Objects;

public class Money {
    private int value;
    private String currency;

    public Money(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;
        return value == money.value && Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + Objects.hashCode(currency);
        return result;
    }
}
