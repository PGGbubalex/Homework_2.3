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

        var totalWorkTime = 640;
        var eachWorkerTime = 8;
        var workers = totalWorkTime / eachWorkerTime;
        System.out.println("Всего работников в компании - " + workers + " человек");
        var extraWorkers = 94;
        var totalWorkers = workers + extraWorkers;
        var newEachWorkerTime = totalWorkTime / totalWorkers;
        System.out.println("Если в компании работает " + totalWorkers + " человек, то всего " + newEachWorkerTime + " часов работы может быть поделено между сотрудниками");

    }
}