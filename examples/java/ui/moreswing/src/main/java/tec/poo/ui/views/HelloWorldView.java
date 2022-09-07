package tec.poo.ui.views;

import tec.poo.ui.controllers.HelloWorldController;

public class HelloWorldView {

    private HelloWorldController helloWorldController;

    public HelloWorldView(HelloWorldController helloWorldController) {
        this.helloWorldController = helloWorldController;
        //TODO: create swing components and attach the buttons to the respective action
    }

    public void GetHelloWorld() {
        String helloWorldText = this.helloWorldController.GetHelloWorld();
        //TODO: add logic to paint this to a swing component
    }

    public void UpdateHelloWorld(String helloWorldText) {
        //validate 
        boolean isEmpty = helloWorldText == null || helloWorldText.trim().length() == 0;
        if (!isEmpty) {
            this.helloWorldController.UpdateHelloWorld(helloWorldText);
        } else {
            //TODO: call a pop up window with the error.
        }
    }

    public void DisplayHelloWorld() {

    }

}