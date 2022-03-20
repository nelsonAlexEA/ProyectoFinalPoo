/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author gvalarezo
 */
public class FrmBusquedaController implements Initializable {
    @FXML  
    private GridPane grdBusqueda;
    
    @FXML
    private TextField txtBuscar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            

            llenar_grid();                

            // TODO
        } catch (Exception ex) {
            Logger.getLogger(FrmBusquedaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    public void getHeroe(ActionEvent actionEvent){
        try {
            grdBusqueda.getChildren().clear();
            llenar_grid();                

        } catch (Exception ex) {
            Logger.getLogger(FrmBusquedaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void llenar_grid() throws MalformedURLException{
        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("ironman")) {
            URI uri1 = Paths.get("src/resource/ironman.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 0, 0);

        }
        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("spiderman")) {
            URI uri1 = Paths.get("src/resource/spiderman.jpeg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 1, 0);
        }            
        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("superman")) {
            URI uri1 = Paths.get("src/resource/superman.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 2, 0);

        }      

        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("batman")) {
            URI uri1 = Paths.get("src/resource/batman.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 3, 0);

        }
        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("aquaman")) {
            URI uri1 = Paths.get("src/resource/aquaman.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 4, 0);
        }            
        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("flash")) {
            URI uri1 = Paths.get("src/resource/flash.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 0, 1);

        }            

        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("thor")) {
            URI uri1 = Paths.get("src/resource/thor.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 1, 1);

        }
        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("hulk")) {
            URI uri1 = Paths.get("src/resource/hulk.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 2, 1);
        }            
        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("cyborg")) {
            URI uri1 = Paths.get("src/resource/cyborg.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 3, 1);

        }            


        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("deadpool")) {
            URI uri1 = Paths.get("src/resource/deadpool.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 4, 1);

        }
        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("tormenta")) {
            URI uri1 = Paths.get("src/resource/tormenta.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 0, 2);
        }            
        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("ciclope")) {
            URI uri1 = Paths.get("src/resource/ciclope.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 1, 2);

        }   

        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("elektra")) {
            URI uri1 = Paths.get("src/resource/elektra.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 2, 2);

        }
        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("mercurio")) {
            URI uri1 = Paths.get("src/resource/mercurio.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 3, 2);
        }            
        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("iceman")) {
            URI uri1 = Paths.get("src/resource/iceman.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 4, 2);

        }   

        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("falcon")) {
            URI uri1 = Paths.get("src/resource/falcon.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 0, 3);
        }            
        if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("daredevil")) {
            URI uri1 = Paths.get("src/resource/daredevil.jpg").toAbsolutePath().toUri();
            Image img1 = new Image(uri1.toURL().toString());                
            ImageView imgv1 = new ImageView(img1);
            imgv1.setFitHeight(100);
            imgv1.setFitWidth(100);
            grdBusqueda.add(imgv1, 1, 3);
        }
    }

}
