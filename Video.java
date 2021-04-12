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
        System.out.println(titre + " est réalisé par " + auteur + " en " + annee + " : ref n° " + reference);
        System.out.println("Format : " + format + " duree : " + duree);
        System.out.println("----------------------------------------------------------------------------------");
    }
}