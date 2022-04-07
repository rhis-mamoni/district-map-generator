package com.rhis;

import java.util.HashMap;
import java.util.Map;

public class DataSets {
    public static final String HABIGANJ_TEXT = "হবিগঞ্জ";
    public static final String TANGAIL_TEXT = "টাঙ্গাইল";
    public static final String NOAKHALI_TEXT = "নোয়াখালী";
    public static final String LAKSHMIPUR_TEXT = "লক্ষীপুর";
    public static final String JHALOKATHI_TEXT = "ঝালকাঠি";
    public static final String NATORE_TEXT = "নাটোর";
    public static final String SYLHET_TEXT = "সিলেট";
    public static final String MADARIPUR_TEXT = "মাদারীপুর";
    public static final String MAULVIBAZAR_TEXT = "মৌলভীবাজার";
    public static final String JHENAIDAH_TEXT = "ঝিনাইদহ";
    public static final String RANGPUR_TEXT = "রংপুর";
    public static final String KURIGRAM_TEXT = "কুড়িগ্রাম";
    public static final String LALMONIRHAT_TEXT = "লালমনিরহাট";
    public static final String NILPHAMARI_TEXT = "নীলফামারী";
    public static final String PANCHAGARH_TEXT = "পঞ্চগড়";
    public static final String THAKURGAON_TEXT = "ঠাকুরগাঁও";
    public static final String COXS_BAZAR_TEXT = "কক্সবাজার";
    public static final String DINAJPUR_TEXT = "দিনাজপুর";
    public static final String GAIBANDHA_TEXT = "গাইবান্ধা";
    public static final String RAJSHAHI_TEXT = "রাজশাহী";
    public static final String BRAHMANBARIA_TEXT = "ব্রাহ্মণবাড়িয়া";
    public static final String MANIKGANJ_TEXT = "মানিকগঞ্জ";
    public static final String CHANDPUR_TEXT = "চাঁদপুর";
    public static final String KUSHTIA_TEXT = "কুষ্টিয়া";
    public static final String FARIDPUR_TEXT = "ফরিদপুর";
    public static final String FENI_TEXT = "ফেনী";
    public static final String CUMILLA_TEXT = "কুমিল্লা";
    public static final String SUNAMGANJ_TEXT = "সুনামগঞ্জ";
    public static final String BANDARBAN_TEXT = "বান্দরবান";
    public static final String KHAGRACHARI_TEXT = "খাগড়াছড়ি";
    public static final String RANGAMATI_TEXT = "রাঙ্গামাটি";
    public static final String BARGUNA_TEXT = "বরগুনা";
    public static final String GOPALGANJ_TEXT = "গোপালগঞ্জ";
    public static final String CHATTOGRAM_TEXT = "চট্টগ্রাম";

    //TODO: Don't change the previous order during adding a new district into the list
    public static final String[] disitrictArray = {
            HABIGANJ_TEXT, TANGAIL_TEXT, NOAKHALI_TEXT, LAKSHMIPUR_TEXT, JHALOKATHI_TEXT, NATORE_TEXT, SYLHET_TEXT,
            MAULVIBAZAR_TEXT, MADARIPUR_TEXT, JHENAIDAH_TEXT, RANGPUR_TEXT, KURIGRAM_TEXT, LALMONIRHAT_TEXT,
            NILPHAMARI_TEXT, PANCHAGARH_TEXT, THAKURGAON_TEXT, COXS_BAZAR_TEXT, DINAJPUR_TEXT, GAIBANDHA_TEXT,
            RAJSHAHI_TEXT, BRAHMANBARIA_TEXT, MANIKGANJ_TEXT, CHANDPUR_TEXT, KUSHTIA_TEXT, FARIDPUR_TEXT, FENI_TEXT,
            CUMILLA_TEXT, SUNAMGANJ_TEXT, BANDARBAN_TEXT, KHAGRACHARI_TEXT, RANGAMATI_TEXT, BARGUNA_TEXT,
            GOPALGANJ_TEXT, CHATTOGRAM_TEXT};


