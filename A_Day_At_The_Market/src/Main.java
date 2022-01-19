public class Main {

    public static void main(String[] args) {


        System.out.println( whoWinsTonight(3, 7, 2, 5));


    }


     public static String whoWinsTonight(int BillsAmountOfMoney, int WillsAmountOfInventorySpace, int itemPrice, int itemsSize) {
      if ( (BillsAmountOfMoney / itemPrice) < (WillsAmountOfInventorySpace / itemsSize) ) {
          return "Will";
      } else if ( (BillsAmountOfMoney / itemPrice) == (WillsAmountOfInventorySpace / itemsSize) ){
          return "Tie";
         } else {
          return "Bill";
      }
    }
}
