//This presentation does not conform to the Dependency Inversion Principle
//This is not good for use if peradventure we want to use a Samsung Phone
public class DIPDemo {
    void acceptCall(){
        //Do something
    }
    void declineCall(){
        //Do something
    }
}

class CarHandsFree {
    DIPDemo phone;
    void pairWithPhone(DIPDemo phone){
        this.phone = phone;
    }
    void attendCall(){
        this.phone.acceptCall();
    }
    void declineCall(){
        this.phone.declineCall();

    }
}

//To make any phone that has bluetooth functionality to be able to connect to a car hands-free,
//each one needs to depend on a common abstraction as shown below

//public interface BluetoothCapabalePhone {
//    void acceptCall();
//    void declineCall();
//}
//
//public class ApplePhone implements BluetoothCapabalePhone {
//    void acceptCall(){
//        //Do something
//    }
//    void declineCall(){
//        //Do something
//    }
//}
//
//public class SamsungPhone implements BluetoothCapabalePhone {
//    void acceptCall(){
//        //Do something
//    }
//    void declineCall(){
//        //Do something
//    }
//}
//
//public class HtcPhone implements BluetoothCapabalePhone {
//    void acceptCall(){
//        //Do something
//    }
//    void declineCall(){
//        //Do something
//    }
//}
//
//public class CarHandsFree {
//    BluetoothCapabalePhone phone;
//    void pairWithPhone(BluetoothCapabalePhone phone){
//        this.phone = phone;
//    }
//    void attendCall(){
//        this.phone.acceptCall();
//    }
//    void declineCall(){
//        this.phone.declineCall();
//    }
//}