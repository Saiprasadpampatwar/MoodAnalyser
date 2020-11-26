public class MoodAnalyser {
    String massage;
    public  MoodAnalyser(){
        this.massage = massage;
    }
    public  MoodAnalyser(String massage){
        this.massage = massage;
    }
    public String analyseMood() throws MoodAnalysisException {
        try {
            if(massage.length() == 0){
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please Enter NonEmpty mood");
            }
            if (massage.contains(("sad"))){
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }catch (NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter valid mood");
        }

    }



}
