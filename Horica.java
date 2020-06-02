import com.sun.xml.internal.ws.api.model.MEP;

import java.io.*;
import java.util.Scanner;

public class Horica {

    public static void main(String[] args) throws FileNotFoundException {
        Menu();
    }

    protected void readFailingFile() throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader(new File("Horica.txt")));
        rd.readLine();
}
public static void Menu()throws FileNotFoundException {
    System.out.println("изберете опция");
    System.out.println("1.Select = Селектиране на всички  граждани");
    System.out.println("2.Селектирай ми всички граждани, които са пенсионери?");
    System.out.println("3.Селектирай ми всички граждани, които имат дете на име Nikola?");
    System.out.println("4.Селектирай ми всички граждани, които са пенсионери от женски пол?");
    System.out.println("5.Селектирай ми всички граждани чието първо име е Pesho");
    System.out.println("6.Селектирай ми всички граждани на възраст 18 годиниа");
    Scanner menu = new Scanner(System.in);
    int number = menu.nextInt();

    if(number == 1) {
        System.out.println("1.Селектиране на всички граждани:");
        Select();
    }
    if(number == 2){
        System.out.println("2.Селектирай ми всички граждани, които са пенсионери");
    }
    if(number == 3){
        System.out.println("Селектирай ми всички граждани, които имат дете на име Nikola");
    }
    if(number == 4){
        System.out.println("Селектирай ми всички граждани, които са пенсионери от женски пол");
    }
    if(number == 5){
        System.out.println("Селектирай ми всички граждани чието първо име е Pesho");
    }
    if(number == 6){
        System.out.println("there is currently no one 18 years old");
    }
}
public static void Select() throws FileNotFoundException{
    File file = new File("C:\\Users\\user\\Desktop\\Horica.txt");
    Scanner scan = new Scanner(file);
    while(scan.hasNextLine()) {
        System.out.println(scan.nextLine());
    }

}


}
