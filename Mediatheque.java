import java.util.ArrayList;

class Mediatheque{
    //Attributs
    ArrayList<Oeuvre> rep;

    //Construtor
    public Mediatheque(String [] [] tab){  // cree un tableau d'Oeuvres a partir 
       this.rep = new ArrayList<Oeuvre>();
       int n = tab.length;
       
        for(int i =0 ; i< n; i++){
            rep.add(new Oeuvre(tab[i][0],tab[i][1],tab[i][2],tab[i][3]));
        }
    }

    //Methode d'accès
    public ArrayList<Oeuvre> getRep(){return rep;}

    //Méthodes
    public void addOeuvre(String a, String b, String c, String d){
        Oeuvre tempmem = new Oeuvre(a,b,c,d);
        rep.add(tempmem);
    }

    public void afficher(){
        int n = rep.size();
        for(int i=0; i<n; i++){
            if(i==0){
                rep.get(i).afficher(1);
            }else{
                rep.get(i).afficher(0);
            }
        }    
    }
}