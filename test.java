class test{
    public static void main(String[] args){
        //Oeuvre O1 = new Oeuvre("hjzi88z4","Beaudelaire","Les Fleurs du Mal","1857");
        //O1.afficher(1);
        //O1.afficher(0);
        
        //Livre L1 = new Livre("hjzi88z4","Beaudelaire","Les Fleurs du Mal","1857","1234567897412","Flamarion","250");
        //L1.afficher(1);
        //L1.afficher(0);

        //Video V1 = new Video("hjzi88z4","Beaudelaire","Les Fleurs du Mal","1857","MP4","150");
        //V1.afficher(1);
        //V1.afficher(0);

        //Musique M1 = new Musique("hjzi88z4","Beaudelaire","Les Fleurs du Mal","1857","DVD","10");
        //M1.afficher(1);
        //M1.afficher(0);
        
        String [] [] tab = {
            //{reference , auteur, nom, date}
            {"in54era91z", "Albert Camus", "L'étranger","1942"},
            {"351zeza8cz", "Albert Camus", "La Peste", "1947"},
            {"hjzi88z4ze", "Charles Beaudelaire", "Les Fleurs du Mal", "1857"},
            {"gpl5e88re1", "Georges Sand", "La Mare au diable", "1846"},

            {"gyzkvfae54", "Chopin", "Nocturne n°62", "1846"},
            {"6811f8dde5", "Sofian Pamart", "Medellin", "2020"},
            {"elza46ezax", "Mosart", "Requiem", "1791"},
            {"afmliho7zf", "Agnes Obel", "Chord Left", "2013"},

            {"faz541k88c", "Jami", "C'est pas Sorcier 1", "2000"},
            {"654bjhdp87", "Jami", "C'est pas Sorcier 21", "2001"},
            {"h64rt81zee", "Jami", "C'est pas Sorcier 53", "2013"},
            {"uoi64581xz", "Jami", "C'est pas Sorcier 54", "2013"}
        };
        
        Mediatheque MD = new Mediatheque(tab);
        MD.addOeuvre("fezazffe","moi","toi","2020");
        MD.afficher();
        MD.rechercherTitre("La Peste");
        MD.rechercherAuteur("Jami");
        MD.rechercherDate("2013");
        System.out.println(MD.CombienDate("2013"));


    }
}