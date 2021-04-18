import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class test{

    public static void main(String[] args){
        
        Mediatheque MD = new Mediatheque();  // Création de la Médiathèque  
        //Ajout D'Oeuvres
        MD.addLivre("L0001", "Albert Camus", "L'etranger","1942", "8888-555-4555-886", "Flamarion", "250");
        MD.addLivre("L0002", "Albert Camus", "La Peste", "1947", "8865-5485-555-886", "Edits", "400");
        MD.addLivre("L0003", "Charles Beaudelaire", "Les Fleurs du Mal", "1857","8888-555-4555-886", "Feret", "350");
        MD.addLivre("L0004", "Georges Sand", "La Mare au diable", "1846", "8888-555-4555-886", "Atlas", "240");
        
        MD.addMusique("M0001", "LES ENFOIRES", "A cote de vous", "2021", "CD", "25");
        MD.addMusique("M0002", "Sofian Pamart", "PLANET", "2020", "CD", "12");
        MD.addMusique("M0003", "Mosart", "Requiem", "1791", "CD", "14");
        MD.addMusique("M0004", "Agnes Obel", "Chord Left", "2013", "CD", "1");

        MD.addVideo("V0001", "Jami", "C'est pas Sorcier 1", "2010", "MP4" , "1200");
        MD.addVideo("V0002", "Jami", "C'est pas Sorcier 21", "2015", "MP4" , "1250");
        MD.addVideo("V0003", "Jami", "C'est pas Sorcier 53", "2020", "MP4" , "1360");
        MD.addVideo("V0004", "Jami", "C'est pas Sorcier 54", "2020", "MP4" , "1185");

        //MD.rechercherTitre("La Peste");
        //MD.rechercherAuteur("Jami");
        //MD.rechercherDate("2013");
        
        //System.out.println(MD.CombienDate("2013"));

        
        boolean Active = true;

        while(Active){
            switch(menuChoixPrincipal()){
                case "1" : { // Affiche les oeuvres contenues dans la Médiathèque
                    MD.afficher();
                }break;
                case "2" : { // Ajoute une Oeuvre dans la Médiathèque
                    switch(menuChoixAddOeuvre()){
                        case "1":{  //Creation d'un objet Livre + ajout à la médiathèque
                            Scanner clavierLivre = new Scanner(System.in); //Creation object pour scanner
                            
                            System.out.println("Reference (exemple format : L0005) : ");
                            String e_reference = clavierLivre.next(); //Recuperation de la reference
                
                            System.out.println("Auteur : ");
                            clavierLivre.nextLine(); //Reset scanner (sinon bug...)
                            String e_auteur= clavierLivre.nextLine();//Recuperation de l'auteur
                            
                            System.out.println("Titre : ");
                            String e_titre = clavierLivre.nextLine();//Recuperation du titre
                          
                            System.out.println("Annee de parution : ");
                            String e_annee = clavierLivre.next(); //Recuperation de la date
                           
                            System.out.println("ISBN : ");
                            clavierLivre.nextLine();//Reset scanner (sinon bug...)
                            String e_isbn = clavierLivre.nextLine(); //Recuperation isbn
                          
                            System.out.println("Editeur : ");
                            String e_editeur = clavierLivre.nextLine(); //Recuperation editeur
                          
                            System.out.println("Nombre de pages : ");
                            String e_pages = clavierLivre.next(); //Recuperation nombre de pages

                            MD.addLivre(e_reference, e_auteur, e_titre, e_annee, e_isbn, e_editeur, e_pages); //Creation de l'objet via les info donnees
                            
                            System.out.println("------------------------------------------------------------");
                            System.out.println("Oeuvre Ajoutee");
                            System.out.println("------------------------------------------------------------");

                        }break;
                        case "2":{  //Creation d'un objet Musique + ajout à la médiathèque
                            Scanner clavierMusique = new Scanner(System.in);
                            
                            System.out.println("Reference (exemple format : M0005) : ");
                            String e_reference = clavierMusique.next();
                
                            System.out.println("Auteur : ");
                            clavierMusique.nextLine();
                            String e_auteur= clavierMusique.nextLine();
                            
                            System.out.println("Titre : ");
                            String e_titre = clavierMusique.nextLine();
                          
                            System.out.println("Annee de parution : ");
                            String e_annee = clavierMusique.next();
                           
                            System.out.println("Support : ");
                            clavierMusique.nextLine();
                            String e_support = clavierMusique.nextLine();
                          
                            System.out.println("Nombre de pistes : ");
                            String e_pistes = clavierMusique.nextLine();
                          
                            MD.addMusique(e_reference, e_auteur, e_titre, e_annee, e_support, e_pistes);
                            
                            System.out.println("------------------------------------------------------------");
                            System.out.println("Oeuvre Ajoutee");
                            System.out.println("------------------------------------------------------------");

                        }break;
                        case "3":{ //Creation d'un objet Video + ajout à la médiathèque
                            Scanner clavierVideo = new Scanner(System.in);
                            
                            System.out.println("Reference (exemple format : V0005) : ");
                            String e_reference = clavierVideo.next();
                
                            System.out.println("Auteur : ");
                            clavierVideo.nextLine();
                            String e_auteur= clavierVideo.nextLine();
                            
                            System.out.println("Titre : ");
                            String e_titre = clavierVideo.nextLine();
                          
                            System.out.println("Annee de parution : ");
                            String e_annee = clavierVideo.next();
                           
                            System.out.println("Format : ");
                            clavierVideo.nextLine();
                            String e_format = clavierVideo.nextLine();
                          
                            System.out.println("Duree en secondes : ");
                            String e_duree = clavierVideo.nextLine();
                          
                            MD.addVideo(e_reference, e_auteur, e_titre, e_annee, e_format, e_duree);

                            System.out.println("------------------------------------------------------------");
                            System.out.println("Oeuvre Ajoutee");
                            System.out.println("------------------------------------------------------------");

                        }break;
                        case "4":{ // Quitte la boucle -> choix annuler  
                        }break;
                        default:{ //Message Erreur
                            System.out.println("Pas d'options correspondantes ... ");
                        }break;
                    }
                }break;
                case "3" : { // Rechercher Dans la bibliothèque
                    System.out.println("cas 3");
                }break;
                case "4" : { //Arret de la boucle -> fin de programme
                    Active = false ;
                }break;
                default :{ //Message Erreur
                    System.out.println("Ca ne fait pas partit des choix disponibles");
                }break;
                
            }
        }
    }

    public static String menuChoixPrincipal(){ //Menu qui retourne le choix fait par l'utilisateur | MENU PRINCIPAL
        Scanner clavier = new Scanner(System.in);

        System.out.println("Que voulez vous faire ? ");
        System.out.println("[1] Afficher les Oeuvres de la Mediatheque");
        System.out.println("[2] Ajouter une Oeuvre a la Mediatheque");
        System.out.println("[3] Rechercher dans la Mediatheque");
        System.out.println("[4] Quitter");
        System.out.println("Votre choix :  ");

        String choix = clavier.next();
        System.out.println("");
        return choix;
    }

    public static String menuChoixAddOeuvre(){ //Menu qui retourne le choix fait par l'utilisateur | MENU AJOUTER OEUVRE
        Scanner clavier = new Scanner(System.in);
        
        System.out.println("Que voulez vous ajouter ? ");
        System.out.println("[1] LIVRE ");
        System.out.println("[2] MUSIQUE");
        System.out.println("[3] VIDEO ");
        System.out.println("[4] Annuler");
        System.out.println("Votre choix :  ");

        String choix = clavier.next();
        System.out.println("");

        return choix;
    }
}