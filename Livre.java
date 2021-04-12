class Livre extends Oeuvre{
    //Attributs
    private String ISBN;
    private String editeur;
    private int pages;

    //Constructor
    public Livre(String ref,String aut,String titr,int an, String isbn, String editor, int page){
        super(ref, aut, titr, an);
        ISBN = isbn;
        editeur = editor;
        pages = page;
    }
    
    //Méthodes d'accès
    public String getIsbn(){return ISBN;}
    public String getEditor(){return editeur;}
    public int getPages(){return pages;}

    //méthodes
    public void afficher(){
        System.out.println(titre + " est réalisé par " + auteur + " en " + annee + " : ref n° " + reference);
        System.out.println("Edité par " + editeur + " pour " + pages + " pages n° ISBN : " + ISBN);
        System.out.println("----------------------------------------------------------------------------------");
    }
}