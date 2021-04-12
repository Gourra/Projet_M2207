class Oeuvre {
    //Attributs
    private String reference;
    private String auteur;
    private String titre;
    private int annee;

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
    
    public void setReference(String A){reference = A;}
    public void setAutor(String A){auteur = A;}
    public void setTitle(String A){titre = A;}
    public void setDate(int A){annee = A;}

    //Méthodes 
    public void afficher(){
        System.out.println(titre + " est écrit par " + auteur + " en " + annee + " : ref n° " + reference);
    }
}