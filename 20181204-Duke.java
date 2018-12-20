//past paper 2015
//String and Class
   public class HiddenWord{
   private String puzzle;
   public HiddenWord(String puzzle){
      this.puzzle = puzzle;
}
   public String getHind(String guess){
      String hint = "";
      for(int i = 0; i < puzzle.length(); i++){
         if(puzzle.substring(i,i+1).equals(guess.substring(i,i+1))){
            hint = hint+puzzle.substring(i,i+1);
         }
         else if(puzzle.indexOf(guess.substring(i,i+1))!=-1){
            hint= hint + "+";
         }
         else{
            hint+= "*";
         }
      }
      return hint;
   }
         
