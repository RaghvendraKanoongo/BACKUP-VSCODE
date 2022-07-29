import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner jin  = new Scanner(System.in);
        Bank[] bankOfIndia = new Bank[2];
        for (int i = 0; i< bankOfIndia.length; i++) {
            
            System.out.println("\n\t-------- Welcome to SBI --------\n");
            System.out.println("In which Branch do you want to open your account??\n Press '1' for Rajwada Branch.\n Press '2' for Sudama Nagar Branch.");
            int branch = jin.nextInt();
            if (branch == 1){
                bankOfIndia[i] = new Bank("Rajwada");
            }
            else if (branch == 2){
                bankOfIndia[i] = new Bank("SudamaNagar");
            }
            else 
                System.out.println("No such Branch found: WRONG INPUT!!!");
        }
    }
}

class Bank{
    static int i = 1233;
    static String branchName;
    Scanner jin =  new Scanner(System.in);

    Bank(){};
    Bank(String branchName1){
        
       branchName = branchName1;
        if ("Rajwada" == branchName){
            
            System.out.println("What type of account do you want to open? \n  Press '1' for Savings Account \n  Press '2' for Current Account");
            int input = jin.nextInt();

            if (input == 1){

                SavingsAccount s1 = new SavingsAccount();
                System.out.println("\n  Cogretulations!! Your account is created in Bank of India Rajwada branch.\n");
                System.out.println("\n \n \tDo you want to withdraw Amount? Press 'y' or 'n'");
                char c = jin.next().charAt(0);
                s1.withdraw(c);
                System.out.println("\nIf you want a loan press 'y' else press'n'.");
                char ans = jin.next().charAt(0);
                s1.wantLoan(ans);
            }

            else if (input == 2){

                CurrentAccount c1 = new CurrentAccount();
                System.out.println("\n  Cogretulations!! Your account is created in Bank of India Rajwada branch.\n");   

                System.out.println("\nIf you want over draft 'y' else press'n'.");
                char ans = jin.next().charAt(0);
                c1.wantOverdraft(ans);

                System.out.println("\n \tDo you want to withdraw Amount? Press 'y' or 'n'");
                char c = jin.next().charAt(0);
                c1.withdraw(c);
            }
            System.out.println("Thankyou! For Bankinig with us.");
        }

        else if ("SudamaNagar" == branchName1){

            branchName = branchName1;
            System.out.println("What type of account do you want to open? \n  Press '1' for Savings Account \n  Press '2' for Current Account");
            int input = jin.nextInt();

            if (input == 1){

                SavingsAccount s1 = new SavingsAccount();
                System.out.println("\n  Cogretulations!! Your account is created in Bank of India Rajwada branch.\n");

                System.out.println("\nIf you want a loan press 'y' else press'n'.");
                char ans = jin.next().charAt(0);
                s1.wantLoan(ans);

                System.out.println("\n \tDo you want to withdraw Amount? Press 'y' or 'n'");
                char c = jin.next().charAt(0);
                s1.withdraw(c);
            }

            else if (input == 2){

                CurrentAccount c1 = new CurrentAccount();
                System.out.println("\n  Cogretulations!! Your account is created in Bank of India Sudama Nagar branch.\n");   

                System.out.println("\nIf you want over draft 'y' else press'n'.");
                char ans = jin.next().charAt(0);
                c1.wantOverdraft(ans);

                System.out.println("\n \tDo you want to withdraw Amount? Press 'y' or 'n'");
                char c = jin.next().charAt(0);
                c1.withdraw(c);
            }
            System.out.println("Thankyou! For Bankinig with us.");
        }
        
    }
}

abstract class Account extends Bank{
    
    String name;
    final String id = Integer.toString(++i);
    String phone;
    double amount;
    String accountType;

    abstract void enroll();
    abstract void accountInfo();
    abstract void deposite(double amount);
    abstract void withdraw(char ans);
}

class AdapterAccountClass extends Account{
    
    void enroll(){};
    void accountInfo(){};
    void deposite(double amount) {};
    void withdraw(char ans) {};
    {System.out.println(branchName);}
}

class SavingsAccount extends AdapterAccountClass{
    
    double loanAmount;
    double intrestLoanAmount;
    final double intrestRate = 0.02;
    SavingsAccount(){
        accountType = "SavingsAccount";
        enroll();
    }

