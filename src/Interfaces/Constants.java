package src.Interfaces;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Miquel on 21/08/2017.
 */
public interface Constants {

    public static final String[] cadenasList= {"SERCOTEL", "SANTOS", "THE STREETS", "TAHITI",
    "MAY RAMBLAS/DALIA","MIRAMARBCN"};


    public static final String[][] hotelesSercotel = { {"ACTEON","503"},{"ALCALA611", "016"},
            {"ALCOY", "018"}, {"CIUTAT DE MONTCADA","003"},{"CONDE DUQUE","101"},
            {"COLISEO","010"},{"CUNIT", "501"},{"GATE BARCELONA","201"},
            {"LA SELVA","500"},{"LAS MARGAS", "502"}, {"MALAGA","388"},
            {"ZURBARAN","017"}};
    public static final String[][] hotelesSantos = {{"MIRAMAR MALAGA","112"}};

    public static final String[][] hotelesTheStreets = {{"005","005"},{"05B","05B"},{"009","009"},
    {"015","015"},{"018","018"}, {"023","023"}, {"024","024"}, {"24B","24B"}, {"049","049"},{"49B","49B"},
    {"130","130"},{"322", "322"},{"335", "335"}};

    public static final String[][] hotelesTahiti= {{"TAHITI","002"},{"CATALINA", "003"},{"MARIA", "004"}};

    public static final String[][] hotelesMayRamblas = {{"MAY RAMBLAS","001"}, {"DALIA","002"}};

    public static final String[][] hotelesMiramarBCN = {{"MIRAMAR BARCELONA", "003"}};

    public static final String[][][] allCadenas = {hotelesSercotel,hotelesSantos,hotelesTheStreets, hotelesTahiti, hotelesMayRamblas, hotelesMiramarBCN};


    public static final String[] serverSercotel = {""};

    public static final String[] serverSantos = {""};

    public static final String[] serverTheStreets = {""};

    public static final String[] serverTahiti = {""};

    public static final String[] serverMayRamblas = {"149.202.72.170", "ULYSES_MAYRAMBLAS", "tesipro", "uly24401"};

    public static final String[][] allServer = {serverSercotel, serverSantos, serverTheStreets, serverTahiti, serverMayRamblas};
}


/*
005
009
015
018
023
024
049
05B
130
24B
322
335
49B
 */