public class Invoice {

    private Lineitem lineitem1;

    private Lineitem lineitem2;

    private Lineitem lineitem3;

    public Invoice(Lineitem lineitem1 , Lineitem lineitem2, Lineitem lineitem3) {
        this.lineitem1 = lineitem1;
        this.lineitem2 = lineitem2;
        this.lineitem3 = lineitem3;
    }

    public Lineitem getLineitem1() {
        return lineitem1;
    }

    public Lineitem getLineitem2() {
        return lineitem2;
    }

    public Lineitem getLineitem3() {
        return lineitem3;
    }

    public void setLineitem1(Lineitem newLineitem) {
        this.lineitem1 = newLineitem;
    }

    public void setLineitem2(Lineitem newLineitem) {
        this.lineitem2 = newLineitem;
    }

    public void setLineitem3(Lineitem newLineitem) {
        this.lineitem3 = newLineitem;
    }

    public double getInvoiceTotal() {
        double total = lineitem1.getTotal() + lineitem2.getTotal() + lineitem3.getTotal();
        return total;
    }
}
