public class Rechnung {

    private int rechnungsnr;
    private int betrag;
    private String datum;

    public Rechnung(String pDatum, int pRechnungsnr, int pBetrag) {
        datum = pDatum;
        rechnungsnr = pRechnungsnr;
        betrag = pBetrag;
    }
    public void setRechnungsnr(int pRechnungsnr) {
        rechnungsnr = pRechnungsnr;
    }
    public int getRechnungsnr() {
        return rechnungsnr;
    }
    public void setBetrag(int pBetrag) {
        betrag = pBetrag;
    }
    public int getBetrag() {
        return betrag;
    }
    public void setDatum(String pDatum) {
        datum = pDatum;
    }

    public String getDatum() {
        return datum;
    }
}