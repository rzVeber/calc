package org.calc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float var1,var2;
        var1=var2=0.F;

        Scanner sc = new Scanner(System.in);

        try { //проверка на коректно введенные данные
            System.out.print("Введите первое число >> ");
            var1 = sc.nextFloat();
            System.out.print("Введите второе число >> ");
            var2 = sc.nextFloat();
        } catch (Exception e){
            System.out.println("Ошибка, недопустимое значение");
            System.exit(1); //выход из программы
        }

        System.out.print("Выберете оператор \n \"+, -, *, /\" " +
                "\nВведите один из операторов >> ");
        sc.nextLine(); // очистка буфера
        String operate = sc.nextLine();

        float out=0; //блок выбора оператора
        switch (operate){
            case "+"-> {out = Funcs.sum(var1,var2);}
            case "-"-> {out = Funcs.sub(var1,var2);}
            case "*"-> {out = Funcs.mul(var1,var2);}
            case "/"-> {out = Funcs.div(var1,var2);}
            default -> {
                System.out.println("Вы не ввели нужный оператор");
                System.exit(2);
            }
        }
        System.out.println("Результат >> "+out);
    }
}