package lesson5;

public class MassiveUtils {


    /**
     *  Формулв создания метода
     *   1- модификатор доступа(одно из четырех слов )
     *   public метод будет доступен внутри всего проекта
     *   ------ будет доступен внутри пакета(текущей папки)
     *   protecter  внутри пакета и его наследникам
     *   private  только внутри текущего класса
     *
     *   2- static (пишется или нет)
     *   3 - возвращаемый тип (или слово void если его нет)
     *   4- название метода
     *   5-входящие параметры в круглых скобках через запятую с указанием типа
     *   6 - тело метода (то что будет происходить когда вызовут метод)
     */

    public static void printMassiveToConcole(int[][] mass){
        for (int i = 0 ; i <mass.length;i++){
            for (int j = 0 ; j<mass[i].length;j++){
                System.out.print(mass[i][j]+" ");

            }
            System.out.println();

        }
    }

   public static int countGlassFromMassive(int [][]mass){
        int count=0;
        for (int i = 0 ; i<mass.length;i++){
            for (int j = 0 ; j < mass[i].length;j++){
                if (mass[i][j]%2==0){
                    count++;

                }

            }

        }
        return count;

   }


}
