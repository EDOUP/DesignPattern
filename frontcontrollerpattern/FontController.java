package frontcontrollerpattern;

public class FontController {
    private Dispather dispather;
    public FontController(){
        dispather=new Dispather();
    }
    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully.");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page requested:"+request);
    }

    public void dispatherRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行校验
        if(isAuthenticUser()){
            dispather.dispather(request);
        }
    }
}
