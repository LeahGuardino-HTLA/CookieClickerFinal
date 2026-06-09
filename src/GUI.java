import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame frame; //It's a window
    JPanel panel; //A rectangular region inside
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JLabel label;
    JLabel cost1;
    JLabel cost2;
    JLabel cost3;
    JLabel cost4;
    JLabel cost5;
    JLabel cost6;
    JLabel cost7;
    JLabel cost8;
    JLabel cost9;
    JLabel cost10;
    JLabel cost11;

    JButton baflamButton;
    JButton upgradeButton1;
    JButton upgradeButton2;
    JButton upgradeButton3;
    JButton upgradeButton4;
    JButton upgradeButton5;
    JButton upgradeButton6;
    JButton upgradeButton7;
    JButton upgradeButton8;
    JButton upgradeButton9;
    JButton upgradeButton10;
    JButton upgradeButton11;

    int counter = 0;
    Game baflams;
    ActionListener guiUpdate;
    Timer updateTimer;


    public GUI() {
        this.baflams = new Game();
        frame = new JFrame();
        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());



        label = new JLabel("No baflams brotato");
        cost1 = new JLabel("UPGRADE 1 COST: " + baflams.upgrade1Cost);
        cost2 = new JLabel("UPGRADE 2 COST: " + baflams.upgrade2Cost);
        cost3 = new JLabel("UPGRADE 3 COST: " + baflams.upgrade3Cost);
        cost4 = new JLabel("UPGRADE 4 COST: " + baflams.upgrade4Cost);
        cost5 = new JLabel("UPGRADE 5 COST: " + baflams.upgrade5Cost);
        cost6 = new JLabel("UPGRADE 6 COST: " + baflams.upgrade6Cost);
        cost7 = new JLabel("UPGRADE 7 COST: " + baflams.upgrade7Cost);
        cost8 = new JLabel("UPGRADE 8 COST: " + baflams.upgrade8Cost);
        cost9 = new JLabel("UPGRADE 9 COST: " + baflams.upgrade9Cost);
        cost10 = new JLabel("UPGRADE 10 COST: " + baflams.upgrade10Cost);
        cost11 = new JLabel("UPGRADE 11 COST: " + baflams.upgrade11Cost);


        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial",Font.BOLD,24));

        topPanel.add(label, BorderLayout.NORTH);
        topPanel.add(baflamButton, BorderLayout.CENTER);




        JPanel upgradesPanel = new JPanel();
        upgradesPanel.setLayout(new GridLayout(11,2,10,10));
        upgradesPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));



        //baflamButton = new JButton(new ImageIcon("C:\\Users\\LeahGuardino\\Desktop\\Farts.png"));


        baflamButton = new JButton(new ImageIcon("yo"));
        upgradeButton1 = new JButton("PLUS 1");
        upgradeButton2 = new JButton("LOCKED IN");
        upgradeButton3 = new JButton("PLUS 5");
        upgradeButton4 = new JButton("PLUS 20");
        upgradeButton5 = new JButton("PLUS 50");
        upgradeButton6 = new JButton("PLUS 80");
        upgradeButton7 = new JButton("PLUS 120");
        upgradeButton8 = new JButton("PLUS 200");
        upgradeButton9 = new JButton("PLUS 250");
        upgradeButton10 = new JButton("PLUS 300");
        upgradeButton11 = new JButton("PLUS 500");

        baflamButton.setPreferredSize(new Dimension(200,200));

        baflamButton.addActionListener(this);

        upgradeButton1.addActionListener(e -> {
            baflams.buyUpgrade1();
        });
        upgradeButton2.addActionListener(e -> {
            baflams.buyUpgrade2();
        });
        upgradeButton3.addActionListener(e -> {
                    baflams.buyUpgrade3();
                });
        upgradeButton4.addActionListener(e -> {
            baflams.buyUpgrade4();
        });
        upgradeButton5.addActionListener(e -> {
            baflams.buyUpgrade5();
        });
        upgradeButton6.addActionListener(e -> {
            baflams.buyUpgrade6();
        });
        upgradeButton7.addActionListener(e -> {
            baflams.buyUpgrade7();
        });
        upgradeButton8.addActionListener(e -> {
            baflams.buyUpgrade8();
        });
        upgradeButton9.addActionListener(e -> {
            baflams.buyUpgrade9();
        });
        upgradeButton10.addActionListener(e -> {
            baflams.buyUpgrade10();
        });
        upgradeButton11.addActionListener(e -> {
                    baflams.buyUpgrade11();
        });


            guiUpdate = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    label.setText("Baflams: " + baflams.baflamCounter); //only piece of code that does anything, everything else yaps
                    cost1.setText("UPGRADE COST: " + baflams.upgrade1Cost);

                    cost1.setHorizontalAlignment(JLabel.CENTER);

                    cost2.setText("UPGRADE COST: " + baflams.upgrade2Cost);
                    cost3.setText("UPGRADE COST: " + baflams.upgrade3Cost);
                    cost4.setText("UPGRADE COST: " + baflams.upgrade4Cost);
                    cost5.setText("UPGRADE COST: " + baflams.upgrade5Cost);
                    cost6.setText("UPGRADE COST: " + baflams.upgrade6Cost);
                    cost7.setText("UPGRADE COST: " + baflams.upgrade7Cost);
                    cost8.setText("UPGRADE COST: " + baflams.upgrade8Cost);
                    cost9.setText("UPGRADE COST: " + baflams.upgrade9Cost);
                    cost10.setText("UPGRADE COST: " + baflams.upgrade10Cost);
                    cost11.setText("UPGRADE COST: " + baflams.upgrade11Cost);


                }
            };
            updateTimer = new Timer(500, guiUpdate); //delay, the thing to do
            updateTimer.start();


            //PROPERTIES
            panel.setSize(400, 100);
            panel.setLayout(new GridLayout(3, 3));
            //first need to add the label to the panel
            panel.add(baflamButton);
            panel.add(upgradeButton1);
            panel.add(upgradeButton2);
            panel.add(label); //each element needs to be added to our panel after creation
            panel.add(cost1);
            panel.add(cost2);
            panel.setBackground(Color.LIGHT_GRAY); //CHANGES COLOR


            panel2.setSize(400, 100);
            panel2.setLayout(new GridLayout(3,3));
            panel2.add(upgradeButton3);
            panel2.add(upgradeButton4);
            panel2.add(upgradeButton5);
            panel2.add(cost3);
            panel2.add(cost4);
            panel2.add(cost5);
            panel2.setBackground(Color.cyan);


            panel3.setSize(400, 100);
            panel3.setLayout(new GridLayout(3,3));
            panel3.add(upgradeButton6);
            panel3.add(upgradeButton7);
            panel3.add(upgradeButton8);
            panel3.add(cost6);
            panel3.add(cost7);
            panel3.add(cost8);
            panel3.setBackground(Color.green);


            panel4.setSize(400, 100);
            panel4.setLayout(new GridLayout(3,3));
            panel4.add(upgradeButton9);
            panel4.add(upgradeButton10);
            panel4.add(upgradeButton11);
            panel4.add(cost9);
            panel4.add(cost10);
            panel4.add(cost11);
            panel4.setBackground(Color.YELLOW);


            frame.setLayout(new BorderLayout());

            frame.add(topPanel, BorderLayout.NORTH);
            frame.add(upgradesPanel, BorderLayout.CENTER);


            //next, we add the panel to the frame
            frame.add(panel);
            frame.add(panel2);
            frame.add(panel3);
            frame.add(panel4);



            frame.setSize(1000, 1000);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }


        @Override
        public void actionPerformed (ActionEvent e){
            baflams.click();
            label.setText("Baflams: " + baflams.baflamCounter);


        }
    }

/*
TODO:
change button colors
Add more upgrades (you need to change the grid)
~5-10
They need to be unique and do different things

bonus points
change your button to cookie images or some other image
 */