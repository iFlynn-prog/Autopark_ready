/**
 * Создать производный от Car класс Truck.
 * o Новые поля: максимальная грузоподъемность, ФИ водителя, текущий груз
 * (словарь вида string название товара: int вес);
 * o Определить конструктор;
 * o Определить следующие функции:
 * ▪ Изменение водителя;
 * ▪ Добавление и удаление груза;
 * ▪ Форматированная печать текущего груза.
 * o Сделать метод преобразования в строку (т. е. Print()) для печати основной информации
 * (из класса Car) и дополнительной: максимальная грузоподъемность, ФИ водителя.
 */

import java.util.HashMap;
import java.util.Map;

public class Truck extends Car {
    private int maxVelocity;
    private String firstnameDriver;
    private String lastNameDriver;
    private Map<String, Integer> goods;

    public Truck(String brand, int power, int yearOfCreate) {
        super(brand, power, yearOfCreate);
        this.goods = new HashMap<>();
    }

    public void setMaxVelocity(int maxVelocity) {
        System.out.println(String.format("Грузоподъемность: %s", maxVelocity));
    }

    public void setFirstNameDriver(String firstnameDriver) {
        this.firstnameDriver = firstnameDriver;
    }

    public void setLastNameDriver(String lastNameDriver) {
        this.lastNameDriver = lastNameDriver;
    }

    public void RenameDriver(String firstnameDriver, String lastNameDriver) {
        if (firstnameDriver.isEmpty() | lastNameDriver.isEmpty()) {
            System.out.println("Имя, фамилия водителя пустое");
        } else {
            setFirstNameDriver(firstnameDriver);
            setLastNameDriver(lastNameDriver);
            System.out.println(String.format("Фамилия: %s", lastNameDriver));
            System.out.println(String.format("Имя: %s", firstnameDriver));
        }
    }

    public void AddGoods(String addGoods, Integer weight) {
        goods.put(addGoods, weight);
    }

    public void DelGoods(String addGoods, Integer weight) {
        goods.remove(addGoods, weight);
    }

    public void PrintCurrentGoods() {
        for (Map.Entry<String, Integer> entry : goods.entrySet()) {
            System.out.println(entry);
        }
    }

    @Override
    public void Print() {
        System.out.println("Итого по truck ++++++++++++++++++++++++");
        super.Print();
        System.out.println(String.format("Грузоподъемность: %s", maxVelocity));
        System.out.println("===============================================");
        System.out.println(String.format("Фамилия: %s", lastNameDriver));
        System.out.println(String.format("Имя: %s", firstnameDriver));
        System.out.println("===============================================");
        PrintCurrentGoods();
    }
}


