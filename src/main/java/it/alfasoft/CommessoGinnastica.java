package it.alfasoft;

public class CommessoGinnastica extends Commesso{
    public CommessoGinnastica(){}
    public static Scarpe getScarpa(){
         return new ScarpeGinnastica();
     }
}
