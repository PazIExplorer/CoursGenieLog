package exercice1;

import datamocklib.Person;

import java.util.ArrayList;
import java.util.List;

public class MainExercice1 {
    

    // Format du fichier : firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
    // Pas de header
    public List<Person> parse(List<String> data) {
        //recuperer le fichier et le parser comme il faut
        
        return new ArrayList<Person>();
    }

    public static void main(String[] args) {
        // EXO 1
        /*
         * - Récuperez la liste des personnes sous la forme -> firstName,lastName,birthDate,gender,cityOfResidence,cityOfBirth
         *   grâce à la fonction TxtHelper.getDataFromTxt("persons.txt")
         * - Parser la liste des Personnes grâce à la fonction parse())
         * - Calculer le nombre de personnes nées dans chaque ville avec les données obtenues.
         * Les données contiennent une trentaine de villes, Bonne chance !
        */
        //on créer une variable pour le fichier

        //on créer une instance de l'exercice
        MainExerice1 monExercice1 = new MainExercice1();

        //on parse avec le fichier
        monExercice1.parse();

        

    }
}
