/*
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит {name}”.
Метод getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает два параметра -
имя звонящего и номер телефона звонящего. Вызвать этот метод.
Создать метод sendMessage с аргументами переменной длины.
Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
Метод выводит на консоль номера этих телефонов.
 */
package Lesson6;

public class Main {

    public static void main(String[] args) {
        Phone samsung = new Phone(1234567, "samsung", 163.5);
        Phone xiaomi = new Phone(7654321, "xiaomi", 180);
        Phone iphone = new Phone (9876543, "iphone", 155.1);

        System.out.println(samsung.toString());
        System.out.println(xiaomi.toString());
        System.out.println(iphone.toString());

        samsung.receiveCall(samsung.getNumber());
        xiaomi.receiveCall(xiaomi.getNumber());
        iphone.receiveCall(iphone.getNumber());

        samsung.getNumber(samsung.getNumber());
        xiaomi.getNumber(xiaomi.getNumber());
        iphone.getNumber(iphone.getNumber());

        String nameSamsung = samsung.receiveCall(samsung.getNumber());
        String nameXiaomi = xiaomi.receiveCall(xiaomi.getNumber());
        String nameIphone = iphone.receiveCall(iphone.getNumber());

        samsung.receiveCall(nameSamsung, samsung.getNumber());
        xiaomi.receiveCall(nameXiaomi, xiaomi.getNumber());
        iphone.receiveCall(nameIphone, iphone.getNumber());

        samsung.sendMessage(samsung.getNumber());
        xiaomi.sendMessage(xiaomi.getNumber());
        iphone.sendMessage(iphone.getNumber());
    }
}
