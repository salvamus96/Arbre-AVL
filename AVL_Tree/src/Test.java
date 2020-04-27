
public class Test {

	public static void main(String[] args) {
		
		ArbreAVL arbre = new ArbreAVL ();
		
		arbre.ajoutAVL("L");
		System.out.println("Insertion de L");
		System.out.println("Arbre1: " + arbre.racine.toString());		
		
		arbre.ajoutAVL("C");
		System.out.println("\n\nInsertion de C");
		System.out.println("Arbre2: " + arbre.racine.toString());
		
		arbre.ajoutAVL("B");
		System.out.println("\n\nInsertion de B");
		System.out.println("Arbre3: " + arbre.racine.toString());
		
		arbre.ajoutAVL("E");
		System.out.println("\n\nInsertion de E");
		System.out.println("Arbre4: " + arbre.racine.toString());
		
		arbre.ajoutAVL("D");
		System.out.println("\n\nInsertion de D");
		System.out.println("Arbre5: " + arbre.racine.toString());
		
		arbre.ajoutAVL("G");
		System.out.println("\n\nInsertion de G");
		System.out.println("Arbre6: " + arbre.racine.toString());
	
		arbre.ajoutAVL("I");
		System.out.println("\n\nInsertion de I");
		System.out.println("Arbre7: " + arbre.racine.toString());
		
		arbre.ajoutAVL("K");
		System.out.println("\n\nInsertion de K");
		System.out.println("Arbre8: " + arbre.racine.toString());
		
		arbre.ajoutAVL("N");
		System.out.println("\n\nInsertion de N");
		System.out.println("Arbre9: " + arbre.racine.toString());
		
		arbre.ajoutAVL("J");
		System.out.println("\n\nInsertion de J");
		System.out.println("Arbre10: " + arbre.racine.toString());
		
		arbre.ajoutAVL("H");
		System.out.println("\n\nInsertion de H");
		System.out.println("Arbre11: " + arbre.racine.toString());
		
		System.out.println("\n****\nSUPPRESSION DE " + arbre.suppAVL("K"));
//		System.out.println("\n****\nSUPPRESSION DE " + arbre.suppAVL("H"));
//		System.out.println("\n****\nSUPPRESSION DE " + arbre.suppAVL("G"));

		
		System.out.println("\nPOST - SUPPRESSION: " + arbre.racine.toString());
		System.out.println("\nParcours infixe : ");
		for (NoeudAVL n : arbre.parcoursAVL(arbre.racine))
			System.out.print(n.nom + " ");
		
		NoeudAVL n = arbre.rechercheAVL("L");
		System.out.println("\n\nHauteur de " + n.nom + ": " + arbre.hauter(n));
		
	}

}
