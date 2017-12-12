package 简单购物系统;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class gouwu {

	private JFrame frame;
	private Object i;
	private JLabel lblID1;
	private JLabel lblName;
	private JLabel lblimg1;
	private JLabel lblprice1;
	private JComboBox count1;
	private JLabel lblID2;
	private JLabel lblName2;
	private JLabel lblimg2;
	private JLabel lblprice2;
	private JComboBox count2;
	private JLabel lblID3;
	private JLabel lblName3;
	private JLabel lblimg3;
	private JLabel lblprice3;
	private JComboBox count3;
	private JLabel lblID4;
	private JLabel lblName4;
	private JLabel lblimg4;
	private JLabel lblprice4;
	private JComboBox count4;
	private JLabel lblID5;
	private JLabel lblName5;
	private JLabel lblimg5;
	private JLabel lblprice5;
	private JComboBox count5;
	private int  totalcount=0;
	private JLabel lbl7;
	private int s5;
	private int s4;
	private int s3;
	private int s2;
	private int s1;
	private int s;
	private float w1;
	private float w2;
	private float w3;
	private float w4;
	private float w5;
	private JLabel lblN8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gouwu window = new gouwu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gouwu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("\u6CE8\u518C");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				zc zc1=new zc();
				zc1.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(204, 255, 153));
		frame.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("\u767B\u5F55");
		btnNewButton_1.setBackground(new Color(204, 255, 153));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dl dl1=new dl();
				dl1.setVisible(true);
			}
		});
		frame.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 153));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(6, 1, 5, 5));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 204));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 5,5, 5));
		
		JLabel lblNewLabel = new JLabel("\u7F16\u53F7");
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u540D\u79F0");
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u56FE\u7247");
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u4EF7\u683C");
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("\u6570\u91CF");
		panel_2.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 204));
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 5, 5, 5));
		
		lblID1 = new JLabel("");
		panel_1.add(lblID1);
		
		lblName = new JLabel("");
		panel_1.add(lblName);
		
		lblimg1 = new JLabel("");
		panel_1.add(lblimg1);
		
		
		lblprice1 = new JLabel("");
		panel_1.add(lblprice1);
		
		count1 = new JComboBox();
		count1.setBackground(new Color(204, 255, 204));
		for(int i=0;i<11;i++)
		{
			count1.addItem(i);
		}
		count1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s1=Integer.parseInt(count1.getSelectedItem().toString());
				num();
				Goods go1=new Goods();
				go1=go1.getgoodsby("1");
				w1=go1.getPrice();
				cun();
				
			}
		});
		
		panel_1.add(count1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 255, 204));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(1,5, 5, 5));
		
		lblID2 = new JLabel("");
		panel_4.add(lblID2);
		
		 lblName2 = new JLabel("");
		panel_4.add(lblName2);
		
		 lblimg2 = new JLabel("");
		panel_4.add(lblimg2);
		
		lblprice2 = new JLabel("");
		panel_4.add(lblprice2);
		
		count2 = new JComboBox();
		count2.setBackground(new Color(204, 255, 204));
		for(int i=0;i<11;i++)
		{
			count2.addItem(i);
		}
		count2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s2=Integer.parseInt(count2.getSelectedItem().toString());
				num();
				Goods go2=new Goods();
				go2=go2.getgoodsby("2");
				w2=go2.getPrice();
				cun();
			}
		});
		
		panel_4.add(count2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(204, 255, 204));
		panel.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 5, 5, 5));
		
		lblID3 = new JLabel("");
		panel_5.add(lblID3);
		
		lblName3 = new JLabel("");
		panel_5.add(lblName3);
		
		lblimg3 = new JLabel("");
		lblimg3.setBackground(new Color(204, 255, 204));
		panel_5.add(lblimg3);
		
		lblprice3 = new JLabel("");
		panel_5.add(lblprice3);
		
		count3 = new JComboBox();
		count3.setBackground(new Color(204, 255, 204));
		for(int i=0;i<11;i++)
		{
			count3.addItem(i);
		}
		count3.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				s3=Integer.parseInt(count3.getSelectedItem().toString());
				num();
				Goods go3=new Goods();
				go3=go3.getgoodsby("3");
				w3=go3.getPrice();
				cun();
			}
		});
		
		panel_5.add(count3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(204, 255, 204));
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 5, 5, 5));
		
		lblID4 = new JLabel("");
		panel_6.add(lblID4);
		
		lblName4 = new JLabel("");
		panel_6.add(lblName4);
		
		lblimg4 = new JLabel("");
		panel_6.add(lblimg4);
		
		lblprice4 = new JLabel("");
		panel_6.add(lblprice4);
		
		count4 = new JComboBox();
		count4.setBackground(new Color(204, 255, 204));
		for(int i=0;i<11;i++)
		{
			count4.addItem(i);
		}
		count4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s4=Integer.parseInt(count4.getSelectedItem().toString());
				num();
				Goods go4=new Goods();
				go4=go4.getgoodsby("4");
				w4=go4.getPrice();
				cun();
			}
		});
		
		panel_6.add(count4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 255, 204));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 5, 5, 5));
		
		lblID5 = new JLabel("");
		panel_3.add(lblID5);
		
		lblName5 = new JLabel("");
		panel_3.add(lblName5);
		
		lblimg5 = new JLabel("");
		panel_3.add(lblimg5);
		
		lblprice5 = new JLabel("");
		panel_3.add(lblprice5);
		
		count5 = new JComboBox();
		count5.setBackground(new Color(204, 255, 204));
		for(int i=0;i<11;i++)
		{
			count5.addItem(i);
		}
		count5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s5=Integer.parseInt(count5.getSelectedItem().toString());
				num();
				Goods go5=new Goods();
				go5=go5.getgoodsby("5");
				w5=go5.getPrice();
				cun();
			}
		});
		
		panel_3.add(count5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(204, 255, 204));
		frame.getContentPane().add(panel_7, BorderLayout.SOUTH);
		panel_7.setLayout(new GridLayout(1, 5, 0, 0));
		
		JLabel lblNewLabel_5 = new JLabel("\u603B\u6570\u91CF");
		panel_7.add(lblNewLabel_5);
		
		lbl7 = new JLabel("");
		panel_7.add(lbl7);
		
		JLabel lblNewLabel_4 = new JLabel("\u603B\u4EF7\u683C");
		panel_7.add(lblNewLabel_4);
		
		lblN8 = new JLabel("");
		panel_7.add(lblN8);
		
		JButton btnNewButton_2 = new JButton("\u8D2D\u7269\u8F66");
		btnNewButton_2.setBackground(new Color(204, 255, 153));
		panel_7.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u4ED8\u6B3E");
		btnNewButton_3.setBackground(new Color(204, 255, 153));
		panel_7.add(btnNewButton_3);
		loadgoods();
	}
		public void num()
		{
			s=s1+s2+s3+s4+s5;
			lbl7.setText(String.valueOf(s));
		}
	
		public void cun(){
			float w=(s1*w1)+(s2*w2)+(s3*w3)+(s4*w4)+(s5*w5);
			lblN8.setText(String.valueOf(w));
			
		}
		
	public void loadgoods() 
	{
		Goods goods1=new Goods();
		goods1=goods1.getgoodsby("1");
		lblID1.setText(goods1.getId());
		lblName.setText(goods1.getName());
		String picname=goods1.getImg().toString();
		ImageIcon img=new ImageIcon(getClass().getResource("/"+picname));
		lblimg1.setIcon(img);
	    lblprice1.setText(String.valueOf(goods1.getPrice()));
	    
	    Goods goods2=new Goods();
	    goods2=goods2.getgoodsby("2");
	    lblID2.setText(goods2.getId());
	    lblName2.setText(goods2.getName());
	    String picname2=goods2.getImg().toString();
		ImageIcon img2=new ImageIcon(getClass().getResource("/"+picname2));
		lblimg2.setIcon(img2);
		lblprice2.setText(String.valueOf(goods2.getPrice()));
		  
		Goods goods3=new Goods();
		goods3=goods3.getgoodsby("3");
		lblID3.setText(goods3.getId());
		lblName3.setText(goods3.getName());
		String picname3=goods3.getImg().toString();
		ImageIcon img3=new ImageIcon(getClass().getResource("/"+picname3));
		lblimg3.setIcon(img3);
		lblprice3.setText(String.valueOf(goods3.getPrice()));
		
		  Goods goods4=new Goods();
		  goods4=goods4.getgoodsby("4");
		  lblID4.setText(goods4.getId());
		  lblName4.setText(goods4.getName());
		  String picname4=goods4.getImg().toString();
		  ImageIcon img4=new ImageIcon(getClass().getResource("/"+picname4));
		  lblimg4.setIcon(img4);
		  lblprice4.setText(String.valueOf(goods4.getPrice()));
		  
		  Goods goods5=new Goods();
		    goods5=goods5.getgoodsby("5");
		    lblID5.setText(goods5.getId());
		    lblName5.setText(goods5.getName());
		    String picname5=goods5.getImg().toString();
			ImageIcon img5=new ImageIcon(getClass().getResource("/"+picname5));
			lblimg5.setIcon(img5);
			lblprice5.setText(String.valueOf(goods5.getPrice()));
	}

}
