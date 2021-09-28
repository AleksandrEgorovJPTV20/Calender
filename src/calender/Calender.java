/*
В восточном календаре принят 60-летний цикл, состоящий из 12-
летних подциклов, обозначаемых названиями цвета: зеленый, 
красный, желтый, белый и черный. В каждом подцикле годы носят 
названия животных: крысы, коровы, тигра, зайца, дракона, змеи, 
лошади, овцы, обезьяны, курицы, собаки и свиньи. По номеру года 
определить его название, если 1984 год — начало цикла: «год 
зеленой крысы».
Aleksandr Egorov JPTV20
*/

package calender;

import java.util.Scanner;

public class Calender{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        int formula = (year/10)*10; //Переменную введёную пользователем year делим на 10, и умножаем.
        int colour = year - formula; //Переменную year вычитаем на значение переменной formula. Например 2003-2000, colour получает остаток.
        int animal = year%12; // Делит year на 12 и возвращает остаток, сохраняется в перемнной

        System.out.print("Год ");

        //Условный оператор, который дает возможность сравнивать переменную со списком значений.
        // Если значение colour = 4 и значение animal = 6 то он выведет на экран год зеленого тигра!
        switch (animal) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 10:
            case 11:
        switch (colour) {
            case 0:
            case 1:
                System.out.print("белой ");
                break;
            case 2:
            case 3:
                System.out.print("черной ");
                break;
            case 4:
            case 5:
                System.out.print("зеленой ");
                break;
            case 6:
            case 7:
                System.out.print("красной ");
                break;
            case 8:
            case 9:
                System.out.print("желтой ");
                break;
            default:
                break;
        }
                break;
            
            case 6:
            case 7:
            case 8:
        switch (colour) {
            case 0:
            case 1:
                System.out.print("белого ");
                break;
            case 2:
            case 3:
                System.out.print("черного ");
                break;
            case 4:
            case 5:
                System.out.print("зеленого ");
                break;
            case 6:
            case 7:
                System.out.print("красного ");
                break;
            case 8:
            case 9:
                System.out.print("желтого ");
                break;
            default:
                break;
        }
                break;
        }

        switch (animal) {
            case 0:
                System.out.println("обезьяны!");
                break;
            case 1:
                System.out.println("курицы!");
                break;
            case 2:
                System.out.println("собаки!");
                break;
            case 3:
                System.out.println("свиньи!");
                break;
            case 4:
                System.out.println("крысы!");
                break;
            case 5:
                System.out.println("коровы!");
                break;
            case 6:
                System.out.println("тигра!");
                break;
            case 7:
                System.out.println("кролика!");
                break;
            case 8:
                System.out.println("дракона!");
                break;
            case 9:
                System.out.println("змеи!");
                break;
            case 10:
                System.out.println("лошади!");
                break;
            case 11:
                System.out.println("овцы!");
                break;
        }
    }
}