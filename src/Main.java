public class Main {
    public static void main(String[] args) {
        var firstBoxerWeight = 78.2;
        System.out.println("Вес первого боксера " + firstBoxerWeight + " кг");
        var secondBoxerWeight = 82.7;
        System.out.println("Вес первого боксера " + secondBoxerWeight + " кг");
        var generalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + generalBoxersWeight + " кг");
        var wightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница веса бойцов " + wightDifference + " кг");
    }
}