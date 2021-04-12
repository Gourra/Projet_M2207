class Oeuvre {
    //Attributs
    protected String reference;
    protected String auteur;
    protected String titre;
    protected int annee;

    //Construteur
    public Oeuvre(String ref,String aut,String titr,int an){
        reference = ref;
        auteur = aut;
        titre = titr;
        annee = an;
    }

    //Méthodes d'accès
    public String getReference(){return reference;}
    public String getAutor(){return auteur;}
    public String getTitle(){return titre;}
    public int getDate(){return annee;}

    //Méthodes 
    public void afficher(){
        System.out.println(titre + " est réalisé par " + auteur + " en " + annee + " : ref n° " + reference);
        System.out.println("----------------------------------------------------------------------------------");
    }
}