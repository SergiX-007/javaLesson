import java.util.Scanner;

class Etudiant {
    String nom;
    int age;
    Etudiant(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    void afficher() {
        System.out.println(" - " + nom + " (" + age + " ans)");
    }
}

public class Ecole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Combien d'etudiants ? ");
        int n = sc.nextInt();
        sc.nextLine();

        Etudiant[] liste = new Etudiant[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nom de l'etudiant " + (i + 1) + " : ");
            String nom = sc.nextLine();
            System.out.print("Son age : ");
            int age = sc.nextInt();
            sc.nextLine();
            liste[i] = new Etudiant(nom, age);
        }

        System.out.println("\n=== Liste des etudiants ===");
        int total = 0;
        for (int i = 0; i < n; i++) {
            liste[i].afficher();
            total = total + liste[i].age;
        }

        double moyenne = (double) total / n;
        System.out.println("Age moyen : " + moyenne);

        sc.close();
    }
}
