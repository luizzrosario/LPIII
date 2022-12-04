package Classes;

public class Data {
    private int dia, mes, ano;
    private String meses[] = { "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro",
            "outubro", "novembro", "dezembro" };

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public Data(Data data1) {
        this.dia = data1.getDia();
        this.mes = data1.getMes();
        this.ano = data1.getAno();
    }

    public void intializeData() {
        if ((dia == 0) || (mes == 0) || (ano == 0)) {
            setData(01, 01, 1900);
        } else {
            System.out.println("Ja ta inicializado");
            return;
        }
        return;
    }

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
        if ((ano >= 1900)) {
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
        return;
    }

    public void setData(Data data1) {
        if (validateData(dia, mes, ano)) {
            this.dia = data1.getDia();
            this.mes = data1.getMes();
            this.ano = data1.getAno();
        } else {
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
        }
        return;
    }

    public String imprimirData() {
        String dataInt = this.dia + "/" + this.mes + "/" + this.ano;
        return dataInt;
    }

    public String imprimirDataS() {
        String dataString = "Dia " + this.dia + " de " + meses[this.mes - 1] + " de " + this.ano;
        return dataString;
    }

    public static int dataInInt(Data data){
        int dataInt = (data.dia + (data.mes * 30)
        + (data.ano * 365));
        return dataInt;
    }

    public boolean isPrevious(Data data1) {
        int dia = data1.getDia();
        int mes = data1.getMes();
        int ano = data1.getAno();

        int data1Int = (dia + (mes * 30) + (ano * 365));

        int dataInt = (this.dia + (this.mes * 30)
                + (this.ano * 365));

        if (data1Int < dataInt) {
            return true;
        } else {
            return false;
        }
    }

    public int howManyDays(Data data1) {
        int dia = data1.getDia();
        int mes = data1.getMes();
        int ano = data1.getAno();

        int data1Int = (dia + (mes * 30) + (ano * 365));

        int dataInt = (this.dia + (this.mes * 30)
                + (this.ano * 365));

        return (data1Int - dataInt);
    }

    public int howManyDays(int d, int m, int a) {
        int dia = d;
        int mes = m;
        int ano = a;

        int data1Int = (dia + (mes * 30) + (ano * 365));

        int dataInt = (this.dia + (this.mes * 30)
                + (this.ano * 365));

        return (data1Int - dataInt);
    }

    public static int howManyDaysUndilEndYear(Data d) {
        return d.howManyDays(30, 12, d.getAno());
    }

    public boolean isBissexto() {
        if (this.getAno() % 4 == 0) {
            if ((this.getAno() % 100 != 0) || (this.getAno() % 400 == 0)) {
                return true;
            }
        }
        return false;
    }
}
