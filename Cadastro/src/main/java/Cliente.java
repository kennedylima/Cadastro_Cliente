
public class Cliente {

	int ID;
	String RG;
	String CPF;
	String Email;
	String Nome;
	String Sexo;
	
	
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String RG) {
		this.RG = RG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String Sexo) {
		this.Sexo = Sexo;
	}
	
	public void getAll(){
		getID();
		getNome();
		getCPF();
		getRG();
		getEmail();
		getSexo();
	}
	
	
	
	
	
}
