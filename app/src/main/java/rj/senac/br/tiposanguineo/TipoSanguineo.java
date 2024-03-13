package rj.senac.br.tiposanguineo;

public class TipoSanguineo {

    public String calcularCompatibilidade(String tipo) {
        String compatibilidade = "";

        switch (tipo.toUpperCase()) {
            case "A":
                compatibilidade = "A, O";
                break;
            case "B":
                compatibilidade = "B, O";
                break;
            case "AB":
                compatibilidade = "A, O, AB, O";
                break;
            case "O":
                compatibilidade = "O";
                break;
        }

        return compatibilidade;
    }

}
