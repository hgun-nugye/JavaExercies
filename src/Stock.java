public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock() {
        symbol = "VNI";
        name = "VN-Index";
    }

    Stock(String Symbol, String Name, double PreviousClosingPrice, double CurrentPrice) {
        symbol = Symbol;
        name = Name;
        previousClosingPrice = PreviousClosingPrice;
        currentPrice = CurrentPrice;
    }

    //lấy giá trị của các thuộc tính
    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double changePercent() {
        return 100 - (Math.min(previousClosingPrice, currentPrice) / Math.max(previousClosingPrice,
                currentPrice) * 100);
    }

    public static void main(String[] args) {
        Stock stk = new Stock("SUNW", "Sun Microsystems Inc", 100, 90);
        System.out.print("Tỉ lệ thay đổi của giá cổ phiếu là: " + stk.changePercent() + "%");

    }
}
