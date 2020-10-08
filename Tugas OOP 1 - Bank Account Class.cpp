#include <iostream>
#include <string>

using namespace std;

class Account
{
public:
    Account(int);
    void credit(int);
    void debit(int);
    int getAccountBalance();

private:
    int accountBalance;
};

Account::Account(int balance)
{
    if(balance>=0)
        accountBalance=balance;
    else
    {
        accountBalance=0;
        cout<<"Initial Balance was Invalid."<<endl;
    }
}

void Account::credit(int balance)
{
    accountBalance=accountBalance+balance;
}

void Account::debit(int balance)
{
    if(accountBalance>=balance)
    {
        accountBalance=accountBalance-balance;
    }
    else
    {
        cout<<"Debit Amount exceeded Account Balance."<<endl;
    }
}

int Account::getAccountBalance()
{
    return accountBalance;
}

int main()
{
    cout<<".- BANK ACCOUNT CLASS -."<<endl<<endl<<endl;
    Account Account1(89);
    Account Account2(50);
    cout<<"Account1's Initial Balance is : "<<Account1.getAccountBalance()<<"\nAccount2's Initial Balance is : "<<Account2.getAccountBalance() <<endl;
    Account1.credit(100);
    Account2.credit(50);
    cout<<"\nAccount1's Balance is : "<<Account1.getAccountBalance()<<"\nAccount2's Balance is : "<<Account2.getAccountBalance() <<endl;
    Account1.debit(100);
    Account2.debit(50);
    cout<<"\nAccount1's Balance is : "<<Account1.getAccountBalance()<<"\nAccount2's Balance is : "<<Account2.getAccountBalance() <<endl;
}
