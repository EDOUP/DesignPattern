package frontcontrollerpattern;

public class Dispather {
    private StudentView studentView;
    private HomeView homeView;
    public Dispather(){
        studentView=new StudentView();
        homeView=new HomeView();
    }

    public void dispather(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else{
            homeView.show();
        }
    }
}
