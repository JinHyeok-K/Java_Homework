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
 
        setTitle("���� Ű Ȯ��");
        setSize(200, 200);
        setVisible(true);
 
        Panel p = new Panel();
        List l = new List(5); // List�� focus�� �ֱ�����.
        p.add(l);
        add(p);
 
        l.addKeyListener(new KeyListener() { // List�� �׼Ǹ����ʸ� ����.
 
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar()+" keyTyped key");
                
                //shift�� ���� ���ȴ��� Ȯ���ϴ� ���
                if((e.getModifiers() & 1) != 0){ // 1�� shift, 2�� CtrlŰ �Դϴ�.
                    //�̸� & �������Ͽ� ������ 0�̾ƴ� ���ڸ� ��ȯ������  �ش� Ű�� ������ Ȯ�� �� �� �ֽ��ϴ�.
                    System.out.printf("shift�� �������ϴ�.\n");
                }else
                {
                    System.out.printf("shift�� ������ �ʾҽ��ϴ�.\n");
                }
            }
 
            @Override
            public void keyReleased(KeyEvent e) {
                //System.out.println(e.getKeyCode()+" keyReleased key2");
                System.out.println(e.getKeyChar()+" keyReleased key");
            }
 
            // ��� Ű�� ���������� ��ҹ��� ������ ���Ѵ�.
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
 