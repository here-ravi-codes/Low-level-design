class InvoicePrinter{
    Invoice invoice;
    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }
    public void printInvoice(){
        System.out.println("Invoice for marker: " + invoice.marker.name + " with quantity: " + invoice.quantity + " and total price: " + invoice.calculateTotal() + " printed successfully.");
    }
}