class Livre extends Oeuvre{
    //Attributs
    private String ISBN;    //Tout est en String car pas besoin de faire des calculs on va juste afficher
    private String editeur;
    private String pages;

    //Constructor
    public Livre(String e_reference,String e_auteur,String e_titre,String e_annee, String e_isbn, String e_editeur, String e_pages){ // e_variable -> variable d'entrée (Arguments)
        super(e_reference, e_auteur, e_titre, e_annee);
        ISBN = e_isbn;
        editeur = e_editeur;
        pages = e_pages;
    }
    
    //Méthodes d'accès
    public String getIsbn(){return ISBN;}
    public String getEditor(){return editeur;}
    public String getPages(){return pages;}
    public String getType(){return "Livre";}

    //méthodes
    public void afficher(int textTrue){
        if(textTrue == 1){
            System.out.println(" Reference   |   Titre   |   Auteur  |   Date    |    Editeur    |    Pages    |    ISBN    |");    // Si la fonction est passé avec 1 en argument -> affiche la valeur de l'object de facon plus élégante
            System.out.println("---------------------------------------------------------------------------------------------");
            System.out.println(reference +" | "+ titre +" | "+ auteur +" | "+ annee +" | "+ editeur +" | "+ pages +" | "+ ISBN);
        }else{
            System.out.println(reference +" | "+ titre +" | "+ auteur +" | "+ annee +" | "+ editeur +" | "+ pages +" | "+ ISBN);   // Sinon affichage classique
        }
    }
}