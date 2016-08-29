package com.bpcs.javafx

import javafx.beans.value.ChangeListener
import javafx.event.ActionEvent

//import javafx.beans.value.ChangeListener
//import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label

//import javafx.scene.control.Button
//import javafx.scene.control.Label
//import javafx.scene.control.PasswordField
import javafx.scene.control.ScrollPane
import javafx.scene.control.TextField

//import javafx.scene.control.TextField
import javafx.scene.control.TitledPane
import javafx.scene.layout.AnchorPane

/**
 * Controller for resize test window
 *
 * Created by wpfeiffe on 8/26/16.
 */
class ResizeController
{
    @FXML
    TitledPane paneMain

    @FXML
    AnchorPane apnMain

    @FXML
    TextField txtValue

    @FXML
    Button btnShow

    @FXML
    Label lblValue

    void initialize()
    {
        txtValue.focusedProperty().addListener((ChangeListener){ observable, oldvalude, newvalue ->
            lblValue.setText("<retype value>")
        })
    }

    public void onShowClicked(ActionEvent actionEvent)
    {
        lblValue.setText(txtValue.getText())
    }
}
