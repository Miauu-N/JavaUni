package ar.unlu.edu.poo.passwords;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_Password {

    // <la_contraseña> - Fuerte
    // <la_contraseña> - Débil

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la longitud de cada una de las contraseñas: ");
        int longitud = scan.nextInt();
        System.out.print("\nIngrese la cantidad de contraseñas a generar: ");
        int cantidad = scan.nextInt();

        ArrayList<Password> passwords = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            passwords.add(new Password(longitud));
        }

        for(Password pass : passwords){
            System.out.println(pass.getPass() + " - " + (pass.isStrong()? "Fuerte":"Debil"));
        }

    }
}
