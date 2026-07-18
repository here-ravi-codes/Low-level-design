public class Main {
    public static void main(String[] args){
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        chef.cook();
        chef.decideMenu();

        waiter.takeOrder();
        waiter.serveFood();
    }
}
