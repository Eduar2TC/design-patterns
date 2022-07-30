#include<iostream>
//Declaration class
class Singleton{
    private: 
    static Singleton *singleton;
    Singleton(){
        std::cout<<"Object created"<<std::endl;
    }
    public: 
    static Singleton* createSingleton();

};
//Definition class
Singleton *Singleton::singleton = 0;
Singleton *Singleton::createSingleton(){
    if (!singleton)
    {
        singleton = new Singleton();
        return singleton;
    }
    else
    {
        std::cout << "Already created" << std::endl;
    }
    return singleton;
}

int main(int argc, char const *argv[]){
    /* code */
    Singleton *singleton1 = Singleton::createSingleton();
    Singleton *singleton2 = Singleton::createSingleton();
    return 0;
}
