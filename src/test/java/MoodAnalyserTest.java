import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void happyMoods() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("this is happy massage");
        String mood = moodAnalyser.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }

    @Test
    public void testMoodAnalysis() throws MoodAnalysisException {
         MoodAnalyser moodAnalyser = new MoodAnalyser("this is sad massage");
         String mood = moodAnalyser.analyseMood();
         System.out.println(mood);
         Assert.assertThat(mood, CoreMatchers.is("SAD"));
    
    }

    @Test
    public void givenNullShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException exptionRule = ExpectedException.none();
            exptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenNullShouldThroughException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(MoodAnalysisException.class);
            moodAnalyser.analyseMood();
        }catch (MoodAnalysisException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmptyShouldThroughException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(MoodAnalysisException.class);
            moodAnalyser.analyseMood();
        }catch (MoodAnalysisException e){
            e.printStackTrace();
        }
    }
}
