package com.bpcs.javafx

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage


/**
 * Entry point to test the various FXML files using args
 */
public class MainHelloFx extends Application
{
    static String fxmlFileBase = "sample"

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        URL resourceURL = getClass().getResource("/" + fxmlFileBase + ".fxml")
        Parent root = FXMLLoader.load(resourceURL)
        primaryStage.setTitle("Hello JavaFX: " + fxmlFileBase + ".fxml")
//        primaryStage.setScene(new Scene(root, 300, 275))
        primaryStage.setScene(new Scene(root))
        primaryStage.show()
    }


    public static void main(String[] args)
    {
        if (args.length > 0)
        {
            fxmlFileBase = args[0]
        }
        launch(MainHelloFx.class, args)
    }
}
