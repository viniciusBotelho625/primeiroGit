public class Aluno{
   private int id;
   private String nome;
   
   public Aluno(String nome, int id){
      this.id   = id;
      this.nome = nome;
   }

   public int getId(){
      return id;
   }
   
   public String getNome(){
      return nome;
   }
   public void setId(int id){
      this.id = id;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
}