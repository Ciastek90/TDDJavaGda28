public class Game {
    private final Controller controller;

    public Game(Controller controller){
        this.controller = controller;
    }

    public void update(){
        if(controller.getIndexPressedButton()==1){
            System.out.println("w lewo");
        } else if(controller.getIndexPressedButton() == 2){
            System.out.println("w prawo");
        }
    }
}
