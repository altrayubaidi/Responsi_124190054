package com.example.responsi_124190054.service.cases;

import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("tanggal")
    private String tanggal;

    @SerializedName("kode_prov")
    private String kodeProv;

    @SerializedName("nama_prov")
    private String namaProv;

    @SerializedName("SUSPECT")
    private int sUSPECT;

    @SerializedName("suspect_diisolasi")
    private int suspectDiisolasi;

    @SerializedName("suspect_discarded")
    private int suspectDiscarded;

    @SerializedName("CLOSECONTACT")
    private int cLOSECONTACT;

    @SerializedName("closecontact_dikarantina")
    private int closecontactDikarantina;

    @SerializedName("closecontact_discarded")
    private int closecontactDiscarded;

    @SerializedName("probable_discarded")
    private int probableDiscarded;

    @SerializedName("probable_diisolasi")
    private int probableDiisolasi;

    @SerializedName("probable_meninggal")
    private int probableMeninggal;

    @SerializedName("CONFIRMATION")
    private int cONFIRMATION;

    @SerializedName("confirmation_diisolasi")
    private int confirmationDiisolasi;

    @SerializedName("confirmation_selesai")
    private int confirmationSelesai;

    @SerializedName("confirmation_meninggal")
    private int confirmationMeninggal;

    @SerializedName("suspect_meninggal_harian")
    private int suspectMeninggalHarian;

    @SerializedName("closecontact_meninggal_harian")
    private int closecontactMeninggalHarian;

    public String getTanggal(){
        return tanggal;
    }

    public String getKodeProv(){
        return kodeProv;
    }

    public String getNamaProv(){
        return namaProv;
    }

    public int getSUSPECT(){
        return sUSPECT;
    }

    public int getSuspectDiisolasi(){
        return suspectDiisolasi;
    }

    public int getSuspectDiscarded(){
        return suspectDiscarded;
    }

    public int getCLOSECONTACT(){
        return cLOSECONTACT;
    }

    public int getClosecontactDikarantina(){
        return closecontactDikarantina;
    }

    public int getClosecontactDiscarded(){
        return closecontactDiscarded;
    }

    public int getProbableDiscarded(){
        return probableDiscarded;
    }

    public int getProbableDiisolasi(){
        return probableDiisolasi;
    }

    public int getProbableMeninggal(){
        return probableMeninggal;
    }

    public int getCONFIRMATION(){
        return cONFIRMATION;
    }

    public int getConfirmationDiisolasi(){
        return confirmationDiisolasi;
    }

    public int getConfirmationSelesai(){
        return confirmationSelesai;
    }

    public int getConfirmationMeninggal(){
        return confirmationMeninggal;
    }

    public int getSuspectMeninggalHarian(){
        return suspectMeninggalHarian;
    }

    public int getClosecontactMeninggalHarian(){
        return closecontactMeninggalHarian;
    }
}
