
package layouts;

import javax.swing.JFrame;
//@author sak5680

public class Layouts {

    public static void main(String[] args) {
//        JFrame calcframe = new CalculatorFrame();
//        calcframe.setTitle("Calculator");
//        calcframe.setLocation(200,200);
//        calcframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        calcframe.setVisible(true);
        
        JFrame fontframe = new FontFrame();
        fontframe.setTitle("Font Viewer");
        fontframe.setLocation(200,200);
        fontframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fontframe.setVisible(true);
    }

}
