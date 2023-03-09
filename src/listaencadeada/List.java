/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaencadeada;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class List {
      No inicio;
      No fim;
      int tamanho;
      
      List (){
      inicio = null;
      fim = null;
      tamanho = 0 /*quantidade de nós*/;
      } 
            
      void adicionar(String nome, String tel){
          No no = new No(nome, tel);
          
          if(estavazia()){//se lista vazia
              inicio = no;         
          }
          else{
              fim.proximo = no;
          }
          fim = no;
          tamanho++; 
      }
            
      boolean estavazia(){
      return tamanho == 0;
      }


        void imprimirLista(){
            No no = inicio;
            for(int i = 0; i < tamanho; i++){
                System.out.println(no.nome + " - " + no.tel);
                
                no = no.proximo;
                
            } 
           
        }
        
        String buscaTelefone(String nome){
                    No no = inicio;
                    for(int i = 0; i < tamanho; i++){
                        if(no.nome.equals(nome)){
                        return no.tel;
                        }
                        no = no.proximo;
                    }
                    return "Não localizado";
        }
      
      
      


    /*public int getTamanho() {
        return tamanho;
        System.out.println("" + tamanho);
    }*/
    

      
      
}
