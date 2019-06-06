//This class contains several unrelated tasks or responsibility which violates the Single Responsibility Principle
//To make it conform with the SRP, different classes should be created to handle each task one at a time as shown below
public class SRPDemo {
    public void printTask(){
        //perform some printing task
    }
    public void ScanTask(){
        //perform some scanning task
    }
    public void faxTask(){
        //perform some faxing task
    }
}

//The following represents the correct way of implementing SRP
class toPrint{
    public void printTask(){
        //perform some printing task
    }
}

class toScan{
    public void ScanTask(){
        //perform some scanning task
    }
}

class toFax{
    public void faxTask(){
        //perform some faxing task
    }
}