/*
Создать класс компьютер.
Поля:
isOn boolean
	- процессор    Boolean
	- оперативка Boolean
	- жесткий диск Boolean
	- ресурс полных циклов работы (включений/выключений) int
Методы:
	- метод описание(вывод всех полей)
вывод:  [“есть”, “есть”, “есть”, 18 циклов]
	- метод включить, при включении может произойти сбой, при вызове метода
рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
угадали комп включается, если нет сгорает. Если комп сгорел, при попытке
включить нужно выдать сообщение что ему конец
	- выключить (аналогично включению)
	- при превышении лимита ресурса комп сгорает

 */

package Lesson5;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(true, true, true, 1);
        Computer computer2 = new Computer(false, true, true, 1);
        System.out.println("Компьютер 1: " + computer1);
        System.out.println("Компьютер 2: " + computer2);
        System.out.println("Компьютер 1 включился: " + computer1.switchingOn());
        System.out.println("Компьютер 2 включился: " + computer2.switchingOn());
        System.out.println("Компьютер 1 выключился: " + computer1.switchingOff());
        System.out.println("Компьютер 2 выключился: " + computer2.switchingOff());
    }
}
