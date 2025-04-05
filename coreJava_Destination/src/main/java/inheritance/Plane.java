package inheritance;

public class Plane {
    void takeOff(){
        System.out.println("plane takeOff");
    }

    void fly(){
        System.out.println("plane fly");
    }

    void land(){
        System.out.println("plane landed");
    }
}

class CargoPlane extends Plane{
    void fly(){
        System.out.println("plane flys at low altitude");
    }

    void carryGoods(){
        System.out.println("plane carries goods");
    }
}

class PassengerPlane extends Plane{
    void fly(){
        System.out.println("plane flys at medium altitude");
    }

    void carryHumans(){
        System.out.println("plane carries passenger");
    }
}

class FighterPlane extends Plane{
    void fly(){
        System.out.println("plane flys at high altitude");
    }

    void carryWeapons(){
        System.out.println("plane carries weapon");
    }
}


class Launcher{
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        System.out.println("================");
        System.out.println("CargoPlane");
        System.out.println("================");
        cp.takeOff();
        cp.fly();
        cp.carryGoods();
        cp.land();
        System.out.println("================");
        System.out.println("PassengerPlane");
        System.out.println("=================");
        pp.takeOff();
        pp.fly();
        pp.carryHumans();
        pp.land();
        System.out.println("==================");
        System.out.println("FighterPlane");
        System.out.println("==================");
        fp.takeOff();
        fp.fly();
        fp.carryWeapons();
        fp.land();
    }

}