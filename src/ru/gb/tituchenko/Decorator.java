package ru.gb.tituchenko;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
* Декоратор. Он декорирует, то есть, накладывает на результат декорации.
* Внешний вид важен, поэтому этот класс существует.
**/
public class Decorator {
/**
* Функция декорирования строки для записи в файл
* в виде строки с преамбулой 'Текущая дата -> '
*
* @param s строка, требующее декорации
* @return Отформатированная строка.
**/
        public static String decorate(String s) {
        /**
        *Метод декорирует строку, добавляя к ней текущую дату
        * при помощи функции форматирования строк
        **/
        Date current = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.YYYY");
        return String.format("%s -> %s", formatter.format(current),s);
        }
}