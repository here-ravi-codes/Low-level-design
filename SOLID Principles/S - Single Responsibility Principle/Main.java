public class Main {
    public static void main(String[] args){
        Invoice invoice = new Invoice(new Marker("Reynolds", "Blue", 2020, 20), 10);
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoice.calculateTotal();
        invoiceDao.saveInvoice();
        invoicePrinter.printInvoice();
    }
}