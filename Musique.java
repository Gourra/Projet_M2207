class Musique extends Oeuvre{
    //Attributs
    private String support;
    private int pistes;

    //Constructeur
    public Musique(String ref,String aut,String titr,int an, String sup, int pis){
        super(ref, aut, titr, an);
        support = sup;
        pistes = pis;
    }

    //Méthodes d'accès
    public String getSupport(){return support;}
    public int getPistes(){return pistes;}

    //Méthodes
    public void afficher(){
        System.out.println(titre + " est réalisé par " + auteur + " en " + annee + " : ref n° " + reference);
        System.out.println("Support : " + support + " nb pistes : " + pistes);
        System.out.println("----------------------------------------------------------------------------------");
    }
}