class Video extends Oeuvre{
    //Attributs
    private String format;  //Tout est en String car pas besoin de faire des calculs on va juste afficher
    private String duree;

    //constructeur
    public Video(String e_reference,String e_auteur,String e_titre,String e_annee, String e_format, String e_duree){ // e_variable -> variable d'entrée (Arguments)
        super(e_reference, e_auteur, e_titre, e_annee);
        format = e_format;
        duree = e_duree;
    }

    //Méthodes d'accès
    public String getFormat(){return format;}
    public String getDuree(){return duree;}
    public String getType(){return "Video";}

    //Méhodes
    public void afficher(int textTrue){
        if(textTrue == 1){
            System.out.println(" Reference   |   Titre   |   Auteur  |   Date    |    Format    |    Duree    |");    // Si la fonction est passé avec 1 en argument -> affiche la valeur de l'object de facon plus élégante
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(reference +" | "+ titre +" | "+ auteur +" | "+ annee +" | "+ format +" | "+ duree);
        }else{
            System.out.println(reference +" | "+ titre +" | "+ auteur +" | "+ annee +" | "+ format +" | "+ duree);   // Sinon affichage classique
        }
    }
}