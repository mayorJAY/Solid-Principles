//This presentation does not conform to the Interface Segregation Principle
//This Interface explains how a Printer is being installed on a PC some years ago, i.e just with the use of an installation CD
// It does not factor-in the fact that things can be done easier in the coming years
public interface LSPDemo {
    void insertInstallationDisk();
    void installDriver();
}

abstract class oldHpPrinter implements LSPDemo{
    @Override
    public void insertInstallationDisk() {
        //Get the driver needed from a Disk
    }

    @Override
    public void installDriver() {
        //Install the driver
    }
}

//Nowadays, CD is no longer needed to be able to install a printer. The driver can simply be downloaded online
//So if a modern printer is gotten, the above methods will not work for it. If we try to tweak its own code,
//we will have a child class that is different from the parent class and it's not substitutable of its parent class
//Therefore, the best way is to write the codes in a way that will accommodate future eventualities as shown below

//public interface LSPDemo {
//    void getDriver();
//    void installDriver();
//}
//An old type of printer can implement the interface
//abstract class oldHpPrinter implements LSPDemo{
//    @Override
//    public void getDriver() {
//        //Get the driver needed from any relevant source
//    }
//
//    @Override
//    public void installDriver() {
//        //Install the driver
//    }
//}
//A modern printer can as well implement the interface without problem
//abstract class newHpPrinter implements LSPDemo{
//    @Override
//    public void getDriver() {
//        //Get the driver needed from any relevant source
//    }
//
//    @Override
//    public void installDriver() {
//        //Install the driver
//    }
//}