    public static final Map<String, Integer> districtMappingWithCode = Map.ofEntries(
            Map.entry(HABIGANJ_TEXT, 36),
            Map.entry(LAKSHMIPUR_TEXT, 51),
            Map.entry(JHALOKATHI_TEXT, 42),
            Map.entry(NOAKHALI_TEXT, 75),
            Map.entry(NATORE_TEXT, 69),
            Map.entry(TANGAIL_TEXT, 93),
            Map.entry(MAULVIBAZAR_TEXT, 58),
            Map.entry(MADARIPUR_TEXT, 54),
            Map.entry(JHENAIDAH_TEXT, 44),
            Map.entry(RANGPUR_TEXT, 85),
            Map.entry(KURIGRAM_TEXT, 49),
            Map.entry(LALMONIRHAT_TEXT, 52),
            Map.entry(NILPHAMARI_TEXT, 73),
            Map.entry(PANCHAGARH_TEXT, 77),
            Map.entry(THAKURGAON_TEXT, 94),
            Map.entry(COXS_BAZAR_TEXT, 22),
            Map.entry(DINAJPUR_TEXT, 27),
            Map.entry(GAIBANDHA_TEXT, 32),
            Map.entry(RAJSHAHI_TEXT, 81),
            Map.entry(SYLHET_TEXT, 91),
            Map.entry(BRAHMANBARIA_TEXT, 12),
            Map.entry(MANIKGANJ_TEXT, 56),
            Map.entry(CHANDPUR_TEXT, 13),
            Map.entry(KUSHTIA_TEXT, 50),
            Map.entry(FARIDPUR_TEXT, 29),
            Map.entry(FENI_TEXT, 30),
            Map.entry(CUMILLA_TEXT, 19),
            Map.entry(SUNAMGANJ_TEXT, 90),
            Map.entry(BANDARBAN_TEXT, 3),
            Map.entry(KHAGRACHARI_TEXT, 46),
            Map.entry(RANGAMATI_TEXT, 84),
            Map.entry(BARGUNA_TEXT, 4),
            Map.entry(GOPALGANJ_TEXT, 35),
            Map.entry(CHATTOGRAM_TEXT, 15));

    public static final HashMap<String, String> serverEndpoints = new HashMap<>() {{
        put(DataSets.HABIGANJ_TEXT,"http://mamoni.net:8080/eMIS_36/");
        put(DataSets.LAKSHMIPUR_TEXT,"http://119.148.43.41:8080/eMIS_51/");
        put(DataSets.JHALOKATHI_TEXT,"http://119.148.43.42:8080/eMIS_42/");
        put(DataSets.NOAKHALI_TEXT,"http://119.148.43.43:8080/eMIS_75/");
        put(DataSets.NATORE_TEXT,"http://emis.icddrb.org:8080/eMIS_69/");
        put(DataSets.TANGAIL_TEXT,"http://emis.icddrb.org:8080/eMIS_93/");
        put(DataSets.MAULVIBAZAR_TEXT,"http://emis.icddrb.org:8080/eMIS_58/");
        put(DataSets.MADARIPUR_TEXT,"http://emis.icddrb.org:8080/eMIS_54/");
        put(DataSets.JHENAIDAH_TEXT,"http://emis.icddrb.org:8080/eMIS_44/");
        put(DataSets.RANGPUR_TEXT,"http://emis.icddrb.org:8080/eMIS_85/");
        put(DataSets.KURIGRAM_TEXT,"http://emis.icddrb.org:8080/eMIS_49/");
        put(DataSets.LALMONIRHAT_TEXT,"http://114.130.119.128:8080/eMIS_52/");
        put(DataSets.NILPHAMARI_TEXT,"http://114.130.119.74:8080/eMIS_73/");//BCC server
        put(DataSets.PANCHAGARH_TEXT,"http://114.130.119.128:8080/eMIS_77/");
        put(DataSets.THAKURGAON_TEXT,"http://emis.icddrb.org:8080/eMIS_94/");
        put(DataSets.COXS_BAZAR_TEXT,"http://114.130.119.74:8080/eMIS_22/");
        put(DataSets.DINAJPUR_TEXT,"http://emis.icddrb.org:8080/eMIS_27/");
        put(DataSets.GAIBANDHA_TEXT,"http://114.130.119.72:8080/eMIS_32/");//BCC server
        put(DataSets.RAJSHAHI_TEXT,"http://emis.icddrb.org:8080/eMIS_81/");
        put(DataSets.SYLHET_TEXT,"http://119.148.43.42:8080/eMIS_91/");
        put(DataSets.BRAHMANBARIA_TEXT,"http://119.148.43.42:8080/eMIS_12/");
        put(DataSets.MANIKGANJ_TEXT,"http://119.148.43.41:8080/eMIS_56/");
        put(DataSets.CHANDPUR_TEXT,"http://119.148.43.41:8080/eMIS_13/");
        put(DataSets.KUSHTIA_TEXT,"http://119.148.6.164:8080/eMIS_50/");
        put(DataSets.FARIDPUR_TEXT,"http://119.148.6.164:8080/eMIS_29/");
        put(DataSets.FENI_TEXT,"http://119.148.6.164:8080/eMIS_30/");
        put(DataSets.CUMILLA_TEXT,"http://119.148.43.45:8080/eMIS_19/");
        put(DataSets.SUNAMGANJ_TEXT,"http://119.148.6.165:8080/eMIS_90/");
        put(DataSets.BANDARBAN_TEXT,"http://119.148.6.166:8080/eMIS_03/");
        put(DataSets.KHAGRACHARI_TEXT,"http://119.148.6.166:8080/eMIS_46/");
        put(DataSets.RANGAMATI_TEXT,"http://119.148.6.168:8080/eMIS_84/");
        put(DataSets.BARGUNA_TEXT,"http://114.130.119.72:8080/eMIS_04/");//BCC server
        put(DataSets.GOPALGANJ_TEXT,"http://114.130.119.74:8080/eMIS_35/");//BCC server
        put(DataSets.CHATTOGRAM_TEXT,"http://114.130.119.72:8080/eMIS_15/");//BCC server
    }};
}
