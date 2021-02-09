package com.example.apporganizze.helper;

import java.text.SimpleDateFormat;

public class DateCustom {

    public static String dataAtual(){
        long date = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = simpleDateFormat.format(date);

        return dateString;
    }

    public static String mesAnoDataEscolhida(String data){
        String retornoData[] = data.split("/");
        String dia = retornoData[0]; //dia
        String mes = retornoData[1]; //mes
        String ano = retornoData[2]; //ano

        String mesAno = mes + ano;
        return mesAno;
    }
}
