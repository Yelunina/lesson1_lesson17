public class Homework3 {
        public static void main(String[] args) {
            System.out.println("Homework");

            System.out.println("task 1 ");
                /* Задача 1. Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
        Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
        Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
        Распечатайте её через println. Сколько программа отбросила в дробной части? */
            int q = 0;
            int w = 1;
            int e = 2;
            int r = 3;
            int t = 4;
            int y = 5;
            int u = 6;
            int i = 7;
            int o = 8;
            int p = 9;

            int a = (q + w + e + r + t + y + u + i + o + p)/10;

            System.out.println(a);
            // программа отбросила в дробной части - 5
            int m = (q + w + e + r + t + y + u + i + o + p)%10;
            System.out.println("Остаток от деления = " + m);

            System.out.println();
            System.out.println();

            System.out.println("task 2 ");
                /* Задача 2. Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
                 Если клиент покупает товары вместе, то на них действует скидка 100 руб на всю покупку.
                 Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
                Отдельно выведите на экран сумму скидки от этой покупки. */

            double A_price = 1000, B_price = 500, Discount = 100;
            double AB_disc = (A_price+B_price)-Discount;
            double amount_dis = Discount;

            System.out.println("Cумма покупки со скидкой: " + AB_disc);
            System.out.println("Сумма скидки: " + amount_dis);
            System.out.println();
            System.out.println();

            System.out.println("task 3 ");
                /* Задача 3. Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
                Вычислите среднюю температуру за неделю и выведете ее на печать. */
            double minMonday = 14;
            double maxMonday = 22;
            double minTuesday = 10;
            double maxTuesday = 18;
            double minWednesday = 12;
            double maxWednesday = 19;
            double minThursday = 15;
            double maxThursday = 24;
            double minFriday = 16;
            double maxFriday = 26;
            double minSaturday = 14;
            double maxSaturday = 24;
            double minSunday = 10;
            double maxSunday =26;
            double Mon = (minMonday + maxMonday)/2;
            double Tue = (minTuesday + maxTuesday)/2;
            double Wed = (minWednesday + maxWednesday)/2;
            double Thu = (minThursday + maxThursday)/2;
            double Fri = (minFriday+maxFriday)/2;
            double Sat = (minSaturday + maxSaturday)/2;
            double Sun = (minSunday + maxSunday)/2;
            double averageTempPerWeek = (Mon+Tue+Wed+Thu+Fri+Sat+Sun)/7;
            System.out.println("Средняя температура за прошедшую неделю в городе Вайль дер Штадт = "
                    + averageTempPerWeek + "\u00B0");
            System.out.printf("Средняя температура за прошедшую неделю в городе Вайль дер Штадт = %.2f"
                    , averageTempPerWeek );
            System.out.print("°");
            System.out.println();
            System.out.println();
            System.out.println("task 4 ");
                /* Задача 4.Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?
                Покажите это на конкретных примерах. */
            int n = 9 % 2;
            System.out.println(" остаток от деления 9 % 2 = " + n);
            int n1 = 90 % 3;
            System.out.println("остаток от деления 90 % 3 = " + n1 );
            System.out.println();
            System.out.println();

            System.out.println("task 5 ");
                /* Задача 5(*). int x = 3 Чему будет равно значение х после выполнения операции x += x++ ?
                Проверьте свое предположение на практике.*/
            int x =3;
            x += x++;
            System.out.println("Если x = 3, то значение х после выполнения операции x += x++ = " + x);


        }
}
