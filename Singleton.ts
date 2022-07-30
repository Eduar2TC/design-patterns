class Singleton{
    
    private static singleton:Singleton;
    
    private constructor(){
        console.log('created');
    }

    static createSingleton():Singleton{
        if( Singleton.singleton == undefined ){
            Singleton.singleton = new Singleton();
            return Singleton.singleton;
        }else{
            console.log('Already defined');
        }
        return Singleton.singleton;
    }
}
const p1 = Singleton.createSingleton();
const p2 = Singleton.createSingleton();