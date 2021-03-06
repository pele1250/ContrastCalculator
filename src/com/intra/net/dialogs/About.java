package com.intra.net.dialogs;

import com.intra.net.frame.Frame;

import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JEditorPane;

@SuppressWarnings("serial")
public class About extends GenericDialog {

	public About(Frame parent) {
		super(parent, "About Contrast Calculator");
		setBounds(100, 100, 283, 282);

		buildCloseButton(new Rectangle(182, 225, 89, 23));

		JEditorPane content = new JEditorPane();
		Font font = new Font("Verdana", Font.PLAIN, 14);
		content.setFont(font);
		content.setContentType("text/html");
		content.setText("<html>\r\n\t<style>span{ font-family:Verdana; } div{ padding-left: 10px; }</style>\r\n\t<span>Contrast Calculator v1.4.2</span><br>\r\n\t<div>\r\n\t\t<span>3rd Party Libraries<span>\r\n\t\t\t<div><span>JNA 4.0</span></div>\r\n\t\t\t<div><span>Weblaf 1.2.5 Look and Feel</span></div>\r\n\t</div>\r\n\t<br>\r\n<span>&copy; 2014 - Andrew Cumming.</span>\r\n\t<br><br>\r\n<span>Designer: Andrew Cumming<br>\r\nEmail: andrew.e.cumming@gmail.com</span>\r\n</html>");
		content.setBounds(2, 7, 271, 214);
		getContentPane().add(content);

		JButton focus = new JButton("");
		focus.setActionCommand("focus");
		focus.setBounds(-100, -100, 0, 0);
		registerForFocus(focus, content);
	}
}
