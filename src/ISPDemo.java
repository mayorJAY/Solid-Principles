//This presentation does not conform to the Interface Segregation Principle
public interface ISPDemo {
    void printIt();
    void faxIt();
}
//The printer can perform both printing and faxing
abstract class Printer implements ISPDemo{
    @Override
    public void printIt() {
        //perform some printing task
    }

    @Override
    public void faxIt() {
        //perform some faxing task
    }
}
//The fax machine cannot print a document so it is not supposed to have access to the printIt() in the ISPDemo interface
abstract class FaxMachine implements ISPDemo{
    @Override
    public void printIt() {
        //perform some printing task
    }

    @Override
    public void faxIt() {
        //perform some faxing task
    }
}

//The correct way to handle this is to create different interfaces for printIt() and faxIt()
// and then Printer and FaxMachine can implement the one relevant to it as shown below

//public interface ISPDemo1 {
//    void printIt();
//}
//
//public interface ISPDemo2 {
//    void faxIt();
//}
//
//abstract class Printer implements ISPDemo1, ISPDemo2{
//    @Override
//    public void printIt() {
//        //perform some printing task
//    }
//
//    @Override
//    public void faxIt() {
//        //perform some faxing task
//    }
//}
//
//abstract class FaxMachine implements ISPDemo2{
//    @Override
//    public void faxIt() {
//        //perform some faxing task
//    }
//}