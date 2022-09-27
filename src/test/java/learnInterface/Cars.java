package learnInterface;

public interface Cars {

    void carSpeed();
    void carModel();
    void carPrise();

 }
class Auto1 implements Cars {
    @Override
    public void carModel() {
        System.out.println("BMW");
    }

    @Override
    public void carSpeed() {
        System.out.println("300");
    }

    @Override
    public void carPrise() {
        System.out.println("20000$");
    }
}
 class Auto2 implements Cars {
     @Override
     public void carModel() {
         System.out.println("Tesla");
     }

        @Override
        public void carSpeed() {
            System.out.println("280");
        }

        @Override
        public void carPrise() {
            System.out.println("25000$");
     }
}
class Main{
    public static  void main(String[] args) {
        Cars myAuto1 = new Auto1();
        Cars myAuto2 = new Auto2();
        myAuto1.carModel();
        myAuto1.carSpeed();
        myAuto1.carPrise();
        myAuto2.carModel();
        myAuto2.carPrise();
        myAuto2.carSpeed();

    }
}







