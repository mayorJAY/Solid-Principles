//This presentation does not conform to the Open and Closed Principle.If a new type of task is added, it will need editing and refactoring
public class OCPDemo {
    public void printTask(){
        //perform some printing task
    }
    public void scanTask(){
        //perform some scanning task
    }
    public void faxTask(){
        //perform some faxing task
    }
}
//This will also have to be edited if there is the need for extension
class printerTasks extends OCPDemo{
    @Override
    public void printTask() {
        super.printTask();
    }

    @Override
    public void scanTask() {
        super.scanTask();
    }

    @Override
    public void faxTask() {
        super.faxTask();
    }
}


//If I want to add a photocopyTask() to the task, it should be added without tampering with the previous code
//First of all the tasks will be put in different classes
//Then I create a different class from which they inherit a functionality
class performTask{
    void doJob(){
        System.out.println("Job is done");
    }
}

class toPriint extends performTask{
    public void printTask(){
        //perform some printing task
        doJob();
    }
}

class toScaan extends performTask{
    public void scanTask(){
        //perform some scanning task
        doJob();
    }
}

class toFaax extends performTask{
    public void faxTask(){
        //perform some faxing task
        doJob();
    }
}

class toPhotocopy extends performTask{
    public void photoTask(){
        //perform some photocopy task
        doJob();
    }
}