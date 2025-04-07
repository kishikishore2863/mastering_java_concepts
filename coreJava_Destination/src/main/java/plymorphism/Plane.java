package plymorphism;

 class Plane {
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

class CargoPlane extends Plane {
    void fly(){
        System.out.println("plane flys at low altitude");
    }

    void carryGoods(){
        System.out.println("plane carries goods");
    }
}

class PassengerPlane extends Plane {
    void fly(){
        System.out.println("plane flys at medium altitude");
    }

    void carryHumans(){
        System.out.println("plane carries passenger");
    }
}

class FighterPlane extends Plane {
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
       Plane ref;

        System.out.println("================");
        System.out.println("CargoPlane");
        System.out.println("================");
        ref = cp;
        ref.takeOff();
        ref.fly();
        cp.carryGoods();
        ref.land();
        System.out.println("================");
        System.out.println("PassengerPlane");
        System.out.println("=================");
        ref.takeOff();
        ref.fly();
        pp.carryHumans();//specialised method
        ref.land();
        System.out.println("==================");
        System.out.println("FighterPlane");
        System.out.println("==================");
        ref = fp;
        ref.takeOff();
        ref.fly();
        fp.carryWeapons();
        ref.land();
    }

}