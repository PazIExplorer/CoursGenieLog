package exercice2;

import exercice2.models.*;

public class MainExercice2 implements Exo2 {

    /* EXO 2
     * Recupérez depuis le serveur la liste des gens qui sont nés à Chambéry.
     * La récupération de Data se fait dans l'ordre :
     *  - Récupération de data sur le server grâce à TxtHelper.getDataFromTxt("server.txt");
     *  - Vider la base de données locale grâce à la fonction TxtHelper.clearDataLocal();
     *  - Insérer les données dans la database locale grâce à la fonction TxtHelper.insertDataInTxt(line, "local.txt")
     *  - Afficher les données locale grace à TxtHelper.getDataFromTxt("local.txt")
     */
    @Override
    public void displayPersonFromChambery() {
        TxtHelper bdd = new TxtHelper();
        bdd.getDataFromTxt("server.txt");
        bdd.insertDataInTxt(line,"local.txt");
        System.out.println(bdd.getDataFromTxt("local.txt"));
    }

    /*
     * Recupérez depuis le serveur la liste des gens qui ont plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     * Tips : Vous avez dans la class Person la fonction getAge();
     */
    @Override
    public void displayBoomers() {
        TxtHelper data = new TxtHelper();
        data.getDataFromTxt("local.txt");
        int age=0;
        int boomer =0;
        for(int i=0, i<data.size(), i++){
            try {
                age = data.get(i).getAge();
            } catch (Exception e) {
                continue;
            }
            if(age <25 and !0){
                boomer+=1;
            }
            
        }
        System.out.println(boomer);
        data.clearDataLocal();
    }

    /*
     * Recupérez depuis le serveur la liste des gens de sexe féminin.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemales() {
        TxtHelper data = new TxtHelper();
        data.getDataFromTxt("local.txt");
        String sexe="";
        int femme =0;
        for(int i=0, i<data.size(), i++){
            try {
                sexe = data.get(i).gender();
            } catch (Exception e) {
                continue;
            }
            if(sexe.equals("female")){
                femme+=1;
            }
            
        }
        System.out.println(femme);
        data.clearDataLocal();
    }

    /*
     * Recupérez depuis le serveur la liste des femmes de plus de 25 ans.
     * La récupération de Data se fait comme dans la question précedente
     */
    @Override
    public void displayFemaleBoomers() {

    }

    public static void main(String[] args) {
        Exo2 exo2 = new MainExercice2();
        exo2.displayBoomers();
    }
}
