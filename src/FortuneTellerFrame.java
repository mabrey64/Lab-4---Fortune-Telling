import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(topPanel);
        add(middlePanel);
        add(bottomPanel);

        fortunes.add(new Fortune("You'll have great day today! Give a stranger a compliment along the way and your luck with money will improve!"));
        fortunes.add(new Fortune("Average day, nothing special. Be sure to take a moment to appreciate the little things in life! Oh but watch out for any woodland critters!"));
        fortunes.add(new Fortune("Not a good day. Be careful with your words and actions today, they may come back to bite you! Be especially careful with your finances!"));
        fortunes.add(new Fortune("Many troubles are expected today. If you stay inside and avoid any major decisions, you may be able to avoid the worst of it! But if you head outside..."));
        fortunes.add(new Fortune("Expect many good and bad puns. How you react toward them will decide your fate. But be careful of anyone wearing blue jackets...and hope they don't give you a bad time..."));
        fortunes.add(new Fortune("Love is in the air! But be careful, it may not be the love you're looking for..."));
        fortunes.add(new Fortune("Unpredictable day ahead! Be prepared for anything! And I do mean anything"));
        fortunes.add(new Fortune("Interesting...your day will be filled with people from all over the world! Be sure to listen to their stories, you may learn something new! That knowledge could lead to better luck!"));
        fortunes.add(new Fortune("Hope you aren't allergic to animals as you'll be surrounded by them today! But be careful, one of them may be a wolf in sheep's clothing..."));
        fortunes.add(new Fortune("Not your day. Some ominous clouds are on the horizon. Keep an eye on the storm that's approaching. Weather it, and you'll be more than just motivated for the day..."));
        fortunes.add(new Fortune("Money is coming your way! But be careful and try not to spend it all in one place."));
        fortunes.add(new Fortune("People donning different masks are expected to cross your path today. You'll either have a day full of laughs, or a day full of terrible fates..."));
    }

    private void createTopPanel()
    {
        topPanel = new JPanel();
        title = new JLabel("Would you like a fortune?");
        title.setFont(titleFont);
        fortuneTellerIcon = new ImageIcon("77032-774.png");
        topPanel.add(title);
        topPanel.add(new JLabel(fortuneTellerIcon));

    }


    private void createMiddlePanel()
    {
        middlePanel = new JPanel();
    }

    private void createBottomPanel()
    {
        bottomPanel = new JPanel();
    }

}
