

public class HangMan{
  private String mAnswer;
  private int mAttempts;
  private String mDashed;
  private boolean mGameFinished;
  private String mPastGuesses;

  public HangMan(String answer,int attempts){
    mAnswer = answer;
    mAttempts = attempts;
    mDashed = mAnswer.replaceAll("[a-zA-Z]","-");
    mGameFinished = false;
    mPastGuesses = "";
  }

  public String guess(char guess){
    boolean found = false;
    if(mPastGuesses.contains(Character.toString(guess))){
      return "You Already Guessed That";
    }
    mPastGuesses = mPastGuesses.concat(Character.toString(guess));
    char[] answerArray = mAnswer.toCharArray();
    StringBuilder str = new StringBuilder(mDashed);

    for (int i = 0; i < answerArray.length; i++) {
      if (guess == answerArray[i]) {
        found = true;
        str.setCharAt(i,guess);
      }
    }
    if(!found){
      mAttempts--;
      if(mAttempts==0){
        mGameFinished= true;
        return "You lose";
      }
      return "WRONG! You have " + mAttempts + " left";
    }
    mDashed = str.toString();
    if(!mAnswer.equals(mDashed)){
      return mDashed;
    }else{
      mGameFinished= true;
      return mDashed+"\nYou Win";
    }
  }

  public boolean isFinished(){
    return mGameFinished;
  }

  public String getDashed(){
    return mDashed;
  }


  public String getAnswer(){
    return mAnswer;
  }

  public String getPastGuesses(){
    return mPastGuesses;
  }

  public int getAttemps(){
    return mAttempts;
  }

}
