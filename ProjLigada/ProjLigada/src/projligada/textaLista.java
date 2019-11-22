
package projligada;

public class textaLista {
    public static void main (String[] args){
		
	LinkedList lista = new LinkedList();
	lista.addFirst("GATO");
	lista.addFirst("TIGRE");
	lista.addLast("PATO");
	lista.addFirst("RATO");
	System.out.println("1º da lista: " + lista.inicio.nomeAnimal);
	System.out.println("Último da lista: " + lista.fim.nomeAnimal);
	System.out.println("Qtd de animais na lista: " + lista.size());
        lista.mostraLista();
                
        lista.addAfter("CÃO", "TIGRE");
        lista.mostraLista();
    }

}
