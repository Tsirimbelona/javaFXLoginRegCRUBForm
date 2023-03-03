/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxloginregcrubform;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author Jean_Nico .T
 */
public class CRUDController implements Initializable {
    
    @FXML
    private TextField _studentNumber;

    @FXML
    private TableColumn<?, ?> crub_col_cours;

    @FXML
    private TableColumn<?, ?> crub_col_fullName;

    @FXML
    private TableColumn<?, ?> crub_col_gender;

    @FXML
    private TableColumn<?, ?> crub_col_studentNumber;

    @FXML
    private TableColumn<?, ?> crub_col_year;

    @FXML
    private Button crud_addBtn;

    @FXML
    private Button crud_clearBtn;

    @FXML
    private ComboBox<?> crud_course;

    @FXML
    private Button crud_deleteBtn;

    @FXML
    private TextField crud_fullName;

    @FXML
    private ComboBox<?> crud_gender;

    @FXML
    private TableView<?> crud_tableView;

    @FXML
    private Button crud_updateBtn;

    @FXML
    private ComboBox<?> crud_year;
    
    
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    
    private Alert alert;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
}

}
