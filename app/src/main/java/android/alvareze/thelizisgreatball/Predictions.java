package android.alvareze.thelizisgreatball;

public class Predictions {

    private static Predictions predictions;
    private String[] answers;

    private Predictions(){
    //this part of the code will execute the code below on top of the app//
        answers = new String[]{
          "your wishes will come true.",
          "your wishes wont come true."
        };
    }
    ////
    public static Predictions get() {
        if (predictions == null) {
            predictions = new Predictions();
        }
        return predictions;
    }

    public String getPrediction() {
        return answers[1];

    }
}


