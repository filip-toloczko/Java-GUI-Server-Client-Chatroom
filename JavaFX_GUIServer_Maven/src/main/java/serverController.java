import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class serverController extends Application {

    @FXML
    private BorderPane serverBorderPane;

    @FXML
    private ListView<String> serverListView;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    public ListView<String> getListView()
    {
        return this.serverListView;
    }

}