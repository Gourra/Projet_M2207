class Oeuvre {
    //Attributs
    private String reference;
    private String auteur;
    private String titre;
    private int annee;

    //Construteur
    public void Oeuvre(String ref, String aut, String titr, int an){
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
        System.out.println(titre + " est écrit par " + auteur + " en " + annee + " : ref n° " + reference);
    }
}