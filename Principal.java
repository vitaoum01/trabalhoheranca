public class Principal {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno ("Isaque", 39, "Rua dos Sorrisos");

        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getEndereco());
        System.out.println("");
        

        Mobilete mobilete = new Mobilete ("Caloi", "Claudete", "Rosa", 19085);

        System.out.println(mobilete.getMarca());
        System.out.println(mobilete.getModelo());
        System.out.println(mobilete.getCor());
        System.out.println("");

        Patinete patinete = new Patinete ("Petanhas", "Dinheiro", "Jesus", 2010);

        System.out.println(patinete.getMarca());
        System.out.println(patinete.getModelo());
        System.out.println(patinete.getCor());
        System.out.println("");
    }   

}