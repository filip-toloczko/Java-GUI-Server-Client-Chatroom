import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class startController extends Application {

    Server serverConnection;
    Client clientConnection;

    // Server GUI elements

    @FXML
    private Button clientBtn;

    @FXML
    private Button serverBtn;

    @FXML
    private BorderPane startBorderPane;

    @FXML
    private Text startText;

    @FXML
    private BorderPane serverBorderPane;

    @FXML
    private ListView<String> serverListView;

    // Client GUI elements

    // @FXML
    // private VBox btnVBox;

    // @FXML
    // private BorderPane clientBorderPane;

    // @FXML
    // private ListView<String> clientListLeft;

    // @FXML
    // private ListView<String> clientListMid;

    // @FXML
    // private TextField clientTextField;

    // @FXML
    // private VBox clientTxtVBox;

    // @FXML
    // private Text connectedText;

    // @FXML
    // private VBox connectedVBox;

    // @FXML
    // private Text messageBox;

    // @FXML
    // private Button sendAllBtn;

    // @FXML
    // private Button sendToGroupBtn;

    // @FXML
    // private Button sendToUserBtn;

    // @FXML
    // void clientTxtOnAction(ActionEvent event) {

    // }

    // @FXML
    // void sendAllAction(ActionEvent event) {

    // }

    // @FXML
    // void sendToGroupAction(ActionEvent event) {

    // }

    // @FXML
    // void sendToUserAction(ActionEvent event) {

    // }


    // Start screen choice event handlers

    @FXML
    void clientBtnClick(ActionEvent event) throws IOException {

        Stage clientStage = new Stage();
        System.out.println("created client");
        
        // Read file fxml and draw interface.
        FXMLLoader clientLoader = new FXMLLoader(getClass().getResource("/FXML/clientGUI.fxml"));

        Parent clientRoot = clientLoader.load();
        clientController clientController = clientLoader.getController();
        // Parent root = FXMLLoader.load(getClass().getResource("/FXML/clientGUI.fxml"));

        clientStage.setTitle("Client User Interface");

        // clientListLeft = new ListView<String>();

        clientConnection = new Client(data -> {

            Platform.runLater(() -> {
                System.out.println("New Client started.");
                clientController.getLeftListView().getItems().add(data.toString());
            });

        });

        clientConnection.start();

        Scene clientScene = new Scene(clientRoot, 600,400);
        clientScene.getStylesheets().add("/styles/clientStyle.css");

        clientStage.setScene(clientScene);
        clientStage.show();
    }

    @FXML
    void serverBtnClick(ActionEvent event) throws IOException {

        Stage serverStage = new Stage();
    
        // Read file fxml and draw interface.
        FXMLLoader serverLoader = new FXMLLoader(getClass().getResource("/FXML/serverGUI.fxml"));
        // Parent serverRoot = FXMLLoader.load(getClass().getResource("/FXML/serverGUI.fxml"));
        Parent serverRoot = serverLoader.load();
        serverController serverController = serverLoader.getController();

        // startBorderPane.getScene().setRoot(serverRoot);

        serverStage.setTitle("Server User Interface");

        // serverListView = new ListView<String>();
        // serverListView = (ListView<String>) serverRoot.lookup("#serverListView");

        serverConnection = new Server(data -> {

            Platform.runLater(() -> {

                serverController.getListView().getItems().add(data.toString());

            });

        });
        
        Scene serverScene = new Scene(serverRoot, 600,400);
        serverScene.getStylesheets().add("/styles/serverStyle.css");

        serverStage.setScene(serverScene);
        serverStage.show();
        
        serverBtn.setDisable(true);
        

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    

}