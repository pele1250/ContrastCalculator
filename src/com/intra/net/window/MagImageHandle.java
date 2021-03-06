package com.intra.net.window;

import com.intra.net.persist.ImageWriter;
import com.intra.net.util.Contraster;
import com.intra.net.persist.ClipboardImage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class MagImageHandle extends MagEventBase {

	private ImageWriter iw;

	public MagImageHandle(WindowMagnifier window) {
		super(window);
		iw = new ImageWriter();
		iw.setRememberPath(true);
		iw.setParent(window);
		iw.setAutoTrim(true);
	}

	public void onEvent(String command) {
		if (command.equals("open image")) {
			loadImage();
		} else if (command.equals("save image")) {
			saveImage();
		} else if (command.equals("copy image")) {
			new ClipboardImage(window.getImagePanel().getImage()).addToClipboard();
		}
	}

	private void saveImage() {
		iw.setEnforceDirectory(true);
		iw.setName(window.getFileName().getText());
		iw.setExt(window.getExt());
		iw.saveImage(window.getImagePanel().getImage());
	}

	public void loadImage() {
		iw.setEnforceDirectory(false);
		File file = iw.promptForFile();
		if (file != null && !file.isDirectory()) {
			try {
				BufferedImage image = ImageIO.read(file);
				BufferedImage con = Contraster.convertImage(image, window.getParentFrame().getBlindColour());
				window.getImagePanel().setImage(con);
			} catch (IOException e) {
				e.printStackTrace();
				String err = "An error occured while loading the image:\n" + e.getMessage();
				JOptionPane.showMessageDialog(window, err, "Error", JOptionPane.ERROR_MESSAGE);
			}

		}
	}

}
