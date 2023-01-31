public class BonusMilesService {

    public int calculate(int cost) {

        System.out.println("Вы получаете 1 бонусную милю за каждые 20 рублей Вашей покупки.");
        System.out.println("Сумма покупки составляет:" + cost);

        int milePrice = 20;

        int miles = cost / milePrice;
        return miles;


    }

}



