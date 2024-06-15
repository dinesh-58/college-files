package com.mycompany.june15;

import javax.swing.*;
/**
 *
 * @author sujal
 */
public class MenuDemo {

	public MenuDemo() {
		JFrame jf1 = new JFrame("");
		jf1.setVisible(true);
		jf1.setSize(500, 500);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar jmBar = new JMenuBar();
		jf1.setJMenuBar(jmBar);

		JMenu jmFile = new JMenu("File");
		jmBar.add(jmFile);

		JMenuItem jmiOpen = new JMenuItem("Open");
		jmFile.add(jmiOpen);

		JMenuItem jmiSave = new JMenuItem("Save");
		jmFile.add(jmiSave);

		JMenuItem jmiExit = new JMenuItem("Exit");
		jmFile.add(jmiExit);

		JMenu jmTools = new JMenu("Tools");
		jmBar.add(jmTools);

		JMenu jmLoad = new JMenu("Load");
		jmFile.add(jmLoad);

		JMenuItem jmiLoadSite = new JMenuItem("Load from site");
		jmLoad.add(jmiLoadSite);
		JMenuItem jmiLoadDevice = new JMenuItem("Load from device");
		jmLoad.add(jmiLoadDevice);

	}

}
