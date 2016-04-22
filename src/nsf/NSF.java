/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsf;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import nsf.bancoDados.criaConexao;
import nsf.dao.BeneficiarioDao;
import nsf.logica.Beneficiario;


public class NSF {

    public static void main(String[] args) throws SQLException {
       
      /*  Beneficiario bf = new Beneficiario();
        bf.setBf_nome("Augusto Cesar");
        bf.setBf_cpf("11111111111");
        bf.setBf_rg("222222222222");
        bf.setBf_endereco("Rua 19 de Novembro, N 05");
        bf.setBf_bairro("Itaperu");
        bf.setBf_cidade("Teresina");
        bf.setBf_estado("Piauí");
        bf.setBf_fone("3661-5150");
        bf.setBf_obs("Cadastro completo!");
        
        BeneficiarioDao dao = new BeneficiarioDao();
        dao.adiciona(bf);
        System.out.println("Registrado com Sucesso no Banco!");
       */
       
        /*BeneficiarioDao dao  = new BeneficiarioDao();
            List<Beneficiario>listaBeneficiario =  dao.getLista();
            
                for (Beneficiario beneficiario : listaBeneficiario) {
                    System.out.println("Nome: " + beneficiario.getBf_nome());
                    System.out.println("CPF: " + beneficiario.getBf_cpf());
                    System.out.println("RG: " + beneficiario.getBf_rg());
                    System.out.println("Endereço: " + beneficiario.getBf_endereco());
                    System.out.println("Bairro: " + beneficiario.getBf_bairro());
                    System.out.println("Cidade: " + beneficiario.getBf_cidade());
                    System.out.println("Estado: " + beneficiario.getBf_estado());
                    System.out.println("Fone: " + beneficiario.getBf_fone());
                    System.out.println("OBS: " + beneficiario.getBf_obs());
        }
     */
     /*
        Beneficiario bf = new Beneficiario();
        bf.setBf_id(Integer.valueOf(1));
        bf.setBf_nome("Augusto Cesar ");
        bf.setBf_cpf("00011111111");
        bf.setBf_rg("222222222222");
        bf.setBf_endereco("Rua 19 de Novembro, N 05");
        bf.setBf_bairro("Itaperu");
        bf.setBf_cidade("Teresina");
        bf.setBf_estado("Piauí");
        bf.setBf_fone("3661-5150");
        bf.setBf_obs("Cadastro completo!");
        BeneficiarioDao dao = new BeneficiarioDao();
        dao.alterar(bf);
        */   
    }
    
    
}
