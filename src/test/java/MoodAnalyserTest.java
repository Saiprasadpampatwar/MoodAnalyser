import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void happyMoods() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("this is happy massage");
        String mood = moodAnalyser.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void testMoodAnalysis() {
         MoodAnalyser moodAnalyser = new MoodAnalyser("this is sad massage");
         String mood = moodAnalyser.analyseMood();
         System.out.println(mood);
         Assert.assertThat(mood, CoreMatchers.is("SAD"));
    
    }
}
