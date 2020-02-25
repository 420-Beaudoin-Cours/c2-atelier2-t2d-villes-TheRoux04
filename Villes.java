public class Villes {

    public static void afficherTab(int[][] tab){

        int nbLignes = tab.length;
        int nbColonnes = tab[0].length;

        for (int i = 0; i < nbLignes; i++){
            for (int j = 0; j < nbColonnes; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sommeUneLigne(int[][] tab, int iLigne){
        int precipVille = 0;

        for (int i = 0; i < tab[0].length; i++){
            precipVille += tab[iLigne][i];
        }

        return precipVille;
    }

    public static double moyenneUneCol(int[][] tab, int iCol){
        int iLigne = 0;
        double addition = 0;
        double moyenne = 0;

        for (int i = 0; i < tab.length; i++){
            addition += tab[iLigne][iCol];
            iLigne++;
        }
        moyenne = addition / iLigne;

        return moyenne;
    }

    public static double moyenneUneLigne(int[][] tab, int iLigne){
        double somme = 0;
        double moyennePrecipVille = 0;

        for (int i = 0; i < tab[0].length; i++){
            somme += tab[iLigne][i];
        }
        moyennePrecipVille = somme / tab[0].length;

        return moyennePrecipVille;
    }

    public static int maxLigne(int[][] tab, int iLigne){
        int max = tab[iLigne][0];

        for (int i = 0; i < tab[0].length; i++){
            if (max < tab[iLigne][i]){
                max = tab[iLigne][i];
            }
        }

        return max;
    }

    public static int minLigne(int[][] tab, int iLigne){
        int min = tab[iLigne][0];

        for (int i = 0; i < tab[0].length; i++){
            if (min > tab[iLigne][i]){
                min = tab[iLigne][i];
            }
        }

        return min;
    }
}
