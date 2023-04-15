import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static CounstryList counstryList = new CounstryList();
    public static void main(String[] args) throws IOException {
        counstryList.load();
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("1. Enter a country\n 2. show medals \n 3. show total medals \n 4. show countries \n 5. exit\n");
            int option= Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1:
                    System.out.println("Write the input with the format Country::medal type::amount");
                    String input= scanner.nextLine();
                    String[] data= input.split("::");
                    counstryList.addCountry(data);
                    break;
                case 2:
                    counstryList.showMedals();
                    break;
                case 3:
                    counstryList.totalMedals();
                    break;
                case 4:
                    counstryList.insertionSort();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}