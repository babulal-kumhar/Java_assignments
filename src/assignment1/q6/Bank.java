package assignment1.q6;

class Bank{
    String name;
    String headofficeAddress;
    String chairmanName;
    int branchCount;
    double fdInterestRate;
    double personalLoanInterestRate;
    double homeLoanInterestRate;

    void setName(String name){
        this.name=name;
    }
    void setHeadofficeAddress(String headofficeAddress){
        this.headofficeAddress=headofficeAddress;
    }
    void setChairmanName(String chairmanName){
        this.chairmanName=chairmanName;
    }
    void setBranchCount(int branchCount){
        this.branchCount=branchCount;
    }
    void setFdInterestRate(double fdInterestRate){
        this.fdInterestRate=fdInterestRate;
    }
    void setPersonalLoanInterestRate(double personalLoanInterestRate){
        this.personalLoanInterestRate=personalLoanInterestRate;
    }
    void setHomeLoanInterestRate(double homeLoanInterestRate){
        this.homeLoanInterestRate=homeLoanInterestRate;
    }
    String getName(){
        return name;
    }
    String getHeadofficeAddress(){
        return headofficeAddress;
    }
    String getChairmanName(){
        return chairmanName;
    }
    int getBranchCount(){
        return branchCount;
    }
    double getFdInterestRate(){
        return fdInterestRate;
    }
    double getPersonalLoanInterestRate(){
        return personalLoanInterestRate;
    }
    double getHomeLoanInterestRate(){
        return homeLoanInterestRate;
    }

    public String toString(){
        return "Bank Name: "+name+
                "\nHead Office: "+headofficeAddress+
                "\nChairman: "+chairmanName+
                "\nBranches: "+branchCount+
                "\nFD Interest Rate: "+fdInterestRate+
                "\nPersonal Loan Rate: "+personalLoanInterestRate+
                "\nHome Loan Rate: "+homeLoanInterestRate;
    }
}
