// @auther raghavendrakanoonog
//Raghavendra_Knoonogo
//19100BTCSEMA05493

import java.awt.*;
import java.awt.event.*;
import java.io.*;
 
public class NoteDemo {
	
	private Frame fr;
	private TextArea ta;
	private MenuBar bar;
	private Menu m;
	private MenuItem mi1,mi2,mi3;
	private Font font;
	private Dialog dia;
	private Button but1,but2;
	
	private FileDialog fd1,fd2;
	
	private File file = null;
	
	NoteDemo()
	{
		fr = new Frame("MyNote");
		ta = new TextArea();
		bar = new MenuBar();
		m = new Menu("File");
		mi1 = new MenuItem("New");
		mi2 = new MenuItem("Open");
		mi3 = new MenuItem("Save");
		
		but1 = new Button ( "Yes");
		 but2 = new Button ( "NO");
		
		fd1 = new FileDialog(fr,"File",FileDialog.LOAD );
		fd2 = new FileDialog(fr,"File",FileDialog.SAVE );
		
		 font = new Font ( "Monospaced", Font.BOLD, 20); 
		
		dia.setLayout(new FlowLayout());
		dia.setBounds(530, 280, 140, 100);	
		
		fr.setBounds(200, 80, 700, 600);
		fr.add(ta);
		 fr.setFont (font); 
		
		m.add(mi1);
		m.add(mi2);
		m.add(mi3);

		bar.add(m);
		
		fr.setMenuBar(bar);
		
		dia.add(but1);
		dia.add(but2);
		
		myEvent();
		
		fr.setVisible(true);
		
	}
 
	public void myEvent()
	{	
		fr.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		//New
		mi1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ta.setText("");
			}
		});
		//Open
		mi2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				fd1.setVisible(true);
				 String dirPath = fd1.getDirectory (); 
				 String fileName = fd1.getFile (); 
				if(dirPath==null&&fileName==null)
					 return; 
				ta.setText("");
				file = new File(dirPath,fileName);
				try
				{
					BufferedReader bufr = new BufferedReader(new FileReader(file));
					String str = null;
					while((str = bufr.readLine())!=null)
					{
						ta.append(str +"\r\n");
					}
					 bufr.close (); 
				}
				catch(IOException ex)
				{
					 throw new RuntimeException ( "stream can not be read");
				}
			}
		});
		//Save
		mi3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				saveMethod();
			}
		});

		
		but1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				saveMethod();
			}
		});
		
		but2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		ta.addKeyListener(new KeyAdapter() 
		{
			public void keyPressed(KeyEvent e)
			{
				if((e.isControlDown())&&(e.getKeyCode() == e.VK_S))
				{
					saveMethod();
				}
			}
		});
	}
	
	public void saveMethod()
	{		
		if(file==null)
		{
			fd2.setVisible(true);
			 String dirPath = fd2.getDirectory (); 
			 String fileName = fd2.getFile (); 
			 if (dirPath == null && fileName == null)
				 return; 
			file = new File(dirPath,fileName);
		}
        try
		{
			BufferedWriter bufw = new BufferedWriter(new FileWriter(file));
			String str = ta.getText();
			bufw.write(str);
			bufw.close();
		}
		catch(IOException ed)
		{
			 throw new RuntimeException ( "write to stream abnormality");
        }
		
	}
	
	public static void main(String[] args) 
	{
		new NoteDemo();
	}
}

