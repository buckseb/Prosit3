import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe(1,"1","1","1",1);
        Employe e2 = new Employe(2,"2","2","2",2);
        Employe e3 = new Employe(3,"3","3","3",3);
        Departement d1 = new Departement(1,"1",10);
        Departement d2 = new Departement(2,"2",20);
        Departement d3 = new Departement(3,"3",30);
        AffectationHashMap affectations = new AffectationHashMap();
        affectations.ajouterEmployeDepartement(e2,d2);
        affectations.ajouterEmployeDepartement(e3,d3);
        affectations.ajouterEmployeDepartement(e1,d3);
        System.out.println("Avant changement :");
        affectations.afficherEmployesEtDepartements();
        affectations.ajouterEmployeDepartement(e1,d1);
        System.out.println("Aprés changement :");
        affectations.afficherEmployesEtDepartements();
        Employe e4 = new Employe(4,"4","4","2",4);
        affectations.ajouterEmployeDepartement(e4,d2);
        System.out.println("Avant suppression de e4 :");
        affectations.afficherEmployesEtDepartements();
        affectations.supprimerEmploye(e4);
        System.out.println("Aprés suppression de e4 :");
        affectations.afficherEmployesEtDepartements();
        Employe e5 = new Employe(5,"5","5","5",5);
        Departement d5 = new Departement(5,"5",50);
        affectations.ajouterEmployeDepartement(e5,d5);
        System.out.println("Avant suppression de e5 qui travaille dans d5 :");
        affectations.afficherEmployesEtDepartements();
        affectations.supprimerEmployeEtDepartement(e5,d5);
        System.out.println("Aprés suppression de e5 qui travaille dans d5 :");
        affectations.afficherEmployesEtDepartements();
        System.out.println("Liste employes :");
        affectations.afficherEmployes();
        System.out.println("Liste departements :");
        affectations.afficherDepartements();
        System.out.println("Est-ce que e1 fait partie de notre collection ? : "+affectations.rechercherEmploye(e1));
        System.out.println("Est-ce que d5 fait partie de notre collection ? : "+affectations.rechercherDepartement(d5));
        TreeMap<Employe,Departement> tree = affectations.trierMap();
        for (Map.Entry<Employe, Departement> t : tree.entrySet())
            System.out.println("Employe : "+t.getKey()+"  -->  Departement : "+t.getValue());
    }
}