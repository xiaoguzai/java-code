package javase_chapter4_homework2;

import java.util.ArrayList;

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

class Bank
{
    ArrayList<Customer> customers = new ArrayList<Customer>();
    //Customer customers[] = new Customer[5];
    int numberOfCustomer = 0;
    public void addCustomer(String f,String l)
    {
        Customer customer = new Customer(f,l);
        this.customers.add(customer);
        this.numberOfCustomer = this.numberOfCustomer+1;
    }
    public int getNumOfCustomers()
    {
        return this.customers.size();
    }
    public Customer getCustomer(int index)
    {
        for(int i=0;i<this.customers.size();i++)
        {
            if(this.customers.get(i).getAccount().getId() == index)
            {
                return this.customers.get(i);
            }
        }
        System.out.println("未查找到!");
        return null;
    }
}
public class chapter_4_homework2 {
    public static void main(String[] args) {
        //测试代码
    }
}