    @Override
    void enroll() {

        super.enroll();
        Scanner jin = new Scanner(System.in);

        System.out.println("Enter Name: ");
        name = jin.nextLine();

        System.out.println("\nEnter phone number: ");
        phone = jin.nextLine();

        System.out.println("\nEnter the Ammount to deposite: ");
        double amt = jin.nextDouble();
        deposite(amt);
        System.out.println("");
        accountInfo();
    }

    @Override
    void accountInfo() {
        
        super.accountInfo();
        System.out.println(" \n ----- Account Information: \n");

        System.out.println("\tAlloted CustomerId is: " + id);
        System.out.println("\tName: "+name+"\n"+
                            "\tPhone: "+phone+"\n"+
                            "\tBalence: "+amount+"/-\n"+
                            "\tBranch: "+branchName+"\n"+
                            "\tLoan Amount: "+loanAmount+"\n"+
                            "\tAccount Type: "+accountType);
        
    }
    
    @Override
    void deposite(double amount) {
        
        super.deposite(amount);
        this.amount += amount;
        System.out.println("Rs."+this.amount+"/- got deposited in your Savings Account.");
    }
    
    @Override
    void withdraw(char ans) {

        super.withdraw(ans);

        if (ans == 'y') {
            System.out.println("Enter the withdraw amount: ");
            double amt = jin.nextDouble();

            if (amt>amount){
                System.out.println("Not enough money!!!!");
                
            }

            else{
                amount-= amt;
                System.out.println("Rs."+amount+"/- are remaning in your Savings Account");
            }
            accountInfo();
       }

        else
           System.out.println("No it is");
    }
    

    void wantLoan(char ans){
        if (ans == 'y'){

            System.out.println("\n\tRate of intrest is 10%");
            System.out.println("\n\tEnter the loan amount: ");
            loanAmount =  jin.nextDouble();
            System.out.println("\n\tLoan Granted for 1 year: ");
            System.out.println("\n\tAmmount to be paid after a Year: Loan Ammount + IntrestRate " + amountWithIntrest(loanAmount));
        }
    };

    public double amountWithIntrest(double reqLoanAmount){
        
        return loanAmount = loanAmount + loanAmount/10; 
    }

}

class CurrentAccount extends AdapterAccountClass{
    
    double overdraftAmmount;
    final double overdraftLimit = 10000;
    
    CurrentAccount(){
        accountType = "Current Account";
        enroll();
    };

    @Override
    void enroll() {
       
        super.enroll();
        Scanner jin = new Scanner(System.in);

        System.out.println("Enter Name: ");
        name = jin.nextLine();

        System.out.println("\nEnter phone number: ");
        phone = jin.nextLine();

        System.out.println("\nEnter the Ammount to deposite: ");
        double amt = jin.nextDouble();
        deposite(amt);
        System.out.println("");
        accountInfo();
        
    }

    @Override
    void accountInfo() {
        
        super.accountInfo();
        System.out.println(" \n ----- Account Information: \n");
        System.out.println("\tAlloted CustomerId is: " + id);
        System.out.println("\tName: "+name+"\n"+
                            "\tPhone: "+phone+"\n"+
                            "\tBalence: "+amount+"/-\n"+
                            "\tBranch: "+branchName+"\n"+
                            "\tOverdraft: "+overdraftAmmount+"\n"+
                            "\tAccount Type: "+accountType);
    }

    @Override
    void withdraw(char ans) {
        
        super.withdraw(ans);
        if (ans == 'y') {
            System.out.println("Enter the withdraw amount: ");
            double amt = jin.nextDouble();
            if (amt>amount){
                System.out.println("Not enough money!!!!");
                
            }
            else{
                amount-= amt;
                System.out.println("Rs."+amount+"/- are remaning in your Current Account");
            }
            accountInfo();
       }
       else{
           System.out.println("No it is");
       }
    }

    @Override
    void deposite(double amount) {
        
        super.deposite(amount);
        this.amount += amount;
        System.out.println("Rs."+this.amount+"/- got deposited in your Current Account.");
    }

    void wantOverdraft(char ans){
        if (ans == 'y'){
            System.out.println("\nEnter the Overdraft Amount you need: ");
            double oamt = jin.nextDouble();
            if (oamt>overdraftLimit){
                System.out.println("Cannot assign given amount: LimitOverreached");
            }
            else{
                overdraftAmmount = oamt;
                System.out.println("\n \tAmount: "+ overdraftAmmount+"/- is debbited to your creditcard\n");
            }

            accountInfo();
        }
    }
}