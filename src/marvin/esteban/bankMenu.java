package marvin.esteban;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Marvin
 */
public class bankMenu {

    public static int menu() {
        System.out.println("Menu Principal");
        System.out.println("[1] Consultar saldo");
        System.out.println("[2] Ingresar dinero");
        System.out.println("[3] Sacar dinero");
        System.out.println("[4] Realizar transferencia");
        System.out.println("[5] Salir");
        System.out.print("Ingrese una opcion: ");
        Scanner sc = new Scanner(System.in);
        int opc = sc.nextInt();

        return opc;
    }

    public static void consultarSaldo(ArrayList<Account> cuentas) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre del titular: ");
        String titular = sc.nextLine();
        for (int i = 0; i < cuentas.size(); i++) {
            if (titular.equalsIgnoreCase(cuentas.get(i).getHolder())) {
                System.out.println("El saldo de la cuenta de " + cuentas.get(i).getHolder() + " es " + cuentas.get(i).getBalance());
            }

        }

    }

    public static void ingresarDinero(ArrayList<Account> cuentas) {
        Scanner sc = new Scanner(System.in);
        int seleccion;
        int ingreso;
        System.out.print("Ingrese nombre del titular: ");
        String titular = sc.nextLine();

        for (int i = 0; i < cuentas.size(); i++) {
            if (titular.equalsIgnoreCase(cuentas.get(i).getHolder())) {
                System.out.print("Introduzca dinero dinero a ingresar: ");
                seleccion = sc.nextInt();
                ingreso = seleccion + cuentas.get(i).getBalance();
                cuentas.get(i).setBalance(ingreso);
                System.out.println("El dinero ha sido ingresado en la cuenta.");
            }

        }

    }

    public static void sacarDinero(ArrayList<Account> cuentas) {
        Scanner sc = new Scanner(System.in);
        int seleccion;
        int retiro;
        System.out.print("Ingrese nombre del titular: ");
        String titular = sc.nextLine();

        for (int i = 0; i < cuentas.size(); i++) {
            if (titular.equalsIgnoreCase(cuentas.get(i).getHolder())) {
                System.out.print("Introduzca dinero dinero a retirar: ");
                seleccion = sc.nextInt();
                retiro = cuentas.get(i).getBalance() - seleccion;
                cuentas.get(i).setBalance(retiro);
                System.out.println("El dinero ha sido retirado de la cuenta.");
            }

        }
    }

    public static void realizarTransferencia(ArrayList<Account> cuentas) {
        Scanner sc = new Scanner(System.in);     
        System.out.print("Ingrese nombre el del titular origen: ");
        String titularOrigen = sc.nextLine();
        int cantidadTransfer = 0;
        int dineroOrigen;
        int dineroDestino;
          for (int i = 0; i < cuentas.size(); i++) {
            if (titularOrigen.equalsIgnoreCase(cuentas.get(i).getHolder())) {
                System.out.print("Ingrese el nombre del destinatario: ");
                String titularDestinatario = sc.nextLine();
                    for (int j = 0; j < cuentas.size(); j++) {
                        if (titularDestinatario.equalsIgnoreCase(cuentas.get(j).getHolder())){
                        System.out.print("Ingrese la cantidad a transferir: ");
                        cantidadTransfer = sc.nextInt();
                        
                        if(cantidadTransfer < cuentas.get(i).getBalance()){
                        dineroOrigen = cuentas.get(i).getBalance()-cantidadTransfer;
                        cuentas.get(i).setBalance(dineroOrigen);
                            System.out.println("Transferencia realizada exitosamente");
                        }else{
                        dineroOrigen = cantidadTransfer-cuentas.get(i).getBalance();
                        cuentas.get(i).setBalance(dineroOrigen);    
                            System.out.println("Transferencia realizada exitosamente");
                        }
                        dineroDestino = cantidadTransfer + cuentas.get(j).getBalance();
                        cuentas.get(j).setBalance(dineroDestino);
                        }
                }
                    
            }

        }
        
        
    }
}
