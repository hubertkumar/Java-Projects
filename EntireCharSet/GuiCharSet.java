import javax.swing.*;
import java.lang.StringBuilder;

class GuiCharSet{

    public static void main(String args[]){
    char unicodeChar, firstChar = 0b0000_0000_0000_0000, lastChar = 0b1111_1111_1111_1111;
    char spl01 = 0b0000_1111_0000_0000, spl02 = 0b0000_0011_0000_0000;

    System.out.println("This class prints evrey single possible character in the UniCode Charset");
    System.out.print("The bit column values are: ");
    System.out.println("32768|16384|8192|4096|2048|1024|512|256|128|64|32|16|8|4|2|1");
    
    JFrame frame = new JFrame("Entire Characater Set");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,300);

//       unicodeChar = firstChar;
       unicodeChar = spl02;
       String s=Character.toString(unicodeChar);
       //JButton button = new JButton(s);
       JButton button = new JButton("????? ???????");
       button.setFont(button.getFont().deriveFont(100.0f));
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);

/*
       JLabel label = new JLabel("CharSetLabel");
       label.setText("<html>This is a<br>multline label!<br> Try it yourself!</html>");
       frame.add(label, JLabel.BOTTOM);
*/
/*
       StringBuilder builder = new StringBuilder(answerKey.getText());
       //builder.setCharAt(pos, ch);
       builder.setCharAt(pos, unicodeChar);
       answerKey.setText(builder.toString());
*/
/*
       unicodeChar = firstChar;
       //for(int i=0; i<=lastChar; i++){
       for(int i=0; i<=256; i++){
          if(i == 0) System.out.println("i=" + i);
          //if((i % 16) != 0) System.out.print("i=" + i);
          //System.out.print(unicodeChar++ + "; ");
          str.concat(unicodeChar);
          label.setText(str);
    }
*/
    }
}

