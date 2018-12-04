//past paper 2015
//String and Class
   public class HiddenWord{
   private String puzzle;
   public HiddenWord(){
}
   public String getHind(String hint,String hiddenword){
   String c=new String(hint.length());
   for(i=0;i<hint.length();i++){
   if(puzzle.substring(i,i+1).compareto(hint.substring(i,i+1))!=-1){
   c.substring(i,i+1)=hint.substring(i,i+1);
}
      if(puzzle.substring(i,i+1).compareto(hiddenword)=-1){
   hint.substring(i,i+1)="-";
}
   if(puzzle.substring(i,i+1).compareto(hint.compareTo(puzzle)!=-1){
   hint.substring(i,i+1)="+";
}
   }
   return c;





}
