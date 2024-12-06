import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class clientController extends Application {

    @FXML
    private VBox btnVBox;

    @FXML
    private BorderPane clientBorderPane;

    @FXML
    private ListView<String> clientListLeft;

    @FXML
    private ListView<String> clientListMid;

    @FXML
    private TextField clientTextField;

    @FXML
    private VBox clientTxtVBox;

    @FXML
    private Text connectedText;

    @FXML
    private VBox connectedVBox;

    @FXML
    private Text messageBox;

    @FXML
    private Button sendAllBtn;

    @FXML
    private Button sendToGroupBtn;

    @FXML
    private Button sendToUserBtn;

    @FXML
    void messageBoxOnAction(ActionEvent event) {

    }

    @FXML
    void sendAllAction(ActionEvent event) {

    }

    @FXML
    void sendToGroupAction(ActionEvent event) {

    }

    @FXML
    void sendToUserAction(ActionEvent event) {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    // This method will return the left list view 
    public ListView <String> getLeftListView()
    {
        return this.clientListLeft;
    }

}
