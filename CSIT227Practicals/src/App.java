
import javax.print.attribute.TextSyntax;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class App {
    private JPanel pnlMain;
    private JRadioButton rbCustomer;
    private JRadioButton rbClerk;
    private JRadioButton rbManager;
    private JTextField tfName;
    private JTextArea taPersons;
    private JButton btnSave;
    private JTextField tfAge;
    private JTextField tfMonths;
    private JTextField tfSalary;
    private JButton btnClear;
    private JTextField tfLoad;
    private JButton btnLoad;
    private JButton btnSayHi;
    private JButton btnSavePerson;
    private JButton btnLoadPerson;
    private JButton btnReward;

    private List<Person> persons;





    public App() {
        ButtonGroup rb = new ButtonGroup();
        rb.add(rbClerk);
        rb.add(rbCustomer);
        rb.add(rbManager);


        persons = new ArrayList<>();
        // TODO add implementations for all milestones here


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    tfName.setText("");
                    tfAge.setText("");
                    tfSalary.setText("");
                    tfMonths.setText("");
                    tfLoad.setText("");
                    taPersons.setText("");


            }
        });
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {





                    taPersons.setText("Name: " + tfName.getText() + "\n");
                    taPersons.append("Age: " + tfAge.getText() + "\n");
                    if (!rbCustomer.isSelected()) {
                        taPersons.append("Months Worked: " + tfMonths.getText() + "\n");
                        taPersons.append("Salary: " + tfSalary.getText() + "\n");
                    }


            }
        });

        ChangeListener listener1 = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(rbCustomer.isSelected()){
                    tfSalary.setText("");
                    tfMonths.setText("");
                    tfMonths.setEditable(false);
                    tfSalary.setEditable(false);
                } else{
                    tfMonths.setEditable(true);
                    tfSalary.setEditable(true);
                }
            }
        };
        rbCustomer.addChangeListener(listener1);
        rbClerk.addChangeListener(listener1);
        rbManager.addChangeListener(listener1);
    }

    public static void main(String[] args) {
        // add here how to make GUI visible


        JFrame frame = new JFrame("Menu");
        App menu = new App();
        frame.setContentPane(menu.pnlMain);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 500);




    }

    static void giveReward(int n) {

    }
}
