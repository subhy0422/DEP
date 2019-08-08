import javafx.event.ActionEvent;
import javafx.scene.control.TextField;


public class CustomerFormComntroller {
    public TextField txtId;
    public TextField txtNme;
    public TextField txtAds;
    public TextField txtSid;
    public TextField txtSnm;
    public TextField txtSad;

    int size = 1;


    public void btnSrch_onAction(ActionEvent actionEvent) {
    }

    public void btnNew_onAction(ActionEvent actionEvent) {
        txtId.clear();
        txtNme.clear();
        txtAds.clear();
        size++;

        System.out.println(size);
    }


    class Customer {
        int id;
        String name;
        String adress;


        public Customer(int id, String name, String adress) {
            this.id = Integer.parseInt(txtId.getText());
            this.name = txtNme.getText();
            this.adress = txtAds.getText();
        }

        public void btnSve_onAction(ActionEvent actionEvent) {


        }


    }
}
