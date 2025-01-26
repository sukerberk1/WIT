#include<iostream>
#include<cstdlib>
#include<ctime>
using std::cout;
using std::cin;
using std::endl;
using std::string;
using std::to_string;
using std::ostream;
using std::istream;
///***********************************************************************************************************************************
///***********************************************************************************************************************************
class Person{
    public:
        Person(int, int, int);
        int MmHeight();
        int GWeight();
        int HP();
        virtual string ToString();

        virtual int WeaponId(){return 0;}

    private:
        int mmHeight;
        int gWeight;
        int hP;
    };
///***********************************************************************************************************************************
class Knight:public Person{
    public:
        Knight(int, int, int, int);
        int WeaponId();
        string ToString();
    private:
        int weaponId;
    };
///***********************************************************************************************************************************
class Wizard: public Person{
    public:
        Wizard(int, int, int, int, int, int);

    private:
        int mP;
        int wandPower;
    };
///***********************************************************************************************************************************
///***********************************************************************************************************************************
Person::Person(int mmHeight, int gWeight, int hP):mmHeight(mmHeight), gWeight(gWeight), hP(hP){}
///***********************************************************************************************************************************
int Person::MmHeight(){return mmHeight;}
///***********************************************************************************************************************************
int Person::GWeight(){return gWeight;}
///***********************************************************************************************************************************
int Person::HP(){return hP;}
///***********************************************************************************************************************************
string Person::ToString(){
    string myStr = "Height = ";
    myStr.append(to_string(mmHeight));
    myStr.append(" mm,  Weight = ");
    myStr.append(to_string(gWeight));
    myStr.append(" g,  HP = ");
    myStr.append(to_string(hP));

    return myStr;
    }
///***********************************************************************************************************************************
///***********************************************************************************************************************************
Knight::Knight(int mmHeight, int gWeight, int hP, int weaponId):Person(mmHeight, gWeight, hP), weaponId(weaponId){}
///***********************************************************************************************************************************
int Knight::WeaponId(){return weaponId;}
///***********************************************************************************************************************************
string Knight::ToString(){
    string myStr = Person::ToString();;
    myStr.append(", Weapon ID = ");
    myStr.append(to_string(weaponId));

    return myStr;
    }
///***********************************************************************************************************************************
///***********************************************************************************************************************************
int main(){
    Person* p1 = new Knight(2480000, 65000, 65,4);
    cout<<p1->ToString()<<endl;
    cout<<"Weapon Id = "<<p1->WeaponId()<<endl;

    return 0;
    }
///7, 8, 9, 10, 11




