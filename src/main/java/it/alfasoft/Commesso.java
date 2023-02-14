package it.alfasoft;

public class Commesso {
    public Scarpe getScarpe(String tipo){
        Scarpe scarpa=null;

        if(tipo.equals("ginnastica")){
            scarpa=  CommessoGinnastica.getScarpa();
        }
        if(tipo.equals("tennis")){
            scarpa=CommessoTennis.getScarpa();
        }
        return scarpa;
    }
}
