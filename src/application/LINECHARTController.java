package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LINECHARTController implements Initializable{

    @FXML
    private Button backbutt;

    @FXML
    private LineChart<String, Number> chart; 
    Main m = new Main();
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.getData().add(new XYChart.Data<>("1", 2000));
        series1.getData().add(new XYChart.Data<>("2", 9000));
        series1.getData().add(new XYChart.Data<>("3", 2000));
        series1.getData().add(new XYChart.Data<>("4", 1000));
        series1.getData().add(new XYChart.Data<>("5", 500));
        series1.getData().add(new XYChart.Data<>("6", 30));

        // Add the series to the existing chart
        chart.getData().add(series1);
    }


    

    @FXML
    void backtodashboard(ActionEvent event) throws IOException {
    	System.out.println("Register Parcel link clicked");
    	Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	m.changeScene(s, "resources/fxml/Final.fxml");

    }

}
