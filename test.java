import java.util.Scanner;

class test{
    public static void main(String[] args){
        
        String [] [] tab = { //Tableau de base de donnée de la Médiathèque
            //{reference , auteur, nom, date}
            {"L0001", "Albert Camus", "L'étranger","1942"},
            {"L0002", "Albert Camus", "La Peste", "1947"},
            {"L0003", "Charles Beaudelaire", "Les Fleurs du Mal", "1857"},
            {"L0004", "Georges Sand", "La Mare au diable", "1846"},

            {"M0001", "Chopin", "Nocturne n°62", "1846"},
            {"M0002", "Sofian Pamart", "Medellin", "2020"},
            {"M0003", "Mosart", "Requiem", "1791"},
            {"M0004", "Agnes Obel", "Chord Left", "2013"},

            {"V0001", "Jami", "C'est pas Sorcier 1", "2000"},
            {"V0002", "Jami", "C'est pas Sorcier 21", "2001"},
            {"V0003", "Jami", "C'est pas Sorcier 53", "2013"},
            {"V0004", "Jami", "C'est pas Sorcier 54", "2013"}
        };
        
        Mediatheque MD = new Mediatheque(tab);  // Création de la Médiathèque et instantiation de la base de donnée precedente      
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
                    
                    Scanner sc_reference = new Scanner(System.in);  // Recupere la reference
                    System.out.println("Entrez la reference de l'Oeuvre : ");
                    String e_reference = sc_reference.next();

                    Scanner sc_auteur = new Scanner(System.in);     // Recupere le nom de l'auteur
                    System.out.println("Entrez le nom de l'auteur : ");
                    String e_auteur = sc_auteur.nextLine();

                    Scanner sc_titre = new Scanner(System.in);      // Recupere le nom de l'oeuvre
                    System.out.println("Entrez le titre de l'Oeuvre : ");
                    String e_titre = sc_titre.nextLine();

                    Scanner sc_date = new Scanner(System.in);       // Recupere la date de parution
                    System.out.println("Entrez la date de parution de l'Oeuvre : ");
                    String e_date = sc_date.next();

                    MD.addOeuvre(e_reference, e_auteur, e_titre, e_date);

                    System.out.println("---------------------------------------------------------------");
                    System.out.println("----------------------Oeuvre Ajoutée---------------------------");
                    System.out.println("---------------------------------------------------------------");

                }break;
                case "3" : { // Rechercher Dans la bibliothèque
                    System.out.println("cas 3");
                }break;
                case "4" : {
                    Active = false ;
                }break;
                default :{
                    System.out.println("Ca ne fait pas partit des choix disponibles");
                }break;
            }
        }
    }

    public static String menuChoixPrincipal(){
        Scanner clavier = new Scanner(System.in);

        System.out.println("Que voulez vous faire ? ");
        System.out.println("[1] Afficher les Oeuvres de la Médiathèque");
        System.out.println("[2] Ajouter une Oeuvre à la Médiathèque");
        System.out.println("[3] Rechercher dans la Médiathèque");
        System.out.println("[4] Quitter");
        System.out.println("Votre choix :  ");

        String choix = clavier.next();
        return choix;
    }
}