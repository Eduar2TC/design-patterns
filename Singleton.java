class Singleton{
    
    private static Singleton singleton; //Static private attribute

    private Singleton(){

    }
    private Singleton createSingleton(){
        //this.singleton = ( this.singleton == null ) ?  new Singleton() : null;
        if( singleton == null ){
            singleton = new Singleton();
        }else{
            System.out.println("Already created");
        }
        return singleton;
    }
    public static void main(String[] args) {
        Singleton s1 = new Singleton();
        s1.createSingleton(); 
        Singleton s2 = new Singleton();
        s2.createSingleton();       
    }
}