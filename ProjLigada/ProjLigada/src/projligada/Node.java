package projligada;

public class Node {
    String nomeAnimal;
    Node next;

    public Node (String nomeAnimal){
        this.nomeAnimal = nomeAnimal;
        next = null;
        
    }
    public String retornaNomeAnimal(){
        return nomeAnimal;
    }
    public void mudanomeAnimal(String nomeAnimal){
        this.nomeAnimal = nomeAnimal;
    }
    public Node retornaNext(){
        return next;
    }
    public void mudaNext(Node no){
        next = no;
    }
}