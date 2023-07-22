package ru.gb.tituchenko;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * Класс с логикой запроса фразы у пользоватлея
 **/
public class inputWord {
    /**
     * Метод запршивающий строку у пользователя
     * @return строка пользователя введеная в терминале
     */
    public static String getWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите заметку: ");
        return scanner.nextLine();
    }
    /**
     * Метод сохраняющий строку в файл
     * @param fileName имя файла
     * @param s строка
     */
    public static void saveWord(String fileName,String s){
        try(FileWriter writer = new FileWriter( new File(fileName), Charset.forName("UTF8"),true))
        {
            writer.write(s);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
