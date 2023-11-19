//Zadanie 4 Magdalena Klarzyńska
import java.util.Scanner;
//Zmiana nazwy pliku, aby nazywał się tak samo jak utworzona klasa
public class Student {
        public static void main(String[] args) {
            //Tworzymy obiekty klasy Scanner do wczytywania danych z klawiatury
            Scanner scanner = new Scanner(System.in);

            System.out.println("Wprowadź dane studenta: ");
            //Wyświetlamy komunikat zachęcający użytkownika do wprowadzenia danych studenta i przechodzimy do nastęnej linii

            System.out.print("Imię: ");
            //Wyświetlamy komunikat zachęcający do wpisania imienia studenta
            String imie = scanner.nextLine(); //Wczytujemy wprowadzone imię

            System.out.print("Nazwisko: ");
            //Wyświetlamy komunikat zachęcający do wpisania nazwiska studenta
            String nazwisko = scanner.nextLine(); //Wczytujemy wprowadzone nazwisko

            System.out.print("Kierunek: ");
            //Wyświetlamy komunikat zachęcający do wpisania kierunku na którym studiuje student
            String kierunek = scanner.nextLine(); //Wczytujemy wprowadzony kierunek

            // Wyświetlamy wprowadzone dane
            System.out.println("Wprowadzono następujące dane studenta: ");
            System.out.println("Imię:  " + imie); //imię
            System.out.println("Nazwisko:  " + nazwisko); //nazwisko
            System.out.println("Kierunek:  " + kierunek); //kierunek

            // Zamykamy obiekt Scanner, gdy już nie jest potrzebny
            scanner.close();
    }
}