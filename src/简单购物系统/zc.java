package 简单购物系统;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class zc extends JDialog {

	protected static final String name = null;
	private final JPanel contentPanel = new JPanel();
	private JTextField id;
	private JPasswordField password;
	private JPasswordField paswd;
	private JTextField phone;
	private final JLabel label_1 = new JLabel("\u6B22\u8FCE\u6CE8\u518C\uFF01");
	private JLabel zhanhao;
	private JLabel vcd;
	private JLabel mima;
	private JLabel label_5;
	private JLabel queren;
	private JLabel shouji;
	private JLabel label;
	private JLabel label2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			zc dialog = new zc();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public zc() {
		label_1.setFont(new Font("宋体", Font.PLAIN, 25));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(204, 255, 204));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			zhanhao = new JLabel("\u8D26\u53F7\uFF1A");
		}
		{
			id = new JTextField();
			id.setColumns(10);
		}
		{
			vcd = new JLabel("\uFF088-16\u4F4D\u6570\u5B57\u6216\u5B57\u6BCD\uFF09");
		}
		{
			mima = new JLabel("\u5BC6\u7801\uFF1A");
		}
		{
			password = new JPasswordField();
		}
		{
			label_5 = new JLabel("\uFF086-12\u4F4D\u6570\u5B57\u6216\u5B57\u6BCD\uFF09");
		}
		{
			queren = new JLabel("\u786E\u8BA4\u5BC6\u7801\uFF1A");
		}
		{
			paswd = new JPasswordField();
		}
		{
			shouji = new JLabel("\u624B\u673A\u53F7\uFF1A");
		}
		{
			phone = new JTextField();
			phone.setColumns(10);
		}
		{
			label = new JLabel("\uFF0811\u4F4D\u7EAF\u6570\u5B57\uFF09");
		}
		
		final JLabel cn = new JLabel("( \u8BF7\u91CD\u65B0\u8F93\u5165 )");
		{
			label2 = new JLabel("        ");
			label2.setFont(new Font("宋体", Font.PLAIN, 20));
		}
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(130)
					.addComponent(label_1))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(89)
					.addComponent(zhanhao)
					.addGap(5)
					.addComponent(id, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(vcd))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(89)
					.addComponent(mima)
					.addGap(5)
					.addComponent(password, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label_5))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(65)
					.addComponent(queren)
					.addGap(5)
					.addComponent(paswd, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(cn, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(77)
					.addComponent(shouji)
					.addGap(5)
					.addComponent(phone, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(130)
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(34)
					.addComponent(label_1)
					.addGap(7)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(zhanhao))
						.addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(vcd)))
					.addGap(7)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(mima))
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label_5)))
					.addGap(7)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(queren))
						.addComponent(paswd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(cn)))
					.addGap(7)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(shouji))
						.addComponent(phone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(3)
							.addComponent(label)))
					.addGap(7)
					.addComponent(label2))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(204, 255, 204));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("\u6CE8\u518C");
				okButton.setBackground(new Color(204, 255, 153));
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						
						String nam=id.getText();
						String ps=password.getText();
						String pas=paswd.getText();
						String ph=phone.getText(); 
						if(ps.equals(pas)){
							cn.setText("(密码输入正确)");
							User user=new User();
							boolean tt;
							tt=user.nameequals(nam);
							if(tt==true){
								user.saveuser(nam, pas,ph);
								label2.setText("注册成功");
							}else {
								vcd.setText("(用户名以存在)");
								vcd.repaint();
							}
						} else {
							cn.setText("(密码不一致)");
							cn.repaint();
						}
					}
				});
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
						id.setText("");
						password.setText("");
						paswd.setText("");
						phone.setText("");
						cn.setText("(请重复输入)");
						vcd.setText("（8-16位数字或字母）");
						label2.setText("");
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
