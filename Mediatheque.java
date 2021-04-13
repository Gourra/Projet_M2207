class Mediatheque{
    //Attributs
    Oeuvre [] rep;
    int n;

    //Construtor
    public Mediatheque(String [] [] tab){
        n = tab.length;
        rep = new Oeuvre [n];

        for(int i =0 ; i< n; i++){
            rep[i] = new Oeuvre(tab[i][0],tab[i][1],tab[i][2],tab[i][3]);
        }
    }
    //Methode d'accès
    public Oeuvre[] getRep(){return rep;}
    public int getN(){return n;}
    public void setN(int o){n=o;}

    //Méthodes
    public void addOeuvre(String a, String b, String c, String d){
        n += 1 ;
        Oeuvre [] rep2 = new Oeuvre [n];
        for(int i =0; i<(n-1); i++){
            rep2[i] = rep[i];
        }
        rep2[n] = new Oeuvre(a,b,c,d);
        rep = rep2;
    }

    public void afficher(){
        for(int i =0 ; i<n; i++){
            rep[i].afficher();
        }
    }
}