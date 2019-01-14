package PackegeLab5;

import java.util.Scanner;;
import java.util.*;

class main {

    public static void main(String[] args) {

        String str;
        Scanner a = new Scanner(System.in);
        System.out.print("Введите строку которую хотите изметить:");
        String pattern_0 = a.nextLine();
        System.out.print("Введите что заменить:");
        String pattern = a.nextLine();
        System.out.println("Введите шаблон вместо него:");
        String pattern_1 = a.nextLine();
        String fileName = "D:\\File.txt";
        ReplacingString words = new ReplacingString();
        saveFile save_f = new saveFile();
        save_f.write_file(fileName, words.replace(pattern_0,pattern , pattern_1 ));
        System.out.println(words.replace(pattern_0,pattern , pattern_1  ));
    }
}