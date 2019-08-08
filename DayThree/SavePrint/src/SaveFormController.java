import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SaveFormController {
    public TextField txtID;
    public TextField txtname;
    public TextField txtAddress;
    public TextField txtCus;
    public TextField txtSrcId;
    public Label lblName;
    public Label lblAddress;
    Customer c;
    Customer[] customer = new Customer[5];

    int cusNo = 0;

    public void btnSave_onAction(ActionEvent actionEvent) {

        int id = Integer.parseInt(txtID.getText());
        String name = txtname.getText();
        String address = txtAddress.getText();

        c = new Customer(id, name, address);


        for (Customer customer : customer) {
            if (customer != null) {
                if (customer.id == id) {
                    System.out.println("Duplicated");
                    return;
                }
            }
        }


        customer[cusNo] = new Customer(id, name, address);


        txtID.clear();
        txtname.clear();
        txtAddress.clear();
        cusNo++;
        txtCus.setText(String.valueOf(cusNo));

    }

    public void btnPrint_onAction(ActionEvent actionEvent) {

        for (int i = 0; i < cusNo; i++) {

            System.out.println(customer[i].id);
            System.out.println(customer[i].name);
            System.out.println(customer[i].address);

        }


    }

    public void btnSch_onAction(ActionEvent actionEvent) {
        int sid = Integer.parseInt(txtSrcId.getText());
        for (Customer customer : customer) {
            if (customer != null && customer.id == sid) {
                lblName.setText(customer.name);
                lblAddress.setText(customer.address);
                break;
            } else {
                lblAddress.setText("No matching data");
                lblName.setText("No matching data");
                break;
            }

        }

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
