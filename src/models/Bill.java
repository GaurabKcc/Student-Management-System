package models;

public class Bill {
    // tutionfee,transporationfee,date
    public int tutionFee,transportationFee;
    public String date;

    public Bill(int tutionFee, int transportationFee, String date) {
        this.tutionFee = tutionFee;
        this.transportationFee = transportationFee;
        this.date = date;
    }

    public int getTutionFee() {
        return tutionFee;
    }

    public void setTutionFee(int tutionFee) {
        this.tutionFee = tutionFee;
    }

    public int getTransportationFee() {
        return transportationFee;
    }

    public void setTransportationFee(int transportationFee) {
        this.transportationFee = transportationFee;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
