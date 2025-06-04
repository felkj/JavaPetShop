import java.util.Scanner;


public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        var option = -1;


        do{
            System.out.println("==Escolha uma das opções==");
            System.out.println("1 - Dar banho no pet.");
            System.out.println("2 - Abastecer maquina com água.");
            System.out.println("3 - Abastecer maquina com Shampoo.");
            System.out.println("4 - Verificar água na Máquina.");
            System.out.println("5 - Verificar Shampoo na máquina.");
            System.out.println("6 - Verificar se tem Pet no banho.");
            System.out.println("7 - Colocar Pet na máquina");
            System.out.println("8 - Retirar Pet da máquina.");
            System.out.println("9 - Limpar máquina.");
            System.out.println("0 - Sair.");
            option = scanner.nextInt();

            switch (option){
                case 1 -> petMachine.darBanhoNoPet();
                case 2 -> setAgua();
                case 3 -> setShampoo();
                case 4 -> verifyAgua();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInShower();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.limparMaquina();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida!");
            }


        }while(true);


    }

    private static void setShampoo() {
        System.out.println("Foi adicionado 2 litros de shampoo");
        petMachine.addShampoo();
        System.out.println("Quantidade: "+ petMachine.getShampoo()+ " Litros");
    }
    private static void setAgua() {
        System.out.println("Foi adicionado 5 litros de Água");
        petMachine.addWater();
        System.out.println("Quantidade: "+ petMachine.getAgua()+ " Litros");
    }

    private static void verifyAgua() {
        var amount = petMachine.getAgua();
        System.out.println("A máquina esta com " + amount+" litros de Água");
    }
    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("A máquina esta com " + amount +" litros de Shampoo");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPetInShower();
        System.out.println(hasPet?"Tem pet na máquina.":"Não tem pet na máquina");
    }

    public static void setPetInShower(){
        var name = "";
        while(name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet");
            name = scanner.next();
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet " +pet.getName() + " foi colocado na máquina");
    }


}
