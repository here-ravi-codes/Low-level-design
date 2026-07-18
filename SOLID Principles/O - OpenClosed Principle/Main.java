public class Main{
    public static void main(String[] args){
        InvoiceDB invoiceDB = new InvoiceDB();
        InvoiceFile invoiceFile = new InvoiceFile();
        invoiceDB.saveInvoice();
        invoiceFile.saveInvoice();
    }
}