
//Gladwin Kurian
//section-K 
//19100BTCSEMA05484
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Point;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

//Exit menu keliye Dialog BOx
class meraDialog extends Dialog implements ActionListener {
	public meraDialog(note frame) {
		// TODO Auto-generated constructor stub
		super(frame, "Are you sure", true);
		
		Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		setSize(350, 200);
	      
		setLayout(new FlowLayout());
		Label pehlaLabel = new Label("Do you want to exit?");
		Label dusraLabel = new Label(" If you have not saved the file you will lose your notes !");
		Button pehlaButton = new Button("Yes");
		Button dusraButton = new Button("Cancel");
		add(pehlaLabel);
		add(pehlaButton);
		add(dusraButton);
		add(dusraLabel);
		pehlaButton.addActionListener(this);
		dusraButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String act = e.getActionCommand();
		switch (act) {
		case "Yes": {
			System.exit(0);
			break;
		}
		case "Cancel": {
			this.dispose();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + act);
		}
	}
}


class note extends Frame implements ActionListener {

	Color darkbg = new Color(40, 53, 59);
	Color darkfg = new Color(255, 255, 255);
	Color lightbg = new Color(250, 252, 227);
	Color lightfg = new Color(0, 0, 0);
	Color darkMenuBar = new Color(49, 68, 77);
	Color lightMenuBar = new Color(240, 240, 240);
	TextArea textArea;
	Font txtFont = new Font("Ariel", Font.PLAIN ,16);
	Font frameFont = new Font("Ariel", Font.PLAIN ,14);
	String filename;

	public note() {
		setUndecorated(false);
		Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		int frameWidth = 700,frameHeight = 700;
		setSize(frameWidth, frameHeight);
	      setBounds(center.x - frameWidth / 2, center.y - frameHeight / 2, frameWidth, frameHeight);
		setLayout(new BorderLayout());
		setFont(frameFont);
		setVisible(true);
		setTitle("G-Note");
		setBackground(Color.orange);
		textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textArea.setFont(txtFont);
		textArea.setBackground(darkbg);
		textArea.setForeground(darkfg);
		setBackground(darkMenuBar);

		MenuBar menuBar = new MenuBar();
		setMenuBar(menuBar);

		Menu file = new Menu("File");
		MenuItem save = new MenuItem("Save");
		MenuItem open = new MenuItem("Open");
		MenuItem separator = new MenuItem("-");
		MenuItem exit = new MenuItem("Exit");
		save.addActionListener(new Save());
		open.addActionListener(new Open());
		exit.addActionListener(this);

		file.add(save);
		file.add(open);
		file.add(separator);
		file.add(exit);

		Menu theme = new Menu("Theme");
		MenuItem light = new MenuItem("Light");
		MenuItem dark = new MenuItem("Dark");
		theme.add(dark);
		theme.add(light);
		light.addActionListener(this);
		dark.addActionListener(this);
		
		Menu zoom = new Menu("Zoom");
		MenuItem increase = new MenuItem("Increase");
		MenuItem decrease = new MenuItem("Decrease");
		increase.addActionListener(this);
		decrease.addActionListener(this);
		zoom.add(increase);
		zoom.add(decrease);
		
//		Menu help = new Menu("Help");
//		MenuItem keyShortcuts = new MenuItem("Keyboard Shortcuts");
//		help.add(keyShortcuts);
//		menuBar.add(help);
		this.add(textArea);
		
		Menu about = new Menu("About");
		MenuItem aboutgNote = new MenuItem("gNote");
		about.add(aboutgNote);
		aboutgNote.addActionListener(this);
		
		menuBar.add(file);
		menuBar.add(theme);
		menuBar.add(zoom);
		menuBar.add(about);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
//				meraDialog dB = new meraDialog(super.);
//				dB.setVisible(true);
				dispose();
			}
		});

	}

	public void actionPerformed(ActionEvent e) {
		String actionName = e.getActionCommand();
		if (actionName == "Exit") {
			meraDialog dB = new meraDialog(this);
			dB.setVisible(true);
		} 
		
		
		else if(actionName == "Increase") {
			Font font = textArea.getFont();
			float size = font.getSize() + 1.0f;
			textArea.setFont( font.deriveFont(size) ); 
		}
		else if(actionName == "Decrease") {
			Font font = textArea.getFont();
			float size = font.getSize() - 1.0f;
			textArea.setFont( font.deriveFont(size) );
		}
		else if( actionName == "Dark") {
			textArea.setBackground(darkbg);
			textArea.setForeground(darkfg);
			setBackground(darkMenuBar);
		}
		else if( actionName == "Light")
		{
			textArea.setBackground(lightbg);
			textArea.setForeground(lightfg);
			setBackground(lightMenuBar);
		}
		else if(actionName == "gNote") {
			class aboutDialog extends Dialog {
				public aboutDialog(note frame) {
					// TODO Auto-generated constructor stub
					super(frame, "Are you sure", false);
					
					Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
					setSize(350, 200);
				      
					setLayout(new FlowLayout());
					Label pehlaLabel = new Label("Developed By - Gladwin Kurian");
					Label dusraLabel = new Label("Version - 1.0.1");
					Label teesraLabel = new Label("To report any bugs mail at gladwinkurian@gmail.com");
					setVisible(true);
					add(pehlaLabel);
					add(dusraLabel);
					add(teesraLabel);
					addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent e) {
//							meraDialog dB = new meraDialog(super.);
//							dB.setVisible(true);
							dispose();
						}
					});
				}
			}
			new aboutDialog(this);
			
		}
		
	}
	 class Save implements ActionListener
     {
     public void actionPerformed(ActionEvent e)
         {
         FileDialog fd = new FileDialog(note.this,"Save File",FileDialog.SAVE);
         fd.show();
         if (fd.getFile()!=null)
             {
             filename = fd.getDirectory() + fd.getFile();
             setTitle(filename);
             try
                 {
                 DataOutputStream outstream = new DataOutputStream(new FileOutputStream(filename));
                 String line = textArea.getText();
                 BufferedReader read = new BufferedReader(new StringReader(line));
                 while((line = read.readLine())!=null)
                     {
                	 outstream.writeBytes(line + "\r\n");
                	 outstream.close();
                 }
             }
             catch(Exception ex)
                 {
                 System.out.println("File not found");
             }
             textArea.requestFocus();
         }
     }
 }
	class Open implements ActionListener
	{
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e)
	    {
	    FileDialog fd = new FileDialog(note.this, "select File",FileDialog.LOAD);
	    fd.show();
	    if (fd.getFile()!=null)
	        {
	        filename = fd.getDirectory() + fd.getFile();
	        setTitle(filename);
	        ReadFile();
	    }
	    textArea.requestFocus();
	}
	}
	void ReadFile()
    {
    BufferedReader d;
    StringBuffer sb = new StringBuffer();
    try
        {
        d = new BufferedReader(new FileReader(filename));
        String line;
        while((line=d.readLine())!=null)
        sb.append(line + "\n");
        textArea.setText(sb.toString());
        d.close();
    }
    catch(FileNotFoundException E)
        {
        System.out.println("File not Found");
    }
    catch(IOException dusraE){}
}

}


class gNote {

	public static void main(String[] args) {
		note note = new note();
	}
}


