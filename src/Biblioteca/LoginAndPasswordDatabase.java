package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: isha
 * Date: 21/7/12
 * Time: 7:21 PM
 * To change this template use File | Settings | File Templates.
 */
    public class LoginAndPasswordDatabase {

    String[][] Database = new String[5][2];

    public LoginAndPasswordDatabase(){
        for(int i=0;i<5;i++){
            this.Database[i][0] = "111-111"+(i+1);
            this.Database[i][1] = "abc";
        }
}
    // TODO - why need main method here ?
   public static void main(String args[]){LoginAndPasswordDatabase o1 = new LoginAndPasswordDatabase();
}
}