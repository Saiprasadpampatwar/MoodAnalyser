public class MoodAnalyser {
    String massage;
    public  MoodAnalyser(){
        this.massage = massage;
    }
    public  MoodAnalyser(String massage){
        this.massage = massage;
    }
    public String analyseMood() {
        if (massage.contains(("sad"))){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }



}
