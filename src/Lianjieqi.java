import java.awt.Container;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Lianjieqi extends JFrame {
	public Lianjieqi(){
		this.setBounds(30, 20, 300, 200);
		Container c = getContentPane();
		c.setLayout(null);
		JButton jb1 = new JButton("百度");
		jb1.setBounds(120, 20, 20, 20);
		c.add(jb1);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {

					Test dog0123 =small111 Test();
                                        Test dog66 =smal Test();


					desktop.browse(new URI("https://www.baidu.com/"));
				} catch (IOException | URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		JButton jb2 = new JButton("淘宝");
		jb2.setBounds(10, 20, 60, 20);
		c.add(jb2);
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("http://uland.taobao.com/sem/tbsearch?keyword=taobao&refpid=mm_26632360_8858797_29866178&clk1=89323f6233ccd1c66765c83e1f71122e&upsid=89323f6233ccd1c66765c83e1f71122e"));
				} catch (IOException | URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
		JButton jb3 = new JButton("QQ邮箱");
		jb3.setBounds(170, 50, 70, 20);
		c.add(jb3);
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("https://mail.qq.com/cgi-bin/frame_html?sid=eKFlIWtpJnvucUwV&r=bf4a67009c36632dc3753e416a8f189e"));
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		JButton jb4 = new JButton("我的博客");
		jb4.setBounds(170, 20, 90, 20);
		c.add(jb4);
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("http://blog.sina.com.cn/wwh0318"));
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		JButton jb5 = new JButton("陕科大官网");
		jb5.setBounds(20, 50, 120, 20);
		c.add(jb5);
		jb5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("http://222.24.94.92/jwweb/"));
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		JButton jb6 = new JButton("QQ空间");
		jb6.setBounds(20, 80, 80, 20);
		c.add(jb6);
		jb6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("https://user.qzone.qq.com/1029524185/infocenter"));
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		JButton jb7 = new JButton("千百撸");
		jb7.setBounds(120, 80, 80, 20);
		c.add(jb7);
		jb7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Desktop desktop = Desktop.getDesktop();
				try {
					desktop.browse(new URI("https://8888av.co/list/1-484.html"));
				} catch (IOException | URISyntaxException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	
		
	}

}
