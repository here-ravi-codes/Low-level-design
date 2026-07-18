public class Main {
    public static void main(String[] args){
        Macbook wiredKeyboardWiredMouse = new Macbook(new WiredMouse(), new WiredKeyboard());
        Macbook bluetoothKeyboardBluetoothMouse = new Macbook(new BluetoothMouse(), new BluetoothKeyboard());
        Macbook wiredKeyboardBluetoothMouse = new Macbook(new BluetoothMouse(), new WiredKeyboard());
        Macbook bluetoothKeyboardWiredMouse = new Macbook(new WiredMouse(), new BluetoothKeyboard());
        wiredKeyboardWiredMouse.getMouse().getMouseSpecifications();
        wiredKeyboardWiredMouse.getKeyboard().getKeyboardSpecifications();   
        bluetoothKeyboardBluetoothMouse.getMouse().getMouseSpecifications();
        bluetoothKeyboardBluetoothMouse.getKeyboard().getKeyboardSpecifications();  
        wiredKeyboardBluetoothMouse.getMouse().getMouseSpecifications();
        wiredKeyboardBluetoothMouse.getKeyboard().getKeyboardSpecifications();
        bluetoothKeyboardWiredMouse.getMouse().getMouseSpecifications();
        bluetoothKeyboardWiredMouse.getKeyboard().getKeyboardSpecifications();
    }
}
