package homeWorkLesson4;

public class TaskOne {
    public static void main(String[] args) {
        String[] text = {"It s hard for me to learn programming but I will learn it"};
        for (String aStrArr : text) {
            for (int i = aStrArr.length()-1; i >=0; i--) {
                switch (aStrArr.charAt(i)) {
                    case 'a': case 'e': case 'i': case 'o': case 'u': case 'y':
                    case 'A': case 'E': case 'I': case 'O': case 'U': case 'Y':
                        System.out.println(" " + aStrArr.charAt(i));
                }

            }
        }
    }
}
