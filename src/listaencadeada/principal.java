/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaencadeada;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class principal {
 
    public static void main(String[] args) {
            List list = new List();
            list.adicionar("Ricardo", "(+55) 11 95845-5865");
            list.adicionar("Ana", "(+55) 11 96458-2315");
            list.adicionar("Aline", "(+55) 11 935478-4898");
            list.imprimirLista();
            
            
            String tel = list.buscaTelefone("Ana");
            System.out.println(tel);
            
            tel = list.buscaTelefone("Maria");
            System.out.println(tel);
            
    }
    

}
