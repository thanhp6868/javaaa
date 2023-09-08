import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.swing.*;

public class form_check_primeNumber extends JFrame {
    private JLabel _label;
    private JTextField _textField;
    private JButton _button;
    private JLabel _labelResult;

    public form_check_primeNumber() {
        setTitle("Kiểm tra số nguyên tố");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        _label = new JLabel("Nhập số n: ");
        _textField = new JTextField(10);
        _button = new JButton("Kiểm tra");
        _labelResult = new JLabelResult("");
        
        _button.addEventListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = _textField.getText();
                try{
                    int a = Integer.parseInt(inputText);
                    if(isPrime(a)) {
                        _labelResult.setText(a + " là số nguyên tố.");
                    }
                    else {
                        _labelResult.setText(a + " không là số nguyên tố.")
                    }
                }catch(NumberFormatException ex){
                    _labelResult.setText("Nhập số nguyên tố hợp lệ")
                }
            }
        })

        add(_label);
        add(_textField);
        add(_button);
        add(_labelResult);
    }

    public static boolean isPrime(int n){
        if(n <= 1)
            return false;
        for(int i = 2; i < n; i++){
            if(n % i == 0) 
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form_check_primeNumber prime = new form_check_primeNumber();
                prime.setVisible(true);
            }
        })
    }
}
