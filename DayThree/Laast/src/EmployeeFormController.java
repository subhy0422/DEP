import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EmployeeFormController {
    public TextField txtEid;
    public TextField txtESalary;
    public TextField txtEName;
    public Label lbl_eId1;
    public TextField txtId;
    public TextField txtname;
    public TextField txtSalary;
    public Label lbl_enme1;
    public Label lbl_esly1;

    public Employee[] employee = new Employee[5];
    int ecount = 0;

    public void btnSave_onAction(ActionEvent actionEvent) {
        int id = Integer.parseInt(txtId.getText());
        String name = txtname.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        employee[ecount] = new Employee(id, name, salary);
        ecount++;
    }

    public void btnAss_onAction(ActionEvent actionEvent) {
    }

    public void btnMin_onAction(ActionEvent actionEvent) {
        int id = Integer.parseInt(txtId.getText());
        String name = txtname.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        employee[ecount] = new Employee(id, name, salary);
        int a = 0;
        double min = employee[0].Salary;
        for (int i = 1; i < ecount; i++) {
            if (employee[i].Salary < min) {
                employee[a] = employee[i];
                min = employee[i].Salary;

            }
        }

        lbl_eId1.setText(String.valueOf(employee[a].id));
        lbl_enme1.setText(String.valueOf(employee[a].Name));
        lbl_esly1.setText(String.valueOf(employee[a].Salary));


        System.out.print(employee[a].Salary);

    }

    public void btnMax_onAction(ActionEvent actionEvent) {
        int id = Integer.parseInt(txtId.getText());
        String name = txtname.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        employee[ecount] = new Employee(id, name, salary);

        double max = employee[0].Salary;
        int a = 0;
        for (int i = 1; i < ecount; i++) {
            if (employee[i].Salary > max) {
                employee[a] = employee[i];

            }
        }
        lbl_eId1.setText(String.valueOf(employee[a].id));
        lbl_enme1.setText(String.valueOf(employee[a].Name));
        lbl_esly1.setText(String.valueOf(employee[a].Salary));

    }

    public void btnPAll_onAction(ActionEvent actionEvent) {
        for (int i = 0; i < ecount; i++) {
            System.out.print(employee[i].id);
            System.out.print(" " + employee[i].Name);
            System.out.print(" " + employee[i].Salary);
            System.out.println("");
        }

    }

    public void btnDes_onAction(ActionEvent actionEvent) {
    }

    public void btnSrh_onAction(ActionEvent actionEvent) {
        int a = 0;
        int searchId = Integer.parseInt(txtEid.getText());
        for (Employee employee : employee) {
            if (employee.id == searchId) {

                txtEName.setText(String.valueOf(employee.Name));
                txtESalary.setText(String.valueOf(employee.Salary));

                break;
            }
        }
    }

    public void btnUpd_onAction(ActionEvent actionEvent) {

        int searchId = Integer.parseInt(txtEid.getText());
        int id = Integer.parseInt(txtEid.getText());
        String name = txtEName.getText();
        double salary = Double.parseDouble(txtESalary.getText());


        System.out.println(employee.length);
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].id);
            if (employee[i].id == searchId) {

                employee[i] = new Employee(id, name, salary);
                break;
            }

        }

    }

    class Employee {
        int id;
        String Name;
        double Salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            Name = name;
            Salary = salary;
        }
    }
}
