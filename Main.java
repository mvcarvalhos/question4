package questao4;

public class Main {
    public static void main(String[] args) {
        MagicStack stack = new MagicStack();

        stack.push(new MagicCard("Goblin", TipoCard.CRIATURA, 7, "Roubar"));

        MagicCard removerCard = stack.pop();
        if(removerCard != null){
            System.out.println("Remover card: \n" + removerCard.toString());
            MagicCard topoCard = stack.top();
            if (topoCard != null){
                System.out.println("Card do Topp: \n" + topoCard.toString());
            }
        }
    }    
}
