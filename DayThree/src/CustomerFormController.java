import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class CustomerFormController {
    public TextField txtName;
    public TextField txtId;
    public TextField txtAddress;
    public TextField txtShwAdres;
    public TextField txtShwName;
    public TextField txtSearchId;

    Customer[] customers = new Customer[0];

    public void btnNew_onAction(ActionEvent actionEvent) {

    }

    public void btnSve_onAction(ActionEvent actionEvent) {
        int id = Integer.parseInt(txtId.getText());
        String name = txtName.getText();
        String address = txtAddress.getText();
        Customer customer = new Customer(id, name, address);
    }

    public void btnSch_onAction(ActionEvent actionEvent) {

    }

    class Customer {
        int id;
        String name;
        String address;

        public Customer(int id, String name, String address) {
            this.id = id;
            this.name = name;
            this.address = address;

        }
    }
}
