var Singleton = /** @class */ (function () {
    function Singleton() {
        console.log('created');
    }
    Singleton.createSingleton = function () {
        if (Singleton.singleton == undefined) {
            Singleton.singleton = new Singleton();
            return Singleton.singleton;
        }
        else {
            console.log('Already defined');
        }
        return Singleton.singleton;
    };
    return Singleton;
}());
var p1 = Singleton.createSingleton();
var p2 = Singleton.createSingleton();
