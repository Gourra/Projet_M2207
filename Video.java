class Video extends Oeuvre{
    //Attributs
    private String format;
    private int duree;

    //constructeur
    public Video(String ref,String aut,String titr,int an, String forma, int dure){
        super(ref, aut, titr, an);
        format = forma;
        duree = dure;
    }

    //Méthodes d'accès
    public String getFormat(){return format;}
    public int getDuree(){return duree;}

    //Méhodes
    public void afficher(){
        System.out.println("Reference : " + reference + "Titre : " + titre + " Auteur : " + auteur + " Date de parution : " + annee);
        System.out.println("Format : " + format + " duree : " + duree);
    }
}