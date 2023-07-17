/**
 * Создать производный от Car класс PassengerCar.
 * o Новые поля: количество пассажиров, ремонтная книжка (словарь вида string запчасти: int год замены
 * (т. к. не проходили словари, в крайнем случае можно заменить это поле на что-нибудь другое);
 * o Определить конструктор;
 * o Определить следующие функции:
 * ▪ Добавление замененной запчасти в ремонтную книжку;
 * ▪ Получение года замены по названию;
 * ▪ Форматированная печать всей ремонтной книжки.
 * o Сделать метод преобразования в строку (т. е. Print()) для печати основной информации (из класса Car)
 * и дополнительной: количество пассажиров.
 */

import java.util.*;


public class PassengerCar extends Car {
    private int passCount;
    private Map<String, Integer> repairBook;


    public PassengerCar(String brand, int power, int yearOfCreate, int passCount) {
        super(brand, power, yearOfCreate);
        this.passCount = passCount;
        this.repairBook = new HashMap<>();
    }

    public void AddRepair(String tools, Integer year) {
        repairBook.put(tools, year);
    }

    public void PrintRepairBook() {
        for (Map.Entry<String, Integer> entry : repairBook.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }
//        System.out.println(repairBook.keySet());
//        System.out.println(repairBook.values());
//        System.out.println(repairBook.containsValue(2023));

    }


    @Override
    public void Print() {
        super.Print();
        System.out.println("Количество пассажиров: " + passCount);
        System.out.println("=====================================");
        PrintRepairBook();
    }
}
