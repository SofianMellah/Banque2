package com.afpa.www.main;

import com.afpa.www.bean.CompteClassique;
import com.afpa.www.bean.CompteLivretA;

public class Main {
    public static void main(String[] args) {

        // Début compte classique
        CompteClassique fatimaCompteClassique = new CompteClassique("Fatima", 87, 500, "compte classique");
        System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
        fatimaCompteClassique.depotCompteClassique(700);
        System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
        fatimaCompteClassique.depotCompteClassique(-300);
        System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
        fatimaCompteClassique.retraitCompteClassique(1500);
        System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
        fatimaCompteClassique.retraitCompteClassique(1350);
        System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
        // Fin compte classique


        // Début compte livret A
        CompteLivretA fatimaCompteLivretA = new CompteLivretA("Fatima", 87, 300, "compte livret A");
        System.out.println(fatimaCompteLivretA.renseignementsCompteCLivretA());
        fatimaCompteLivretA.depotCompteLivretA(500);
        System.out.println(fatimaCompteLivretA.renseignementsCompteCLivretA());
        System.out.println(fatimaCompteLivretA.renseignementsCompteCLivretA());
        // Fin compte livret A


        // Début compte épargne logement

        // Fin compte épargne logement
    }
}