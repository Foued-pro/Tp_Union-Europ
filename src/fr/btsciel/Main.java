package fr.btsciel;

import fr.btsciel.clavier.In;

public class Main {
    public static void main(String[] args) {
        System.out.print("ecrivez un nombre :");
        int utilisateur = 0;
        utilisateur = In.readInteger();

        System.out.println(LesPays[utilisateur].nom);

    }
}