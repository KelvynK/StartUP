package startup.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "EMPRESA")
public class Empresa implements Serializable, Cloneable
{

    private static final long serialVersionUID = 4927454144429877814L;

    private int       id;
    private String    nome_curto;
    private String    razao_social;
    private String    email;
    private long      cnpj;
    private String    telefone;
    private String    login;
    private String    senha;
    private String    endereco;

    @Id()
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROFISSIONAL_SEQ")
    @SequenceGenerator(name = "PROFISSIONAL_SEQ", sequenceName = "PROFISSIONAL_SEQ", allocationSize = 1)
    @Column(name = "ID")
    public int getId()
    {
        return id;
    }

    public void setId(int pId)
    {
        id = pId;
    }

    @Column(name = "NOME_CURTO")
    public String getNome_Curto()
    {
        return nome_curto;
    }

    public void setNome_Curto(String pNome_Curto)
    {
        nome_curto = pNome_Curto;
    }

    @Column(name = "RAZAO_SOCIAL")
    public String getRazao_Social()
    {
        return razao_social;
    }

    public void setRazao_Social(String pRazao_Social)
    {
        razao_social = pRazao_Social;
    }

    @Column(name = "EMAIL")
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String pEmail)
    {
        email = pEmail;
    }


    @Column(name = "TELEFONE")
    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String pTelefone)
    {
        telefone = pTelefone;
    }

    @Column(name = "CNPJ")
    public long getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(long pCnpj)
    {
        cnpj = pCnpj;
    }

    @Column(name = "LOGIN")
    public String getLogin()
    {
        return login;
    }

    public void setLogin(String pLogin)
    {
        login = pLogin;
    }

    @Column(name = "SENHA")
    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String pSenha)
    {
        senha = pSenha;
    }
    @Column(name = "ENDERECO")
    public String getEndereco()
    {
        return endereco;
    }

    public void setFuncao(String pEndereco)
    {
        endereco = pEndereco;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
}

