class Oeuvre {
    //Attributs
    protected String reference;
    protected String auteur;
    protected String titre;
    protected String annee;

    //Construteur
    public Oeuvre(String ref,String aut,String titr,String an){
        reference = ref;
        auteur = aut;
        titre = titr;
        annee = an;
    }

    //Méthodes d'accès
    public String getReference(){return reference;}
    public String getAutor(){return auteur;}
    public String getTitle(){return titre;}
    public String getDate(){return annee;}

    //Méthodes 
    public void afficher(){
        System.out.println("Reference : " + reference + ", Titre : " + titre + ", Auteur : " + auteur + ", Date de parution : " + annee);
    }
}