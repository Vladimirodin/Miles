public class Main {
    public static void main(String[] args) {
        int ticketPrice = 850; // Стоимость билета
        int quantityOfRubles = 20; // количество рублей для одной бонусной милли
        int bonusMillies = ticketPrice / quantityOfRubles; // бонусные мили

        System.out.println ("Начислено - " + bonusMillies + " бонусных(ая) миль(я)");
    }
}
