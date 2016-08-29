package com.bpcs.javafx

import javafx.beans.value.ChangeListener
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.ScrollPane
import javafx.scene.control.SplitPane
import javafx.scene.control.TextField
import javafx.scene.control.TitledPane

/**
 * Split window controller to allow for play of more complex controls and
 * containers.
 *
 * Created by wpfeiffe on 8/21/16.
 */
class SplitWindowController
{
    @FXML
    private TitledPane winSplitWindow

    @FXML
    private SplitPane pneSplitPane

    @FXML
    private ScrollPane pneLeftScrollPane

    @FXML
    private ScrollPane pneRightScrollPane

    @FXML
    public void initialize()
    {
        println "In the SplitWindowController.initialize()"

        pneLeftScrollPane.setFitToHeight(true)
        pneLeftScrollPane.setFitToWidth(true)
        pneRightScrollPane.setFitToHeight(true)
        pneRightScrollPane.setFitToWidth(true)
    }
}
