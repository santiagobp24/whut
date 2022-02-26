import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

class Verificacion{
    private Date dia.getDate();
    private Date mes.getMonth();
    private Date anio.getFullYear();

    public verFecha (Date num){
        const
        Int numD = 31;
        if(num.month == 4 || num.month == 6 || num.month == 9 || num.month == 11){
            numD = 30;
        }
        if (num.month == 2){
            if (num.year % 4 == 0 && num.year % 100 = 0){
                numD = 29
            } else {
                numD = 28
            }
        }
        if (num.year == 2022){
            if(num.month == mes){
                if(num.day >= 1 && num.day <= dia ){
                    return true;
                } else {
                    return false;
                }
            }else if (num.month < mes){
                if (num.day >= 1 && num.day <= numD){
                    return true;
                }
            }else{
                return false;
            }
        }
        if (num.year >=1900 && num.year <= 2021){
            if (num.month >= 1 && num.month <= 12){
                if (num.day >= 1 && num.day <= numD){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }

        } else {
            return false;
        }

    }
}