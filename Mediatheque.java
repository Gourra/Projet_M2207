import java.util.ArrayList;

class Mediatheque{
    //Attributs
    ArrayList<Oeuvre> rep;

    //Constructeur
    public Mediatheque(String [] [] tab){  // cree un tableau d'Oeuvres a partir d'un tableau
       this.rep = new ArrayList<Oeuvre>();
       int n = tab.length;
       
        for(int i =0 ; i< n; i++){
            rep.add(new Oeuvre(tab[i][0],tab[i][1],tab[i][2],tab[i][3]));
        }
    }

    //Methode d'accès
    public ArrayList<Oeuvre> getRep(){return rep;}

    //Méthodes
    public void addOeuvre(String a, String b, String c, String d){ //Ajoute une Oeuvre au Tableau
        Oeuvre tempmem = new Oeuvre(a,b,c,d);
        rep.add(tempmem);
    }

    public void afficher(){ //Affiche le contenu avec les Détails
        int n = rep.size();
        for(int i=0; i<n; i++){
            if(i==0){
                rep.get(i).afficher(1); //Afficher le premier avec "esthétisme" (entete de tableau)
            }else{
                rep.get(i).afficher(0); //Affichage lambda
            }
        }    
        System.out.println("---------------------------------------------------------------------------------------------");
    }

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

    public int CombienDate(String nom){ //Filtre par Date
        int n = rep.size();
        int tailleFind = 0;
        for(int l=0; l<n; l++){              //Determination de la taille du tableau final
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