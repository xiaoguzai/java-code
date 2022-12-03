package javase_chapter4;

class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    public Account(int id,double balance,double annualInterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public int getId()
    {
        return this.id;
    }
    public double getBalance()
    {
        return this.balance;
    }
    public double getAnnualInterestRate()
    {
        return this.annualInterestRate;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }
    public void withdraw(double amount)
    {
        if(this.balance >= amount)
        {
            System.out.println("成功取出："+amount);
            this.balance = this.balance-amount;
            System.out.println("余额"+this.balance);
        }
        else
        {
            System.out.println("取款失败，余额不足");
            System.out.println("余额"+this.balance);
        }
    }
    public void deposit(double amount)
    {
        System.out.println("存款成功");
        this.balance = this.balance+amount;
        System.out.println("余额"+this.balance);
    }
}

class Customer
{
    private String firstName;
    private String lastName;
    private Account account;
    public Customer(String f,String l)
    {
        this.firstName = f;
        this.lastName = l;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public Account getAccount()
    {
        return this.account;
    }
    public void setAccount(Account account)
    {
        this.account = account;
    }
}

public class chapter_4_homework {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,1.23);
        customer.setAccount(account);
        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);
        customer.setAccount(account);
        System.out.println("Customer ["+customer.getFirstName()+","+customer.getLastName()+"] has a account: id is "+customer.getAccount().getId()
            +", annnualInterestRate is "+customer.getAccount().getAnnualInterestRate()+"%," +
                "balance is"+customer.getAccount().getBalance());
    }
}
