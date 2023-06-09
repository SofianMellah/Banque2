package com.afpa.www.main;

import com.afpa.www.bean.CompteClassique;
import com.afpa.www.bean.CompteEpargneLogement;
import com.afpa.www.bean.CompteLivretA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CompteClassique fatimaCompteClassique = new CompteClassique("Fatima", 87, 500, "compte classique");
        CompteLivretA fatimaCompteLivretA = new CompteLivretA("Fatima", 87, 300, "compte livret A");
        CompteEpargneLogement fatimaCompteEpargneLogement = new CompteEpargneLogement("Fatima", 87,150, "compte épargne logement");
        CompteClassique nesrineCompteClassique = new CompteClassique("Nesrine", 15, 300, "compte classique");


        boolean nomValide = false;
        while (!nomValide) {
            System.out.println("Quel est votre nom ?");
            String nom = sc.next();

            if (nom.equalsIgnoreCase("Fatima") || nom.equalsIgnoreCase("Nesrine")) {
                nomValide = true;
                // Début Fatima
                if (nom.equalsIgnoreCase("Fatima")) {
                    System.out.println("Bonjour " + nom + ", dans quel compte souhaitez vous proceder ? Classique, livretA ou épargne ?");
                    String quelCompte = sc.next();
                    // Début compte classique
                    if (quelCompte.equalsIgnoreCase("Classique")) {
                        System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
                        System.out.println("Souhaitez vous faire un dépot ou un retrait ? Oui/Non.");
                        String OuiOuNon = sc.next();
                        if (OuiOuNon.equalsIgnoreCase("Oui")) {
                            System.out.println("Dépot ou retrait ?");
                            String depotOuRetrait = sc.next();
                            if (depotOuRetrait.equalsIgnoreCase("Dépot") || depotOuRetrait.equalsIgnoreCase("Depot")) {
                                System.out.println("Veuillez saisir le montant à déposer");
                                double depot = sc.nextInt();
                                fatimaCompteClassique.depotCompteClassique(depot);
                                System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
                            } else if (depotOuRetrait.equalsIgnoreCase("Retrait")) {
                                System.out.println("Veuillez saisir le montant à retirer");
                                double retrait = sc.nextInt();
                                fatimaCompteClassique.retraitCompteClassique(retrait);
                                System.out.println(fatimaCompteClassique.renseignementsCompteClassique());
                            } else {
                                System.out.println("Erreur, merci de réitérer la manipulation en précisant bien 'dépot' ou 'retrait'.");
                            }
                        } else {
                            System.out.println("Erreur, merci de renseigner 'Oui' ou 'Non'");
                        }
                    }
                    // Fin compte classique

                    // Début compte livret A
                    else if (quelCompte.equalsIgnoreCase("LivretA")) {
                        System.out.println(fatimaCompteLivretA.renseignementsCompteLivretA());
                        System.out.println("Souhaitez vous faire un dépot ou un retrait ? Oui/Non.");
                        String OuiOuNon = sc.next();
                        if (OuiOuNon.equalsIgnoreCase("Oui")) {
                            System.out.println("Dépot ou retrait ?");
                            String depotOuRetrait = sc.next();
                            if (depotOuRetrait.equalsIgnoreCase("Dépot") || depotOuRetrait.equalsIgnoreCase("Depot")) {
                                System.out.println("Veuillez saisir le montant à déposer");
                                double depot = sc.nextInt();
                                fatimaCompteLivretA.depotCompteLivretA(depot);
                                System.out.println(fatimaCompteLivretA.renseignementsCompteLivretA());
                            } else if (depotOuRetrait.equalsIgnoreCase("Retrait")) {
                                System.out.println("Veuillez saisir le montant à retirer");
                                double retrait = sc.nextInt();
                                fatimaCompteLivretA.retraitCompteLivretA(retrait);
                                System.out.println(fatimaCompteLivretA.renseignementsCompteLivretA());
                            } else {
                                System.out.println("Erreur, merci de réitérer la manipulation en précisant bien 'dépot' ou 'retrait'.");
                            }
                        } else {
                            System.out.println("Erreur, merci de renseigner 'Oui' ou 'Non'");
                        }
                    }
                    // Fin compte livret A

                    // Début compte épargne logement
                    else if (quelCompte.equalsIgnoreCase("épargne") || quelCompte.equalsIgnoreCase("epargne")) {
                        System.out.println(fatimaCompteEpargneLogement.renseignementsCompteEpargneLogement());
                        System.out.println("Souhaitez vous faire un dépot ou un retrait ? Oui/Non.");
                        String OuiOuNon = sc.next();
                        if (OuiOuNon.equalsIgnoreCase("Oui")) {
                            System.out.println("Dépot ou retrait ?");
                            String depotOuRetrait = sc.next();
                            if (depotOuRetrait.equalsIgnoreCase("Dépot") || depotOuRetrait.equalsIgnoreCase("Depot")) {
                                System.out.println("Veuillez saisir le montant à déposer");
                                double depot = sc.nextInt();
                                fatimaCompteEpargneLogement.depotCompteEpargneLogement(depot);
                                System.out.println(fatimaCompteEpargneLogement.renseignementsCompteEpargneLogement());
                            }
                            if (depotOuRetrait.equalsIgnoreCase("Retrait")) {
                                System.out.println("Une demande a été faite auprès de votre conseiller ......");
                                fatimaCompteEpargneLogement.demandeAutorisation();
                                String reponseOuiOuNon = sc.next();
                                if (reponseOuiOuNon.equalsIgnoreCase("Oui")) {
                                    fatimaCompteEpargneLogement.retraitCompteEpargneLogement();
                                    System.out.println(fatimaCompteEpargneLogement.renseignementsCompteEpargneLogement());
                                } else {
                                    System.out.println("La demande a été annulée, merci de votre visite.");
                                }
                            } else {
                                System.out.println("Erreur, merci de réitérer la manipulation en précisant bien 'dépot' ou 'retrait'.");
                            }
                        } else {
                            System.out.println("Erreur, merci de renseigner 'Oui' ou 'Non'");
                        }
                    }
                    // Fin compte épargne logement

                    else {
                        System.out.println("Merci de renseigner un compte valide.");
                    }
                }
                // Fin Fatima


                // Début Nesrine
                if (nom.equalsIgnoreCase("Nesrine")) {
                    System.out.println(nesrineCompteClassique.renseignementsCompteClassique());
                    System.out.println("Souhaitez vous faire un dépot ou un retrait ? Oui/Non.");
                    String OuiOuNon = sc.next();
                    if (OuiOuNon.equalsIgnoreCase("Oui")) {
                        System.out.println("Dépot ou retrait ?");
                        String depotOuRetrait = sc.next();
                        if (depotOuRetrait.equalsIgnoreCase("Dépot") || depotOuRetrait.equalsIgnoreCase("Depot")) {
                            System.out.println("Veuillez saisir le montant à déposer");
                            double depot = sc.nextInt();
                            nesrineCompteClassique.depotCompteClassique(depot);
                            System.out.println(nesrineCompteClassique.renseignementsCompteClassique());
                        } else if (depotOuRetrait.equalsIgnoreCase("Retrait")) {
                            System.out.println("Veuillez saisir le montant à retirer");
                            double retrait = sc.nextInt();
                            nesrineCompteClassique.retraitCompteClassique(retrait);
                            System.out.println(nesrineCompteClassique.renseignementsCompteClassique());
                        } else {
                            System.out.println("Erreur, merci de réitérer la manipulation en précisant bien 'dépot' ou 'retrait'.");
                        }
                    } else {
                        System.out.println("Erreur, merci de renseigner 'Oui' ou 'Non'");
                    }
                }
                // Fin Nesrine
            } else {
                System.out.println("Aucun de nos clients porte ce nom, merci de réessayer avec un autre nom.");
            }
        }




        // Début compte classique
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
        CompteLivretA nesrineCompteLivretA = new CompteLivretA("Nesrine", 15, 150, "compte livret A");
        System.out.println(fatimaCompteLivretA.renseignementsCompteLivretA());
        fatimaCompteLivretA.depotCompteLivretA(500);
        System.out.println(fatimaCompteLivretA.renseignementsCompteLivretA());
        System.out.println(fatimaCompteLivretA.renseignementsCompteLivretA());
        // Fin compte livret A


        // Début compte épargne logement
        System.out.println(fatimaCompteEpargneLogement.renseignementsCompteEpargneLogement());
        // Fin compte épargne logement
    }
}