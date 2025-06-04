public class PetMachine {

    private boolean limpo;

    private int agua = 30;

    private int shampoo = 10;

    private Pet pet;

    public void darBanhoNoPet(){
        if(this.pet == null){
            System.out.println("Coloque o pet na maquina para iniciar o banho.");
            return;
        }
        this.agua -= 10;
        this.shampoo -= 2;
        pet.setLimpo(true);

        System.out.println("O pet "+ pet.getName()+" está limpo!");
    }

    public void addWater(){
        if(agua == 30){
            System.out.println("A capacidade do tanque de agua da máquina está no máximo!");
            return;
        }
        agua += 5;
    }

    public int getAgua() {
        return agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void addShampoo(){
        if(shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina está no máximo!");
            return;
        }
        shampoo += 2;
    }

    public boolean hasPetInShower(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.limpo){
            System.out.println("A máquina esta suja, para colocar o pet e necessário limpa-la.");
            return;
        }
        if(this.pet != null){
            System.out.println("O pet "+ this.pet.getName()+" esta na máquina nesse momento.");
            return;
        }
        this.pet = pet;
    }

    public void removePet(){

        this.limpo = this.pet.isLimpo();

        System.out.println("O pet "+ this.pet.getName()+ " esta limpo, e foi retirado da máquina!");
    }

    public void limparMaquina(){
        this.agua -= 10;
        this.shampoo -= 2;
        this.limpo = true;
        System.out.println("A máquina esta limpa!");
    }


}
