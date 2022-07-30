class Pointer {
  static Pointer? _p; //Pricate static attribute

  Pointer() {}
  //private cronstructor
  Pointer? _createSingleton() {
    if (_p == null) {
      _p = new Pointer();
    } else {
      print("Object already created");
    }
    return _p;
  }
}

void main(List<String> args) {
  Pointer p = new Pointer();
  p._createSingleton();
  Pointer p1 = new Pointer();
  p1._createSingleton();
}
