public abstract class Member {
    protected Integer poin = 0;
    
    public Integer getPoin(){
        return poin;
    }

    public Integer redeemPoin(Integer hargaSouvenir){
        return this.poin = this.poin - hargaSouvenir;
    }

    protected Integer getBonusPoin(Integer totalBayar){
        Integer poin = (int) (totalBayar / 10000);
        return poin;
    }

    public double hitungTotalBayar(double i) {
        return i;
    }
}
