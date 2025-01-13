package marvin.esteban;

import java.util.ArrayList;
import java.util.Scanner;
import static marvin.esteban.bankMenu.consultarSaldo;
import static marvin.esteban.bankMenu.ingresarDinero;
import static marvin.esteban.bankMenu.menu;
import static marvin.esteban.bankMenu.realizarTransferencia;
import static marvin.esteban.bankMenu.sacarDinero;

/**
 *
 * @author Marvin
 */
public class Bank {

    public static ArrayList<Account> cuentas = new ArrayList<Account>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del titular de la cuenta 1: ");
        String titu1 = sc.nextLine();
        System.out.print("Ingrese el saldo inicial de la cuenta 1: ");
        int saldo1 = sc.nextInt();
        System.out.print("Ingrese el nombre del titular de la cuenta 2: ");
        String titu3 = sc.nextLine();
        String titu2 = sc.nextLine();
        System.out.print("Ingrese el saldo inicial de la cuenta 2: ");
        int saldo2 = sc.nextInt();

        Account cuenta1 = new Account(1, saldo1, titu1);
        Account cuenta2 = new Account(2, saldo2, titu2);

        cuentas.add(cuenta1);
        cuentas.add(cuenta2);

        int opc;
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    consultarSaldo(cuentas);
                   break;
                case 2:
                    ingresarDinero(cuentas);
                    break;
                case 3:
                    sacarDinero(cuentas);
                    break;
                case 4:
                    realizarTransferencia(cuentas);
                    break;
                case 5:
                    opc = 0;
                    break;
            }
            }
            while (opc != 0);
 
    }
}
    




