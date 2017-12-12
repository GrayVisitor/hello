package 简单购物系统;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

import javax.swing.LayoutStyle.ComponentPlacement;

public class dl extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField fid;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel vc;
	private JLabel label_4;
	private JLabel label;
	private JPasswordField ppasw;
	private JLabel lb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dl dialog = new dl();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public dl() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(204, 255, 204));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			label_1 = new JLabel("\u6B22\u8FCE\u767B\u5F55\uFF01");
			label_1.setFont(new Font("宋体", Font.PLAIN, 25));
		}
		{
			label_2 = new JLabel("\u8D26\u53F7\uFF1A");
		}
		{
			fid = new JTextField();
			fid.setColumns(10);
		}
		{
			vc = new JLabel("\uFF088-16\u4F4D\u6570\u5B57\u6216\u5B57\u6BCD\uFF09");
		}
		{
			label_4 = new JLabel("\u5BC6\u7801\uFF1A");
		}
		{
			label = new JLabel("\uFF086-12\u4F4D\u6570\u5B57\u6216\u5B57\u6BCD\uFF09");
		}
		{
			ppasw = new JPasswordField();
		}
		lb3 = new JLabel("           ");
		lb3.setFont(new Font("宋体", Font.PLAIN, 20));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(101)
							.addComponent(label_1))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(60)
							.addComponent(label_2)
							.addGap(5)
							.addComponent(fid, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(vc))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(60)
							.addComponent(label_4)
							.addGap(5)
							.addComponent(ppasw, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(52)
							.addComponent(lb3)))
					.addGap(59))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(45)
					.addComponent(label_1)
					.addGap(15)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_2))
						.addComponent(fid, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(vc)))
					.addGap(7)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_4))
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
							.addComponent(ppasw, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label)))
					.addGap(33)
					.addComponent(lb3))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(204, 255, 204));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("\u767B\u5F55");
				okButton.setBackground(new Color(204, 255, 153));
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String name=fid.getText();
						String mm=ppasw.getText();
						User user=new User();
						boolean t;
						t=user.isregistuser(name,mm);
						if(t==true){
							lb3.setText("登录成功");
							lb3.repaint();
							
						}else {
							
							lb3.setText("用户名或密码错误");
							lb3.repaint();
						}
							}
						}
				);
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("\u91CD\u7F6E");
				cancelButton.setBackground(new Color(204, 255, 153));
				cancelButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						fid.setText("");
						ppasw.setText("");
						lb3.setText("");
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
