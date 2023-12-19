package InterfacesLearning;

class Phone{
    public void call(){
        System.out.println("Phone Call");
    }
    public void sms(){
        System.out.println("Phone Send SMS");
    }
}

interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer{
    public void videoCall(){
        System.out.println("Smart phone Video Calling");
    }
        public void click(){
        System.out.println("Smart phone Clicking Photo");
    }
    public void record(){
        System.out.println("Smart phone Recording video");
    }
    public void play(){
        System.out.println("Smart Phone playing music");
    }
    public void stop(){
        System.out.println("Smart Phone Stop music");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        // SmartPhone sp = new SmartPhone(); // access of related method.. direct class reference;
        // sp.call();
        // sp.play();
        // sp.stop();

        // Phone p = new SmartPhone();
        // p.sms();
        // p.call(); // reference of Phone only method inside smartphone class

        ICamera Ic = new SmartPhone();
        Ic.click();
        Ic.record();
    }
}
