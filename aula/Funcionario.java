package aula;

public class Funcionario {
    private String nome;
    private String data_nascimento;
    private String cargo;
    private int tipo_contrato; //1 -> Efetivo, 2 -> Horista
    private float salario;
    private int numero_filhos_menores;
    private String data_admissao;

    //Construtor:
    public void Funcionario(String nome, String data_nascimento){
        setNome(nome);
        setData_nascimento(data_nascimento);
    }
    
    //Setters e Getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTipo_contrato() {
        return tipo_contrato;
    }

    public void setTipo_contrato(int tipo_contrato) {
        this.tipo_contrato = tipo_contrato;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getNumero_filhos_menores() {
        return numero_filhos_menores;
    }

    public void setNumero_filhos_menores(int numero_filhos_menores) {
        this.numero_filhos_menores = numero_filhos_menores;
    }

    public String getData_admissao() {
        return data_admissao;
    }

    public void setData_admissao(String data_admissao) {
        this.data_admissao = data_admissao;
    }

    //Funções
    
    
}
