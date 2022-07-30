object Singleton{
    var singleton: Singleton? = null
    init{
        println("Object created!")
    }
    fun createSingleton(): Singleton {
        
        if( this.singleton == null ){
            this.singleton = Singleton
        }else{
            print("Already created")
        }
        return this.singleton!!
    }
}

fun main() {
        Singleton.createSingleton()
        Singleton.createSingleton()
}