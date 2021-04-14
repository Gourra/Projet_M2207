class Oeuvre {
    //Attributs
    protected String reference;  //Tout est en String car pas besoin de faire des calculs on va juste afficher
    protected String auteur;
    protected String titre;
    protected String annee;

    //Construteur
    public Oeuvre(String e_reference,String e_auteur,String e_titre,String e_annee){ // e_variable -> variable d'entrée (Arguments)
        reference = e_reference;
        auteur = e_auteur;
        titre = e_titre;
        annee = e_annee;
    }

    //Méthodes d'accès
    public String getReference(){return reference;}
    public String getAutor(){return auteur;}
    public String getTitle(){return titre;}
    public String getDate(){return annee;}

    //Méthodes 
    public void afficher(int textTrue){
        if(textTrue == 1){
            System.out.println(" Reference   |   Titre   |   Auteur  |   Date    |");    // Si la fonction est passé avec 1 en argument -> affiche la valeur de l'object de facon plus élégante
            System.out.println("-------------------------------------------------");
            System.out.println(reference +" | "+ titre +" | "+ auteur +" | "+ annee);
        }else{
            System.out.println(reference +" | "+ titre +" | "+ auteur +" | "+ annee);   // Sinon affichage classique
        }
    }
}