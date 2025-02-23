package CriacaoMetodos_2;

public class Ex_04 {
    // Referente à If Else Datas e Horários - 05. Data entre Período

    public static void main(String[] args) {
        Date dataStart = new Date();
        boolean valid;
        do{
            System.out.println("Data de início: ");
            System.out.print("Dia: ");
            dataStart.setDay(Date.readInt());
            System.out.print("Mês: ");
            dataStart.setMonth(Date.readInt());
            System.out.print("Ano: ");
            dataStart.setYear(Date.readInt());
            valid = Date.isDateValid(
                    dataStart.getDay(),
                    dataStart.getMonth(),
                    dataStart.getYear()
            );
            if(!valid) {
                Date.invalidMessage();
            }
        }while (!valid);
        Date dataEnd = new Date();
        do{
            System.out.println("Data de fim: ");
            System.out.print("Dia: ");
            dataEnd.setDay(Date.readInt());
            System.out.print("Mês: ");
            dataEnd.setMonth(Date.readInt());
            System.out.print("Ano: ");
            dataEnd.setYear(Date.readInt());
            valid = Date.isDateValid(
                    dataEnd.getDay(),
                    dataEnd.getMonth(),
                    dataEnd.getYear()
            );
            if(!valid) {
                Date.invalidMessage();
            }
        }while (!valid);
        Date dataSearch = new Date();
        do{
            System.out.println("Data de pesquisa: ");
            System.out.print("Dia: ");
            dataSearch.setDay(Date.readInt());
            System.out.print("Mês: ");
            dataSearch.setMonth(Date.readInt());
            System.out.print("Ano: ");
            dataSearch.setYear(Date.readInt());
            valid = Date.isDateValid(
                    dataSearch.getDay(),
                    dataSearch.getMonth(),
                    dataSearch.getYear()
            );
            if(!valid) {
                Date.invalidMessage();
            }
        }while (!valid);
        boolean is = false;
        System.out.print("A data ");
        if (dataSearch.getYear() >= dataStart.getYear()
                && dataSearch.getYear() <= dataEnd.getYear()) {
            if ((dataSearch.getMonth() >= dataStart.getMonth() && dataSearch.getMonth() <= dataEnd.getMonth())
            || (dataSearch.getMonth() > dataEnd.getMonth() && dataSearch.getYear() < dataEnd.getYear())){
                if (dataSearch.getMonth() == dataStart.getMonth()
                        && dataSearch.getDay() >= dataStart.getDay()) {
                    is = true;
                }
                if (dataSearch.getMonth() == dataEnd.getMonth()
                        && dataSearch.getDay() <= dataEnd.getDay()) {
                    is = true;
                } else {
                    is = false;
                }
                if (dataSearch.getMonth() != dataStart.getMonth()
                        && dataSearch.getMonth() != dataEnd.getMonth()) {
                    is = true;
                }
            }
        }
        if(!is) {
            System.out.print("não ");
        }
        System.out.print("está no período inserido.");
    }
}
