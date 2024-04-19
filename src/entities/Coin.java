package entities;

public class Coin {
    private double conversion;

    public Coin(ConvertedCoin currencyCoin) {
        this.conversion = currencyCoin.conversionResult();
    }

    @Override
    public String toString() {
        return "Valor da Conversão: " + String.valueOf(conversion);
    }
}
