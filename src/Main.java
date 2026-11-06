import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hvilken tabel vil du træne?");
    int tal = sc.nextInt();
    System.out.println("Fedt, du vil træne " + tal + "-tabellen!");
    System.out.println("Hvor lang skal tabellen være? (1-10");
    int tal1 = sc.nextInt();
    for ( int i = 1; i <= tal1; i++ ) {
        System.out.println(tal * i);
    }
}
