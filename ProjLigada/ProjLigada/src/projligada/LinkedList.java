package projligada;

public class LinkedList {
     Node inicio;
    Node fim;
    int size;
    
    public LinkedList(){
        inicio = null;
        fim = null;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if (size==0)
            return true;
        else
            return false;
    }
    public Node first(){
        return fim;
    }
    public void addFirst(String nomeAnimal){
        Node novo = new Node (nomeAnimal);
        if (isEmpty()){
            inicio = novo;
            fim = novo;
        }
        else {
            novo.next = inicio;
            inicio = novo;
        }   
        size++;
    }
    public void addLast (String nomeAnimal){
        Node novo = new Node (nomeAnimal);
        if (isEmpty()){
            inicio = novo;
            fim = novo;
        }
        else{
            fim.next = novo;
            fim = novo;
        }
        size++;
    }
    public void mostraLista(){
        Node aux = inicio;
        while (aux.retornaNext() != null){
            System.out.print(aux.nomeAnimal+ " ");
            aux = aux.retornaNext();
        }
        System.out.print(aux.nomeAnimal + " ");
        System.out.print("\nFIM DA LISTA!");
    }
    public void addAfter(String novoAnimal, String nome){
        Node aux = inicio; 
        Node novo = new Node(novoAnimal);
        while (aux.retornaNext() != null){ 
            if (aux.nomeAnimal.equals(nome)){ 
                novo.next = aux.next;
                aux.next = novo;
                size++;
            }
            aux = aux.retornaNext();
        }
    }
    
    public void addBefore(String novoAnimal, String nome){
        if (inicio.nomeAnimal.equals(nome))
            addFirst(novoAnimal);
        else{
            Node nw, ant=null;
            Node no = new Node(novoAnimal);
            for (nw=inicio;!(nw.nomeAnimal.equals(nome));nw=nw.next)
                ant=nw;
            no.next=ant.next;
            ant.next=no;
            }
        size++;
    }
}
