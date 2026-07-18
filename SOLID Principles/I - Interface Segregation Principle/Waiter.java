class Waiter implements WaiterTask {
    @Override
    public void takeOrder() {
        System.out.println("Taking order from customer");
    }

    @Override
    public void serveFood() {
        System.out.println("Serving food to customer");
    }
    
}
