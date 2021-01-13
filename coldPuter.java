import java.util.*;
class coldPuter{
  public static void main(String[] args){
  Scanner kbd = new Scanner(System.in);
  int n = kbd.nextInt();
  int cnt = 0,t;
  if(n >= 1 && n <= 100){
    for(int i = 0;i < n;i++){
      t = kbd.nextInt();
      if(t < 0)
        cnt++;
    }
   System.out.println(cnt);
  } 
 }
}