package models;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {

		// HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
		Set<String> setWithHashSet = new HashSet<>();

		setWithHashSet.add("TV");
		setWithHashSet.add("Notebook");
		setWithHashSet.add("Tablet");

		System.out.println(setWithHashSet.contains("Notebook"));

		for (String p : setWithHashSet) {
			System.out.println(p);
		}

		// TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado
		// pelo compareTo do objeto (ou Comparator)
		Set<String> setWithTreeSet = new TreeSet<>();

		setWithTreeSet.add("TV");
		setWithTreeSet.add("Notebook");
		setWithTreeSet.add("Tablet");

		System.out.println(setWithTreeSet.contains("Notebook"));

		for (String p : setWithTreeSet) {
			System.out.println(p);
		}

		//LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados
		Set<String> setWithLinkedHashSet = new LinkedHashSet<>();

		setWithLinkedHashSet.add("TV");
		setWithLinkedHashSet.add("Notebook");
		setWithLinkedHashSet.add("Tablet");

		System.out.println(setWithLinkedHashSet.contains("Notebook"));

		for (String p : setWithLinkedHashSet) {
			System.out.println(p);
		}
	}
}
