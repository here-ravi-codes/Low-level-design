class Invoice {
    Marker marker;
    int quantity;
    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }
    public int calculateTotal(){
        int price = (marker.price * this.quantity);
        return price;
    }
}
