class Phone{
     public void call(){
	System.out.println("Phone call");
     }
     public void SMS(){
	System.out.println("Sending Messages");
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
class SPhone extends Phone implements ICamera,IMusicPlayer{
     public void click(){
	System.out.println("Photo is  clicked");
     }
     public void record(){
	System.out.println("Photos are stored");
     }
     public void play(){
	System.out.println("music is playing");
     }
     public void stop(){
	System.out.println("Music stops playing");
     }
     public void Videocall(){
	System.out.println("Video Call enables");
     }
}
class SmartPhone {
	public static void main(String args[]){
	     SPhone s=new SPhone();
		s.click();
		s.play();
		s.call();
		s.Videocall();
    }
}

/*
Photo is  clicked
music is playing
Phone call
Video Call enables
*/