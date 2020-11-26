public class MoodAnalyser {
    String massage;
    public  MoodAnalyser(){
        this.massage = massage;
    }
    public  MoodAnalyser(String massage){
        this.massage = massage;
    }
    public String analyseMood() {
        try {
            if (massage.contains(("sad"))){
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }catch (NullPointerException e){
            return "HAPPY";
        }

    }



}
