package plymorphism;

 abstract class Plane1{
    void takeOff(){
        System.out.println("plane takeOff");
    }

     abstract void fly();

    void land(){
        System.out.println("plane landed");
    }
}

   class CargoPlane1 extends Plane1 {
    void fly(){
        System.out.println("plane flys at low altitude");
    }
//     void fly();

    void carryGoods(){
        System.out.println("plane carries goods");
    }

  }

class PassengerPlane1 extends Plane1 {
    void fly(){
        System.out.println("plane flys at medium altitude");
    }

    void carryHumans(){
        System.out.println("plane carries passenger");
    }
}

class FighterPlane1 extends Plane1 {
    void fly(){
        System.out.println("plane flys at high altitude");
    }

    void carryWeapons(){
        System.out.println("plane carries weapon");
    }
}

class Airport {
    void permit(Plane1 ref){
        ref.takeOff();
        ref.fly();
        ref.land();
    }

}


class Launcher1{
    public static void main(String[] args) {
        CargoPlane1 cp = new CargoPlane1();
        PassengerPlane1 pp = new PassengerPlane1();
        FighterPlane1 fp = new FighterPlane1();
        Airport a =new Airport();

        System.out.println("================");
        System.out.println("CargoPlane");
        System.out.println("================");
        a.permit(cp);
        cp.carryGoods();//specialised method
        System.out.println("================");
        System.out.println("PassengerPlane");
        System.out.println("=================");
        a.permit(pp);
        pp.carryHumans();//specialised method
        System.out.println("==================");
        System.out.println("FighterPlane");
        System.out.println("==================");
        a.permit(cp);
        fp.carryWeapons();//specialised method
    }

}
