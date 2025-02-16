import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class FortuneTellerFrame extends JFrame
{
    JPanel mainPanel;
    JPanel topPanel;
    JPanel middlePanel;
    JPanel bottomPanel;

    Font titleFont = new Font("Arial", Font.BOLD, 20);
    Font displayFont = new Font("Times New Roman", Font.PLAIN, 15);
    Font buttonFont = new Font("Courier New", Font.ITALIC, 15);

    ArrayList<Fortune> fortunes = new ArrayList<>();

    JButton reading;
    JButton exit;

    JTextArea display;
    JLabel title;
    ImageIcon fortuneTellerIcon;

    JScrollPane scroll;

    int lastIndex = -1;

    public FortuneTellerFrame()
    {

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        createTopPanel();
        createMiddlePanel();
        createBottomPanel();

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(middlePanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        setTitle("Fortune Teller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // get screen dimensions
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        // center frame in screen

        setSize(screenWidth / 3, screenHeight / 2);
        setLocation(screenWidth / 3, screenHeight / 3);

        // sets the frame to be visible and adds the mainPanel to the frame
        setVisible(true);
        add(mainPanel);

        // loads the fortunes into the ArrayList
        fortunes.add(new Fortune("You'll have great day today! Give a stranger a compliment and your luck will improve!"));
        fortunes.add(new Fortune("Average day, nothing special. Be sure to take a moment to appreciate the little things in life!"));
        fortunes.add(new Fortune("Not a good day. Be careful with your words and actions today, they may come back to bite you!"));
        fortunes.add(new Fortune("Many troubles are expected today. If you stay inside, you can avoid any problems. But if you head outside..."));
        fortunes.add(new Fortune("Expect many good and bad puns. How you react toward them will decide your fate."));
        fortunes.add(new Fortune("Love is in the air! But be careful, it may not be the love you're looking for..."));
        fortunes.add(new Fortune("Unpredictable day ahead! Be prepared for anything! And I do mean anything"));
        fortunes.add(new Fortune("Interesting...your day will be filled with people from all over the world! Be sure to listen to their stories!"));
        fortunes.add(new Fortune("Hope you aren't allergic to animals as you'll be surrounded by them today!"));
        fortunes.add(new Fortune("Not your day. Some ominous clouds are on the horizon. Keep an eye on the storm that's approaching..."));
        fortunes.add(new Fortune("Money is coming your way! But be careful and try not to spend it all in one place."));
        fortunes.add(new Fortune("People donning different masks are expected to cross your path today. Be wary of who you trust."));
    }

    // creates the top panel with the title and the fortuneteller icon
    private void createTopPanel()
    {
        topPanel = new JPanel();
        title = new JLabel("Would you like a fortune?");
        title.setFont(titleFont);
        fortuneTellerIcon = new ImageIcon("77032-774.png");
        topPanel.add(title);
        topPanel.add(new JLabel(fortuneTellerIcon));
    }

    // creates the middle panel with the display area
    private void createMiddlePanel()
    {
        middlePanel = new JPanel(new BorderLayout());
        display = new JTextArea(30, 40);
        display.setLineWrap(true);
        display.setWrapStyleWord(true);
        display.setEditable(false);
        scroll = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        middlePanel.add(scroll, BorderLayout.CENTER);
        display.setFont(displayFont);
    }

    // creates the bottom panel with the buttons
    private void createBottomPanel()
    {
        bottomPanel = new JPanel();
        reading = new JButton("Get Fortune");
        reading.setFont(buttonFont);
        exit = new JButton("Exit");
        exit.setFont(buttonFont);
        reading.addActionListener(e -> getFortune());
        exit.addActionListener(e -> System.exit(0));
        bottomPanel.add(reading);
        bottomPanel.add(exit);
    }

    // generates a random fortune and displays it in the display area using the random object
    Random random = new Random();
    private void getFortune()
    {
        int randomIndex;
        do {randomIndex = random.nextInt(fortunes.size());
        } while (randomIndex == lastIndex);
        lastIndex = randomIndex;
        display.append(fortunes.get(randomIndex).toString() + "\n");
    }



}
