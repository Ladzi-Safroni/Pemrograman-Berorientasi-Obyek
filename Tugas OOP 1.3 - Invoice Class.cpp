#include <iostream>
#include <string>

using namespace std;

class Invoice
{
public:
    Invoice (string, string, int, int);
    void setPartNumber(string);
    string getPartNumber();
    void setPartDescription(string);
    string getPartDescription();
    void setItemQuantity(int);
    int getItemQuantity();
    void setItemPrice(int);
    int getItemPrice();
    int getInvoiceAmount();

private:
    string partNumber;
    string PartDescription;
    int ItemQuantity;
    int ItemPrice;
};

Invoice::Invoice(string number, string description, int quantity, int price)
{
    partNumber=number;
    PartDescription=description;
    if(quantity>0)
        ItemQuantity=quantity;
    else
    {
        ItemQuantity=0;
        cout<<"Initial Quantity was Invalid."<<endl;
    }
    if (price>0)
        ItemPrice=price;
    else
    {
        ItemPrice=0;
        cout<<"Initial Price was Invalid."<<endl;
    }
}

void Invoice::setPartNumber( string number)
{
    if ( number.length() <= 25)
        partNumber=number;
    if ( number.length() > 25)
    {
        partNumber=number.substr(0, 25);
        cout<<"Name \""<<number<<"\" Exceeds Maximum Lenght (25).\n"<<"Limiting PartNumber to First 25 Characters.\n"<<endl;
    }
}

void Invoice::setPartDescription(string description)
{
    if(description.length() <= 25)
        PartDescription=description;
    if(description.length() > 25)
    {
        PartDescription=description.substr(0, 25);
        cout<<"Name \""<<description<<"\" Exceeds Maximum Lenght (25).\n"<<"Limiting PartDescription to First 25 Characters.\n"<<endl;
    }
}

void Invoice::setItemQuantity(int quantity)
{
    if(quantity>0)
        ItemQuantity=quantity;
    else{
        ItemQuantity=0;
        cout<<"Initial Quantity was Invalid"<<endl;
    }
}

void Invoice::setItemPrice(int price)
{
    if(price>0)
        ItemPrice=price;
    else{
        ItemPrice=0;
        cout<<"Initial Price was Invalid"<<endl;
    }
}

string Invoice::getPartNumber()
{
    return partNumber;
}

string Invoice::getPartDescription()
{
    return PartDescription;
}

int Invoice::getItemQuantity()
{
    return ItemQuantity;
}

int Invoice::getItemPrice()
{
    return ItemPrice;
}

int Invoice::getInvoiceAmount()
{
    return ItemQuantity*ItemPrice;
}

int main()
{
    cout<<".- INVOICE CLASS -."<<endl<<endl<<endl;
    Invoice Invoice1 ("1","Safroni",2,30);
    Invoice Invoice2 ("2","Agustina",10,3);

    cout<<"Invoice1's Initial Part Number is    : "<<Invoice1.getPartNumber()<<endl;
    cout<<"Part Description is                  : "<<Invoice1.getPartDescription()<<endl;
    cout<<"Quantity per Item is                 : "<<Invoice1.getItemQuantity()<<endl;
    cout<<"Price per Item is                    : "<<Invoice1.getItemPrice()<<endl;
    cout<<"Invoice1's Total Amount is           : "<<Invoice1.getInvoiceAmount()<<endl<<endl;

    cout<<"Invoice2's Initial Part Number is    : "<<Invoice2.getPartNumber()<<endl;
    cout<<"Part Description is                  : "<<Invoice2.getPartDescription()<<endl;
    cout<<"Quantity per Item is                 : "<<Invoice2.getItemQuantity()<<endl;
    cout<<"Price per Item is                    : "<<Invoice2.getItemPrice()<<endl;
    cout<<"Invoice2's Total Amount is           : "<<Invoice2.getInvoiceAmount()<<endl<<endl;
}
