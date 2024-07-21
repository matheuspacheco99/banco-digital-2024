
public class Cliente {
    public Banco banco;
    public String nome;
    public String email;
    public String telefone;
	public String CEP;

    public Cliente(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
        AddCliente();
    }

	private boolean AddCliente() {
		return this.banco.clientes.add(this);
	}

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
        AddCliente();
    }
	public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    public String getCEP() {
        return CEP;
    }

    @Override
    public String toString() {  
        return "Lista de Clientes: < " +
                "Banco: " + banco.nome + 
				" -Nome: " + this.getNome() + 
				" -Email: " + this.getEmail() + 
				" -Telefone: " + this.getTelefone() +
                "> \n";
    }




}