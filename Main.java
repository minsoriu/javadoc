// В качестве практики взята задача с шоколадками

import java.util.Scanner;

/**
 * Точка входа в программу
 */
public class Main {
    /**
     * Ввод начальных значений: общей суммы, цены за 1 шоколадку, количество обёрток для получения 1 шоколадки
     * Применение метода и вывод результата
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите всю сумму:");
        int money = sc.nextInt();
        System.out.println("Введите цену за 1 шоколадку:");
        int price = sc.nextInt();
        System.out.println("Введите количество обёрток, нужное, чтобы получить ещё одну шоколадку:");
        int wrap = sc.nextInt();
        int result = chocolates(money, price, wrap);
        System.out.println("Всего шоколадок: " + result);
    }

    /**
     *
     * @param m вся сумма
     * @param p цена за 1 шоколадку
     * @param w количество обёрток для получения ещё 1 шоколадки
     * @return итоговое количество шоколадок
     */
    public static int chocolates(int m, int p, int w) {
        int count = m / p;
        int wrappers = count;
        while (wrappers >= w) {
            int free = wrappers / w;
            count += free;
            wrappers = wrappers % w + free;
        }
        return count;
    }
}