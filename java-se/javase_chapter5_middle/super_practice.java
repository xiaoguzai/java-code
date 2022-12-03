package javase_chapter5_middle;

/***
 * 1
 * 、写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
 * 账号 id ，余额 balance ，年利率 annualInterestRate ；包含的方法：访问器方法 getter 和
 * setter 方法），返回月利率的方法 getMonthlyInterest()getMonthlyInterest()，取款方法 withdraw()withdraw()，存款方法
 * deposit() 。
 * Account
 * private int id
 * private double balance
 * private double annualInter
 * estRate
 * public Account (int id, double balance, double annualInterestRate )
 * public int getId()
 * public double getBalance()
 * public double getAnnualInterestRate()
 * public void setId( int id)
 * public void setBalance(double balance)
 * public void setAnnualInteres
 * tRate(double annualInterestRate)
 * public double getMonthlyInterest()
 * public void withdraw (double amount)
 * public void deposit (double amount)
 *
 *
 * 2
 * 、创建 Account 类的一个子类 Che ckAccount 代表可透支的账户，该账户中定义一个属性
 * overdraft 代表可透支限额。在 CheckAccount 类中重写 withdraw 方法，其算法如下：
 * 如果（取款金额
 * 账户余额），
 * 可直接取款
 * 如果（取款金额
 * 账户余额），
 * 计算需要透支的额度
 * 判断可透支额
 * overdraft 是否足够支付本次透支需要，如果可以
 * 将账户余额修改为 0 ，冲减可透支金额
 * 如果不可以
 * 提示用户超过可透支额的限额
 * 要求：
 * 写一个用户程序测试 CheckAccount 类。在用户程序中，创建一个账号为 1122 、余
 * 额为 20000 、年利 率 4.5%4.5%，可透支限额为 5000 元的 CheckAccount 对象。
 * 使用
 * withdraw 方法提款 5000 元，并打印账户余额和可透支额。
 * 再使用
 * withdraw 方法提款 18000 元，并打印账户余额和可透支额。
 * 再使用
 * withdraw 方法提款 3000 元，并打印账户余额和可透支额。
 * 提示：
 * （1） 子类 CheckAccount 的构造方法需要将从父类继承的 3 个属性和子类自己的属性全
 * 部初始化。
 * （2） 父类 Account 的属性 balance 被设置为 private ，但在子类 CheckAccount 的 withdraw
 * 方法中需要修改它的 值，因此应修改父类的 balance 属性，定义其为 protected
 */
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
    //取钱
    {
        if(this.balance >= amount)
        {
            this.balance = this.balance-amount;
            System.out.printf("取款成功，剩余金钱%f\n",this.balance);
        }
        else
        {
            System.out.println("取款失败");
        }
    }
    public void deposit(double amount)
    //存钱
    {
        this.balance = this.balance+amount;
        System.out.printf("存款成功，剩余金钱%f\n",this.balance);
    }
}

class CheckAccount extends Account
{
    public CheckAccount(int id,double balance,double annualInterestRate)
    {
        super(id, balance, annualInterestRate);
    }
}

public class super_practice {
    public static void main(String[] args) {
        CheckAccount user = new CheckAccount(1122,20000,4.5);
        user.deposit(5000);
        user.withdraw(18000);
        user.withdraw(3000);
    }
}
