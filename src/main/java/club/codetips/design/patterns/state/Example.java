package club.codetips.design.patterns.state;

/**
 * @author ravikumar
 * @since 24/02/23
 */
public class Example {

    // State
    public interface VendingMachineState {

        void start();

        void insertCoin(int coin);

        void selectItem(String item);

        void dispenseItem();
    }






    // Concrete State classes
    public static class IdleState implements VendingMachineState {
        private VendingMachine context;

        public IdleState(VendingMachine context) {
            this.context = context;
        }

        @Override
        public void start() {
            context.setState(context.getAcceptingCoinsState());
        }

        public void insertCoin(int coin) {
            System.out.println("Please start the process");
        }

        public void selectItem(String item) {
            System.out.println("Please insert coins to make a purchase.");
        }

        public void dispenseItem() {
            System.out.println("Please select an item to purchase.");
        }
    }



    public static class AcceptingCoinsState implements VendingMachineState {
        private VendingMachine context;

        public AcceptingCoinsState(VendingMachine context) {
            this.context = context;
        }

        @Override
        public void start() {
            System.out.println("invalid state");
        }

        public void insertCoin(int coin) {
            context.setBalance(coin);
            System.out.println("Accepted coin: " + coin);
            System.out.println("Current balance: " + context.balance);
            context.setState(context.getSelectItemState());

        }

        public void selectItem(String item) {
            System.out.println("invalid state");
        }

        public void dispenseItem() {
            System.out.println("Please select an item to purchase.");
        }
    }







    public static class DispensingItemState implements VendingMachineState {
        private VendingMachine context;

        public DispensingItemState(VendingMachine context) {
            this.context = context;
        }

        @Override
        public void start() {
            System.out.println("invalid state");
        }

        public void insertCoin(int coin) {
            System.out.println("Cannot insert coins while dispensing item.");
        }

        public void selectItem(String item) {
            System.out.println("Cannot select item while dispensing item.");
        }

        public void dispenseItem() {
            System.out.println("Dispensing item: " + context.getSelectedItem());
            context.setBalance(0);
            context.setSelectedItem("");
            context.setState(context.getIdleState());
        }
    }





    public static class SelectItemState implements VendingMachineState {
        private VendingMachine context;

        public SelectItemState(VendingMachine context) {
            this.context = context;
        }

        @Override
        public void start() {
            System.out.println("invalid state");
        }

        public void insertCoin(int coin) {
            System.out.println("Cannot insert coins while dispensing item.");
        }

        public void selectItem(String item) {
            System.out.println("Item selected: " + item);
            context.setSelectedItem(item);
            context.setState(context.getDispensingItemState());
        }

        public void dispenseItem() {
            System.out.println("invalid state");
        }

    }




    // Context class
    public static class VendingMachine {
        private IdleState idleState;
        private AcceptingCoinsState acceptingCoinsState;
        private DispensingItemState dispensingItemState;
        private final SelectItemState selectItemState;
        private VendingMachineState state;
        private int balance;
        private String selectedItem;

        public VendingMachine() {
            idleState = new IdleState(this);
            acceptingCoinsState = new AcceptingCoinsState(this);
            dispensingItemState = new DispensingItemState(this);
            selectItemState = new SelectItemState(this);
            state = idleState;
            balance = 0;
            selectedItem = "";
        }

        public void setState(VendingMachineState state) {
            this.state = state;
        }

        protected VendingMachineState getIdleState() {
            return idleState;
        }

        protected VendingMachineState getAcceptingCoinsState() {
            return acceptingCoinsState;
        }

        protected VendingMachineState getDispensingItemState() {
            return dispensingItemState;
        }

        protected VendingMachineState getSelectItemState() {
            return selectItemState;
        }

        public void start(){
            state.start();
        }

        public void insertCoin(int coin) {
            state.insertCoin(coin);
        }

        public void selectItem(String item) {
            state.selectItem(item);
        }

        public void dispenseItem() {
            state.dispenseItem();
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }

        public String getSelectedItem() {
            return selectedItem;
        }

        public void setSelectedItem(String selectedItem) {
            this.selectedItem = selectedItem;
        }
    }

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.start();
        vendingMachine.insertCoin(10);
        vendingMachine.selectItem("item1");
        vendingMachine.dispenseItem();
    }
}
