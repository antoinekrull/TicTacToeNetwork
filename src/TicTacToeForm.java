import javax.swing.*;
import java.awt.*;

public class TicTacToeForm extends JFrame {

    private Container pane;
    private String currentPlayer;
    private JButton [][] board;
    private boolean hasWinner;
    private JMenuBar menueBar;
    private JMenu menu;
    private JMenuItem quit;
    private JMenuItem newGame;

    public TicTacToeForm(){
        super();
        pane = getContentPane();
        pane.setLayout(new GridLayout(3,3));
        setTitle("TicTacToe");
        setSize(500,500);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

    }
    private void initializeMenuBar(){}
    private void resetBoard(){}
    private void initializeBoard(){}
    private void togglePlayer(){}
    private void hasWinner(){}
}
