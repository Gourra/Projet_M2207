import java.util.ArrayList;

class Mediatheque{
    //Attributs
    ArrayList<Oeuvre> rep;

    //Constructeur
    public Mediatheque(){  // cree un tableau d'Oeuvres a partir d'un tableau
       this.rep = new ArrayList<Oeuvre>();
    }

    //Methode d'accès
    public ArrayList<Oeuvre> getRep(){return rep;}

    //Méthodes

    //################################################
    //              Ajout d'oeuvre                  //
    //################################################

    public void addLivre(String a, String b, String c, String d, String e, String f, String g){ //Ajoute un livre au Tableau
        Livre tempmem = new Livre(a,b,c,d,e,f,g);
        rep.add(tempmem);
    }

    public void addMusique(String a, String b, String c, String d, String e, String f){ //Ajoute une musique au Tableau
        Musique tempmem = new Musique(a,b,c,d,e,f);
        rep.add(tempmem);
    }

    public void addVideo(String a, String b, String c, String d, String e, String f){ //Ajoute une Video au Tableau
        Video tempmem = new Video(a,b,c,d,e,f);
        rep.add(tempmem);
    }


    //################################################
    //                    Affichage                 //
    //################################################

    public void afficher(){ //Affiche le contenu avec les Détails
        System.out.println("LIVRES :");
        System.out.println("");
        System.out.println(" Reference   |   Titre   |   Auteur  |   Date    |    Editeur    |    Pages    |    ISBN    |");
        System.out.println("---------------------------------------------------------------------------------------------");
        for(int i = 0; i < rep.size(); i++) {
            if(rep.get(i) instanceof Livre){
                rep.get(i).afficher(0);
            }
        }
        System.out.println("");
        System.out.println("MUSIQUES :");
        System.out.println("");
        System.out.println(" Reference   |   Titre   |   Auteur  |   Date    |    Support    |    Pistes    |");    
        System.out.println("---------------------------------------------------------------------------------------------");
        for(int i = 0; i < rep.size(); i++) {
            if(rep.get(i) instanceof Musique){
                rep.get(i).afficher(0);
            }
        }
        System.out.println("");
        System.out.println("VIDEOS :");
        System.out.println("");
        System.out.println(" Reference   |   Titre   |   Auteur  |   Date    |    Format    |    Duree    |");   
        System.out.println("---------------------------------------------------------------------------------------------");
        for(int i = 0; i < rep.size(); i++) {
            if(rep.get(i) instanceof Video){
                rep.get(i).afficher(0);
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("");
    }

    //################################################
    //                   Recherche                  //
    //################################################

    public void rechercherTitre(String nom){ //Filtre par titre
        int n = rep.size();
        int tailleFind = 0;

        for(int l=0; l<n;l++){              //Determination de la taille du tableau final
            if(rep.get(l).getTitle().equals(nom)){
                tailleFind ++;
            }
        }
        Oeuvre [] find = new Oeuvre[tailleFind];
        int j = 0;

        for(int i=0; i<n; i++){              //Remplisage du tableau de qui sera afficher
            if(rep.get(i).getTitle().equals(nom)){
                find[j] = rep.get(i);
                j++;
            }
        }
        printFind(find);
    }

    public void rechercherAuteur(String nom){ //Filtre par Auteur
        int n = rep.size();
        int tailleFind = 0;
        for(int l=0; l<n; l++){              //Determination de la taille du tableau final
            if(rep.get(l).getAutor().equals(nom)){
                tailleFind ++;
            }
        }

        Oeuvre [] find = new Oeuvre[tailleFind];
        int j = 0;
        for(int i=0; i<n; i++){              //Remplisage du tableau de qui sera afficher
            if(rep.get(i).getAutor().equals(nom)){
                find[j] = rep.get(i);
                j++;
            }
        }
        printFind(find);
    }

    public void rechercherDate(String nom){ //Filtre par Date
        int n = rep.size();
        int tailleFind = 0;
        for(int l=0; l<n; l++){              //Determination de la taille du tableau final
            if(rep.get(l).getDate().equals(nom)){
                tailleFind ++;
            }
        }
        
        Oeuvre [] find = new Oeuvre[tailleFind];
        int j = 0;
        for(int i=0; i<n; i++){              //Remplisage du tableau de qui sera afficher
            if(rep.get(i).getDate().equals(nom)){
                find[j] = rep.get(i);
                j++;
            }
        }
        printFind(find);
    }

    public int CombienDate(String nom){ //Compteur d'Oeuvre en fonction de la date
        int n = rep.size();
        int tailleFind = 0;
        for(int l=0; l<n; l++){              
            if(rep.get(l).getDate().equals(nom)){
                tailleFind ++;
            }
        }
        return tailleFind;
    }

    public void printFind(Oeuvre [] find){
        int n = find.length;
        if(n==0){                               //Pas de résultat
            System.out.println("Pas de Résultat");
        }else{
            for(int i=0; i<n; i++){
                if(i==0){
                    find[i].afficher(1); //Afficher le premier avec "esthétisme" (entete de tableau)
                }else{
                    find[i].afficher(0); //Affichage lambda
                }
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }  
}