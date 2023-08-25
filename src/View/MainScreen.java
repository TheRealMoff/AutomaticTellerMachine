package View;

import Controller.databaseConnector;
import Model.Transactions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {
    public JRadioButton radioButtonP100;
    public JRadioButton radioButtonP200;
    public JRadioButton radioButtonP300;
    public JRadioButton radioButtonP500;
    public JRadioButton radioButtonP1000;
    public JFormattedTextField DepositTextField1;
    public JButton bConfirmDeposit;
    public JButton bWithdraw;
    public JLabel JPRGBANKLabel;
    public JLabel depositLabel;
    public JLabel cashAmountPLabel;
    public JButton bPrintStatement;
    public JButton bReset;
    public JButton bGetBalance;
    public JPanel JContentPane;
    public JPanel ContentPane;
    public JLabel SELECTAMOUNTLabel;
    public JTextField textFieldOwnAmount;
    public JButton bLogOut;
    public JLabel ownAmountLabel;
    public JTextField textFieldPin;
    public JTextField textFieldBalance;
    public JLabel accountNumberLabel;
    public JLabel balanceLabel;
    public JTextPane TextPaneStatement;
    public JLabel STATEMENTLabel;
    public JTextField textFieldAvail;
    public JLabel availableLabel;

    public MainScreen(){
        add(ContentPane);

        bWithdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer.parseInt(textFieldPin.getText());
                Integer.parseInt(textFieldOwnAmount.getText());
                Integer.parseInt(textFieldAvail.getText());

                System.out.println();


                databaseConnector databaseConnector = new databaseConnector();
                databaseConnector.withdrawal();
                databaseConnector.closeDatabaseConnection();


            }
        });
        bLogOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WelcomeScreen welcomeScreen=new WelcomeScreen();
                welcomeScreen.setVisible(true);
                welcomeScreen.setSize(350,350);
                dispose();
            }
        });
        bPrintStatement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String transactionsid = TextPaneStatement.getText();
                String date = TextPaneStatement.getText();
                String name = TextPaneStatement.getText();
                Integer accountNo = Integer.parseInt(TextPaneStatement.getText());
                Integer balance = Integer.parseInt(TextPaneStatement.getText());

                Transactions transactions = new Transactions(transactionsid,date,name,accountNo,balance);
                databaseConnector databaseConnector = new databaseConnector();
                databaseConnector.getAllTransactions(transactions);
                databaseConnector.closeDatabaseConnection();


            }
        });
    }


}
