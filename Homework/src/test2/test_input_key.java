package test2;




import java.awt.List;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
 
public class test_input_key extends JFrame {
 
    public test_input_key() {
 
        setTitle("눌린 키 확인");
        setSize(200, 200);
        setVisible(true);
 
        Panel p = new Panel();
        List l = new List(5); // List에 focus를 주기위함.
        p.add(l);
        add(p);
 
        l.addKeyListener(new KeyListener() { // List에 액션리스너를 달음.
 
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar()+" keyTyped key");
                
                //shift가 같이 눌렸는지 확인하는 방법
                if((e.getModifiers() & 1) != 0){ // 1은 shift, 2는 Ctrl키 입니다.
                    //이를 & 연산을하여 같으면 0이아닌 숫자를 반환함으로  해당 키가 눌림을 확인 할 수 있습니다.
                    System.out.printf("shift를 눌렀습니다.\n");
                }else
                {
                    System.out.printf("shift를 누르지 않았습니다.\n");
                }
            }
 
            @Override
            public void keyReleased(KeyEvent e) {
                //System.out.println(e.getKeyCode()+" keyReleased key2");
                System.out.println(e.getKeyChar()+" keyReleased key");
            }
 
            // 모든 키에 반응하지만 대소문자 구분을 못한다.
            public void keyPressed(KeyEvent e) {
                //System.out.println(e.getKeyCode()+" preesed key2");
                System.out.println(e.getKeyChar()+" preesed key");
            }
        });
 
    }
 
    public static void main(String[] args) {
        new test_input_key();
    }
 
}
 