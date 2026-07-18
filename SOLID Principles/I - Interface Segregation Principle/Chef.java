class Chef implements ChefTask {
    @Override
    public void cook() {
        System.out.println("Cooking food");
    }

    @Override
    public void decideMenu() {
        System.out.println("Deciding menu for the day");
    }
    
}
