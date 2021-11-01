package HomeWorkLesson7;

public class PrintEditionService {
    public static void printBigBook (PrintEdition[] print) {
        PrintEdition big = print [0];
        for (PrintEdition edition:print){
            if(edition.getCountOfPages()>big.getCountOfPages()){
                big = edition;

            }
        }
        big.printAllInfo();
    }
}
