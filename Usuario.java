public class Usuario {
private String login;
private String senha;
private int cod_paciente;

public Usuario(){

}

public Usuario(String login, String senha, int cod_paciente) {
    this.login = login;
    this.senha = senha;
    this.cod_paciente = cod_paciente;
}

public String getLogin() {
    return login;
}

public void setLogin(String login) {
    this.login = login;
}

public String getSenha() {
    return senha;
}

public void setSenha(String senha) {
    this.senha = senha;
}

public int getCod_paciente() {
    return cod_paciente;
}

public void setCod_paciente(int cod_paciente) {
    this.cod_paciente = cod_paciente;
}

}