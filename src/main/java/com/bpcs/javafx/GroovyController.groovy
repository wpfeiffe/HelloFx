package com.bpcs.javafx

import javafx.beans.value.ChangeListener
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField

/**
 * Groovy version of my test controller
 * Created by wpfeiffe on 8/11/16.
 */
class GroovyController
{
    @FXML
    private Label lblMessage;

    @FXML
    private Button btnOk;

    @FXML
    private Button btnCancel;

    @FXML
    private TextField fldUserId;

    @FXML
    private PasswordField fldPassword;

    @FXML
    public void initialize()
    {
        fldUserId.focusedProperty().addListener((ChangeListener) { observable, oldvalue, newvalue ->
            focusMessage("User ID", newvalue)
        })
        fldPassword.focusedProperty().addListener((ChangeListener) {observable, oldvalue, newvalue ->
            focusMessage("Password", newvalue)
        })
    }


    private void focusMessage(String fieldName, Boolean hasFocus)
    {
        if (hasFocus)
        {
            System.out.println(fieldName + " field got focus")
        }
        else
        {
            System.out.println(fieldName + " field lost focus")
        }
    }

    public void onOkClicked(ActionEvent actionEvent)
    {
        System.out.println("You clicked OK")
        lblMessage.setText("You clicked OK")
    }

    public void onCancelClicked(ActionEvent actionEvent)
    {
        System.out.println("You clicked Cancel")
        lblMessage.setText("You clicked Cancel")
    }


}

