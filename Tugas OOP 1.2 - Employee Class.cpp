#include<iostream>
#include <string>

using namespace std;

class Employee
{
public:
    Employee( string, string, int );
    void setFirstName( string );
    string getFirstName();
    void setLastName(string);
    string getLastName();
    void setMonthlySalary(int);
    int getMonthlySalary();

private:
    string firstName;
    string lastName;
    int monthlySalary;
};

Employee::Employee( string first, string last, int salary)
{
    firstName=first;
    lastName=last;
    if(salary>0)
        monthlySalary=salary;
    else
    {
        monthlySalary=0;
        cout<<"Initial salary was invalid."<<endl;
    }
}

void Employee::setFirstName( string first)
{
    if ( first.length() <= 25 )
        firstName = first;
    if ( first.length() > 25 )
    {
        firstName = first.substr( 0, 25 );
        cout << "Name \"" << first <<"\" Exceeds Maximum Length (25).\n"<< "Limiting FirstName to First 25 Characters.\n" << endl;
    }
}

void Employee::setLastName(string last )
{
    if ( last.length() <= 25 )
        lastName = last;
    if ( last.length() > 25 )
    {
        lastName = last.substr( 0, 25 );
        cout << "Name \"" << last <<"\" Exceeds Maximum Length (25).\n"<< "Limiting LastName to First 25 Characters.\n" << endl;
    }
}

void Employee::setMonthlySalary(int salary )
{
    if(salary>0)
        monthlySalary=salary;
    else
    {
        monthlySalary=0;
        cout<<"Initial salary was Invalid."<<endl;
    }
}

string Employee::getFirstName()
{
    return firstName;
}

string Employee::getLastName()
{
    return lastName;
}

int Employee::getMonthlySalary()
{
    return monthlySalary;
}

int main()
{
    cout<<".- EMPLOYEE CLASS -."<<endl<<endl<<endl;
    Employee Employee1("Ladzi","Safroni",5000);
    Employee Employee2("Ama","Safroni",2000);
    cout << "Employee1's Name is: "<< Employee1.getFirstName()<<" "<< Employee1.getLastName()<<endl;
    cout<< "and Monthly Salary is: "<< Employee1.getMonthlySalary()<< " and Annual Salary is: "<< Employee1.getMonthlySalary()*12<< endl;
    cout<<"After 10 Percent Increment in Salary:"<<endl<<endl;
    int incrementedSalary1=Employee1.getMonthlySalary();
    incrementedSalary1=incrementedSalary1+(incrementedSalary1*0.1);
    Employee1.setMonthlySalary(incrementedSalary1);
    cout<< "Employee1's Monthly Salary is: "<< Employee1.getMonthlySalary()<< " and Annual Salary is: "<< Employee1.getMonthlySalary()*12<<endl<<endl;

    cout<<endl;
    cout << "Employee2's Name is: "<< Employee2.getFirstName()<<" "<< Employee2.getLastName()<<endl;
    cout<< "and Monthly Salary is: "<< Employee2.getMonthlySalary()<< " and Annual Salary is: "<< Employee2.getMonthlySalary()*12<< endl;
    cout<<"After 10 Percent Increment in Salary:"<<endl<<endl;
    int incrementedSalary2=Employee2.getMonthlySalary();
    incrementedSalary2=incrementedSalary2+(incrementedSalary2*0.1);
    Employee2.setMonthlySalary(incrementedSalary2);
    cout<< "Employee2's Monthly Salary is: "<< Employee2.getMonthlySalary()<< " and Annual Salary is: "<< Employee2.getMonthlySalary()*12<< endl;
}
