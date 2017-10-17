/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexsandro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instanciação de Funcionario gerou o objeto func
        Funcionario func = new Funcionario();
        func.nome = "Jose Luiz";
        func.salario = 8000;
        func.telefone = "23232323";
        
        Cliente cli = new Cliente();
        cli.nome = "Roberto Silva";
        cli.endereco = "Rua das flores";
        
        
        JOptionPane.showMessageDialog(null,func.getNome() );
        
    }
    
}
