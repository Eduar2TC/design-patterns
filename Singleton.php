<?php 
final class Pointer{
    private static ?Pointer $pointer = null; //Private static atributte
    private function __construct(){} //private constructor
    public static function createSingleton(): Pointer{
        if( self::$pointer === null ){
            self::$pointer = new Pointer();
        }else{
            echo ' Object already created';
        }
        return self::$pointer;
    }
}
    $p = Pointer::createSingleton();
    $p1 = Pointer::createSingleton();
    
?>