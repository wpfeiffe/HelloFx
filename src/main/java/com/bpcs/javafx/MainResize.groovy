package com.bpcs.javafx

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

/**
 * Main to drive Resize
 *
 * Created by wpfeiffe on 8/21/16.
 */
class MainResize extends Application
{
    public static void main(String[] args)
    {

        launch(MainResize.class, args)
    }

    public void start(Stage primaryStage) throws Exception
    {
        URL resourceURL = getClass().getResource("/resize.fxml")
        Parent root = FXMLLoader.load(resourceURL)
        primaryStage.setTitle("Resize Window")
        primaryStage.setScene(new Scene(root))
        primaryStage.show()

    }


}
