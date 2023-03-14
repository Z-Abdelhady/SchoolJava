import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<String> nomEleve = new ArrayList<String>();
        List<String> noteEleve = new ArrayList<String>();
        List<String> cours = new ArrayList<String>();
        List<List<String>> presences = new ArrayList<List<String>>();

        //Capturer les info
        String nomUtilisateur = "";
        String motDePasse = "";

        boolean isLogin = authentification(nomUtilisateur, motDePasse);

        //Controler le profile de l'utilisateur et afficher le menu en fonction
        Scanner sc = new Scanner(System.in);
        String userType;

        System.out.println("Veuillez entrer votre type d'utilisateur : ");
        userType = sc.nextLine();

        if(userType.equals("admin")) {
            // Afficher le menu pour les utilisateurs administrateurs
            System.out.println("Bienvenue, utilisateur administrateur");
            System.out.println("1. Ajouter un nouvel utilisateur");
            System.out.println("2. Supprimer un utilisateur existant");
            System.out.println("3. Modifier les autorisations d'un utilisateur");
        } else if(userType.equals("etudiant")) {
            //Afficher le menu pour les utilisateurs membres.
            System.out.println("Bienvenue, utilisateur membre.");
            System.out.println("1. Afficher votre profil");
            System.out.println("2. Modifier votre profil");
            System.out.println("3. Consulter les dernières nouvelles");
        } else {
            // Afficher un message d'erreur si le type d'utilisateur est invalide
            System.out.println("Type d'utilisateur invalide. Veuillez réessayer");
        }
        //Capturer le choix de l'utilisateur

        //Admin: Capturer l'index de l'etudiant
        String Admincap = (int indexeEtudiant);
        //User: Trouver son indexe
    }


    static void saisirNotes(int indexeEtudiant) {
        //Changer les notes de cette indice
    }

    static double getMoyenne(int indexeEtudiant) {
        //Trouver la moyenne a partit sa liste des notes
        return 0;
    }

    static void afficherPresence(int indexeEtudiant) {
    }

    static int TrouverIndexe(String nomUtilisateur) {

        return - 1;
    }

    static void afficherMenu(String nomUtilisateur) {
        //Admin

        //a) Saisir des notes
        //b) Voire la moyenne des notes
        //c) Afficher la presence

        //Utilisateur

        //a) Enregistrer presence
        //b) Donner avis
    }

    static boolean authentification(String nomUtilisateur, String motDePasse) {
        return false;
    }

    //
    static List<String> getCours() {
        List<String> cours = new ArrayList<String>();
        cours.add("Algorithme");
        cours.add("GIT");
        return cours;
    }


    //Chaque element contient le nom de l'eleve
    static List<String> getNomEleves() {
        List<String> nomEleve = new ArrayList<String>();
        nomEleve.add("Heunpha-Ly LY");
        nomEleve.add("Luc LIKIBI");	
        nomEleve.add("Cyril NKASSA");	
        nomEleve.add("Ömer YILDIRIM");	
        nomEleve.add("Chiraz BOUSSELMI ép HAMDI");	
        nomEleve.add("Khabthani Mustapha");	
        nomEleve.add("Rafik MAACHI");	
        nomEleve.add("Camille LESBACHES");	
        nomEleve.add("Zeyad ABDELHADY");	
        nomEleve.add("Johanna FOOLCHAND");	
        nomEleve.add("Kannara KHENG");	
        nomEleve.add("Didier PHILIBERT");
        return nomEleve;
    }

    static void afficherListEleves(List<String> nomEleve) {
       //1: Heunpha-Ly LY
       //2: Luc LIKIBI
       //3: Cyril NKASSA
       //...
    }

    //Chaque element contient les notes de l'eleve (18,15,14,13)
    //Etudiant 1 > 18,15,14,13
    //Etudiant 2 > 12,13,17,18
    static List<String> getNotes() {
        List<String> noteEleve = new ArrayList<String>();
        return noteEleve;
    }

    //Chaque element contient la liste des presences d'un eleve
    static List<List<String>> getPresences() {
        List<List<String>> presences = new ArrayList<List<String>>();

        List<String> presenceEtudiant1 = new ArrayList<String>();
        presenceEtudiant1.add("Algorithme - 13/03/2023");
        presenceEtudiant1.add("Algorithme - 14/03/2023");
        presenceEtudiant1.add("GIT - 15/03/2023");

        //Eleve Indexe 1
        presences.add(presenceEtudiant1);

        //Eleve absent sur GIT
        List<String> presenceEtudiant2 = new ArrayList<String>();
        presenceEtudiant2.add("Algorithme - 13/03/2023");
        presenceEtudiant2.add("Algorithme - 14/03/2023");

        //Eleve Indexe 2
        presences.add(presenceEtudiant2);

        return presences;
    }
}
