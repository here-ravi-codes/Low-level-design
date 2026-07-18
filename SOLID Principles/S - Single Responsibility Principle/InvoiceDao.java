class InvoiceDao{
    Invoice invoice;
    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }
    public void saveInvoice(){
        System.out.println("Invoice saved for marker: " + invoice.marker.name + " with quantity: " + invoice.quantity + " and total price: " + invoice.calculateTotal());
    }
}