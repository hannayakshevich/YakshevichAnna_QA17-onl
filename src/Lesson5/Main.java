<<<<<<< HEAD
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

=======
>>>>>>> origin/Lesson5
package Lesson5;

public class Main {

    public static void main(String[] args) {
        Computer dell = new Computer(true,true,true,20);
        Computer lenovo = new Computer(true,false,true,0);
        Computer mac = new Computer();

        mac.setRam(true);
        mac.setCpu(true);
        mac.setHdd(true);
        mac.setLifeCyclesCount(5);
        dell.computerDescription();
        lenovo.computerDescription();
        dell.switchOn();
        lenovo.switchOn();
        if (lenovo.isRam()){
            lenovo.switchOn();
        } else {
            lenovo.setRam(true);
            lenovo.switchOn();
        }
        lenovo.computerDescription();
        dell.switchOff();
        dell.computerDescription();
        lenovo.switchOff();
        lenovo.computerDescription();
    }
}
