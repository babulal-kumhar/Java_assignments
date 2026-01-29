package assignment1.q6;

class BankTest{
    public static void main(String[]args){

        SBI sbi=new SBI();
        sbi.setName("SBI");
        sbi.setHeadofficeAddress("Mumbai");
        sbi.setChairmanName("Faiz");
        sbi.setBranchCount(22000);
        sbi.setFdInterestRate(6.5);
        sbi.setPersonalLoanInterestRate(10.3);
        sbi.setHomeLoanInterestRate(8.5);

        BOI boi=new BOI();
        boi.setName("BOI");
        boi.setHeadofficeAddress("Mumbai");
        boi.setChairmanName("dhawal");
        boi.setBranchCount(5000);
        boi.setFdInterestRate(6.25);
        boi.setPersonalLoanInterestRate(11.0);
        boi.setHomeLoanInterestRate(8.75);

        ICICI icici=new ICICI();
        icici.setName("ICICI");
        icici.setHeadofficeAddress("Mumbai");
        icici.setChairmanName("Babulal");
        icici.setBranchCount(6000);
        icici.setFdInterestRate(7.0);
        icici.setPersonalLoanInterestRate(10.5);
        icici.setHomeLoanInterestRate(9.0);

        System.out.println(sbi+"\n");
        System.out.println(boi+"\n");
        System.out.println(icici);
    }
}
