
package nsf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import nsf.bancoDados.criaConexao;
import nsf.logica.Beneficiario;

public class BeneficiarioDao {
    //Prepara Conexão
    private Connection conexao;
    
    public BeneficiarioDao() throws SQLException{
        this.conexao = criaConexao.getConexao();
    
    }
        //Função SQL INSERÇÃO
        public void adiciona(Beneficiario bf) throws SQLException{
          
            String sql = "insert into beneficiario (bf_nome, bf_cpf, bf_rg, bf_endereco, bf_bairro, bf_cidade, bf_estado, "
                    + "bf_fone, bf_obs) values (?,?,?,?,?,?,?,?,? )";  //COMANDO DE INSERÇÃO NO BANCO
            
            PreparedStatement stmt  = conexao.prepareStatement(sql);
            //seta os valores
            stmt.setString(1, bf.getBf_nome());
            stmt.setString(2, bf.getBf_cpf());
            stmt.setString(3, bf.getBf_rg());
            stmt.setString(4, bf.getBf_endereco());
            stmt.setString(5, bf.getBf_bairro());
            stmt.setString(6, bf.getBf_cidade());
            stmt.setString(7, bf.getBf_estado());
            stmt.setString(8, bf.getBf_fone());
            stmt.setString(9, bf.getBf_obs());
            
            //Executa comando sql
            stmt.execute();
            stmt.close();
}
        //Função SQL LISTAR Regristros
        public List<Beneficiario> getLista(String bf_nome) throws SQLException {
             String sql = "select * from beneficiario where bf_nome like ?";  //COMANDO PARA LISTAR REGISTROS DO BANCO
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            stmt.setString(1, bf_nome);
            ResultSet rs = stmt.executeQuery();
            
            List<Beneficiario> listaBeneficiario = new ArrayList<Beneficiario>();
            
            while(rs.next()){
                Beneficiario bf = new Beneficiario();
                bf.setBf_id(Integer.valueOf(rs.getString("bf_id")));
                bf.setBf_nome(rs.getString("bf_nome"));
                bf.setBf_cpf(rs.getString("bf_cpf"));
                bf.setBf_rg(rs.getString("bf_rg"));
                bf.setBf_endereco(rs.getString("bf_endereco"));
                bf.setBf_bairro(rs.getString("bf_bairro"));
                bf.setBf_cidade(rs.getString("bf_cidade"));
                bf.setBf_estado(rs.getString("bf_estado"));
                bf.setBf_fone(rs.getString("bf_fone"));
                bf.setBf_obs(rs.getString("bf_obs"));
                listaBeneficiario.add(bf);
            }
                rs.close();
                stmt.close();
                return listaBeneficiario;
            
}
        // Função SQL ALTERAR *
        public void alterar(Beneficiario bf) throws SQLException{
            String sql = "update beneficiario set bf_nome= ? ,bf_cpf= ?, bf_rg= ?, bf_endereco= ?, bf_bairro= ?, bf_cidade= ?, "
                    + "bf_estado= ?, bf_fone= ?, bf_obs= ? where bf_id= ?"; // COMANDO PARA ALTERAR REGISTROS NO BANCO
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            //seta os valores
            stmt.setString(1, bf.getBf_nome());
            stmt.setString(2, bf.getBf_cpf());
            stmt.setString(3, bf.getBf_rg());
            stmt.setString(4, bf.getBf_endereco());
            stmt.setString(5, bf.getBf_bairro());
            stmt.setString(6, bf.getBf_cidade());
            stmt.setString(7, bf.getBf_estado());
            stmt.setString(8, bf.getBf_fone());
            stmt.setString(9, bf.getBf_obs());
            stmt.setInt(10, bf.getBf_id());
            
            //Executa comando sql
            stmt.execute();
            stmt.close();
}

    public void remove(Beneficiario bf) throws SQLException {
        String sql = "delete from  beneficiario where bf_id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, bf.getBf_id());
        stmt.execute();
        stmt.close();
    }
}
