package questao4;
import java.util.Stack;

public class MagicStack {
    
    private Stack<MagicCard> stack;

    public MagicStack() {
        stack = new Stack<>();
    }
    public void push(MagicCard card){
        if(stack.isEmpty() || isHabilidade(card)){
            stack.push(card);
        } else {
            System.out.println("Apenas Habilidades podem ser colocas em uma pilha que não está vazia");
        }
    }

    private boolean isHabilidade(MagicCard card) {
        TipoCard tipo = card.getTipo();
        return tipo == TipoCard.ATIVAR_HABILIDADE || tipo == TipoCard.HABILIDADE_ACIONADA;
    }

    public MagicCard pop(){
        if (!stack.isEmpty()){
            return stack.pop();
        } else {
            System.out.println("Pilha vazia!! ");
            return null;
        }
    }
    public MagicCard top(){
        if (!stack.isEmpty()){
            return stack.peek();
        } else {
            System.out.println("Pilha vazia!! ");
            return null;
        }
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public void clear(){
        stack.clear();
    }

    public void removerCard(MagicCard card){
        stack.remove(card);
    }
}
