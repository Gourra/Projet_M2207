class Musique extends Oeuvre{
    //Attributs
    private String support; //Tout est en String car pas besoin de faire des calculs on va juste afficher
    private String pistes;

    //Constructeur
    public Musique(String e_reference,String e_auteur,String e_titre,String e_annee, String e_support, String e_pistes){ // e_variable -> variable d'entrée (Arguments)
        super(e_reference, e_auteur, e_titre, e_annee);
        support = e_support;
        pistes = e_pistes;
    }

    //Méthodes d'accès
    public String getSupport(){return support;}
    public String getPistes(){return pistes;}
    public String getType(){return "Musique";}

    //Méthodes
    public void afficher(int textTrue){
        if(textTrue == 1){
            System.out.println(" Reference   |   Titre   |   Auteur  |   Date    |    Support    |    Pistes    |");    // Si la fonction est passé avec 1 en argument -> affiche la valeur de l'object de facon plus élégante
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(reference +" | "+ titre +" | "+ auteur +" | "+ annee +" | "+ support +" | "+ pistes);
        }else{
            System.out.println(reference +" | "+ titre +" | "+ auteur +" | "+ annee +" | "+ support +" | "+ pistes);   // Sinon affichage classique
        }
    }
}