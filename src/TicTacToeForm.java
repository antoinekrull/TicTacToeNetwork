import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeForm extends JFrame {

    private Container pane;
    private String currentPlayer;
    private JButton [][] board;
    private boolean hasWinner;
    private JMenuBar menuBar;
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

        currentPlayer = "x";
        board = new JButton[3][3];
        hasWinner = false;

        initializeBoard();
        initializeMenuBar();

    }
    private void initializeMenuBar(){
        menuBar = new JMenuBar();
        menu = new JMenu("File");
        newGame = new JMenuItem("New Game");
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetBoard();
            }
        });
        quit = new JMenuItem("Quit");
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(newGame);
        menu.add(quit);
        menuBar.add(menu);
        setJMenuBar(menuBar);

    }
    private void resetBoard(){
        currentPlayer = "x";
        hasWinner = false;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j].setText("");
            }
        }
    }
    private void initializeBoard(){}
    private void togglePlayer(){}
    private void hasWinner(){
        if(board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won.");
            hasWinner = true;
        }
        else if(board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won.");
            hasWinner = true;
        }
        else if(board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)){
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won.");
            hasWinner = true;
        }
    }
}
