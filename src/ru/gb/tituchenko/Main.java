package ru.gb.tituchenko;
/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 **/
public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     *
     * @param args стандартные аргументы командной строки
     **/
    public static void main(String[] args) {
        inputWord.saveWord("text.txt",Decorator.decorate(inputWord.getWord()));
    }
}