package factory;

public class Client {
    public static void main(String[] args){
        Client  client = new Client();
        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip","hailey@gmail.com");
        System.out.println(whiteShip);
        Ship blackShip = new BlackShipFactory().orderShip("blackShip","hailey@gmail.com");
        System.out.println(blackShip);
    }
}
