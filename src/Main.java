public class Main {
    public static void main(String[] args) {
        var totalHours = 640;
        var wokerHours = 8;
        var totalWoker = totalHours / wokerHours;
        System.out.println("Всего работников в компании: " + totalWoker + " человек.");
        var totalWoker1 = totalWoker + 94;
        var totalHours1 = totalWoker1 * 8;
        System.out.println("Если в компании работает " + totalWoker1 + " человек, то всего " + totalHours1 + " часов работы может быть поделено между сотрудниками" );
    }
}