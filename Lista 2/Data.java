public class Data {
    private int dia, mes, ano;
    private String meses[] = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro",
            "outubro", "novembro", "dezembro" };

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    private boolean validateDia(int dia) {
        if ((dia > 0) && (dia < 31)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validateMes(int mes) {
        if ((mes > 0) && (mes < 12)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validateAno(int ano) {
        if ((ano > 1900)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validateData(int dia, int mes, int ano) {
        return (validateDia(dia) && validateMes(mes) && validateAno(ano));
    }

    public void setData(int dia, int mes, int ano) {
        if (validateData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
        }
    }

    public String imprimirData() {
        String dataInt = this.dia + "/" + this.mes + "/" + this.ano;
        return dataInt;
    }

    public String imprimirDataS() {
        String dataString = "Dia " + this.dia + " de " + meses[this.mes - 1] + " de " + this.ano;
        return dataString;
    }
}
