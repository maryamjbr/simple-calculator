import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class calculator {
    public static double answer(String n1, String n2, String a1) {

        if(a1.equals("+")){
            double ans=Double.parseDouble(n2)+Double.parseDouble(n1);
            return ans;
        }
        else if(a1.equals("*")){
            double ans=Double.parseDouble(n2)*Double.parseDouble(n1);
            return ans;
        }
        else if(a1.equals("/")){
            double ans=Double.parseDouble(n1)/Double.parseDouble(n2);
            return ans;
        }
        else if(a1.equals("-")){
            double ans=Double.parseDouble(n1)-Double.parseDouble(n2);
            return ans;
        }
        else {
            double ans=Double.parseDouble(n2)+Double.parseDouble(n1);
            return ans;
        }

    }


    public static void main(String[] args) throws FileNotFoundException {
        JFrame frame=new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,440);
        Container calculator=frame.getContentPane();
        calculator.setBackground(Color.lightGray);
        calculator.setSize(420,440);

        File file =new File("log.txt");
        PrintStream out = new PrintStream("log.txt");
        try {
            if(!file.exists()){
                file.createNewFile();}
            Scanner input=new Scanner(file);

        final String[] numb = {""};
        final String[] numb2 = {""};
        final String[] a = {""};
        final String[] a2 = {""};
        final String[] lines = {""};

        JTextField text=new JTextField();
        text.setOpaque(true);
        text.setPreferredSize(new Dimension(100,50));
        text.setFont(new Font("Serif",Font.BOLD,18));

        JButton button_1=new JButton();
        button_1.setText("1");
        button_1.setPreferredSize(new Dimension(90,50));
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!a[0].equals("")){
                out.println(a[0]);}

                numb[0] += button_1.getText();
                numb[0] =a2[0]+numb[0];
                a2[0]="";
                text.setText(numb[0]);
            }
        });

        JButton button_2=new JButton();
        button_2.setText("2");
        button_2.setPreferredSize(new Dimension(90,50));
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!a[0].equals("")){
                    out.println(a[0]);}

                numb[0] += button_2.getText();
                numb[0] =a2[0]+numb[0];
                a2[0]="";
                text.setText(numb[0]);
            }
        });

        JButton button_3=new JButton();
        button_3.setText("3");
        button_3.setPreferredSize(new Dimension(90,50));
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!a[0].equals("")){
                    out.println(a[0]);}

                numb[0] += button_3.getText();
                numb[0] =a2[0]+numb[0];
                a2[0]="";
                text.setText(numb[0]);
            }
        });

        JButton button_4=new JButton();
        button_4.setText("4");
        button_4.setPreferredSize(new Dimension(90,50));
        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!a[0].equals("")){
                    out.println(a[0]);}

                numb[0] += button_4.getText();

                numb[0] =a2[0]+numb[0];
                a2[0]="";
                text.setText(numb[0]);
            }
        });

        JButton button_5=new JButton();
        button_5.setText("5");
        button_5.setPreferredSize(new Dimension(90,50));
        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!a[0].equals("")){
                    out.println(a[0]);}

                numb[0] += button_5.getText();
                numb[0] =a2[0]+numb[0];
                a2[0]="";
                text.setText(numb[0]);
            }
        });

        JButton button_6=new JButton();
        button_6.setText("6");
        button_6.setPreferredSize(new Dimension(90,50));
        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!a[0].equals("")){
                    out.println(a[0]);}

                numb[0] += button_6.getText();
                numb[0] =a2[0]+numb[0];
                a2[0]="";
                text.setText(numb[0]);
            }
        });

        JButton button_7=new JButton();
        button_7.setText("7");
        button_7.setPreferredSize(new Dimension(90,50));
        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!a[0].equals("")){
                    out.println(a[0]);}

                numb[0] += button_7.getText();
                numb[0] =a2[0]+numb[0];
                a2[0]="";
                text.setText(numb[0]);
            }
        });

        JButton button_8=new JButton();
        button_8.setText("8");
        button_8.setPreferredSize(new Dimension(90,50));
        button_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!a[0].equals("")){
                    out.println(a[0]);}

                numb[0] += button_8.getText();
                numb[0] =a2[0]+numb[0];
                a2[0]="";
                text.setText(numb[0]);
            }
        });

        JButton button_9=new JButton();
        button_9.setText("9");
        button_9.setPreferredSize(new Dimension(90,50));
        button_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!a[0].equals("")){
                    out.println(a[0]);}

                numb[0] += button_9.getText();
                numb[0] =a2[0]+numb[0];
                a2[0]="";
                text.setText(numb[0]);
            }
        });

        JButton button_0=new JButton();
        button_0.setText("0");
        button_0.setPreferredSize(new Dimension(90,50));
        button_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!a[0].equals("")){
                    out.println(a[0]);}
                numb[0]+=(button_0.getText());
                numb[0] =a2[0]+numb[0];
                a2[0]="";
                text.setText(numb[0]);

            }
        });

        JButton button_zarb=new JButton();
        button_zarb.setText("*");
        button_zarb.setPreferredSize(new Dimension(90,50));
        button_zarb.setBackground(new Color(224, 200, 191));
        button_zarb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                out.println(numb[0]);

                numb2[0]=numb[0];
                numb[0]="";
                text.setText(button_zarb.getText());
                a[0]=button_zarb.getText();

            }
        });

        JButton button_taghsim=new JButton();
        button_taghsim.setText("/");
        button_taghsim.setPreferredSize(new Dimension(90,50));
        button_taghsim.setBackground(new Color(224, 200, 191));
        button_taghsim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                out.println(numb[0]);

                numb2[0]=numb[0];
                numb[0]="";
                text.setText(button_taghsim.getText());
                a[0]=button_taghsim.getText();
            }
        });

        JButton button_sum=new JButton();
        button_sum.setText("+");
        button_sum.setPreferredSize(new Dimension(90,50));
        button_sum.setBackground(new Color(224, 200, 191));
        button_sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                out.println(numb[0]);
                numb2[0]=numb[0];
                numb[0]="";
                text.setText(button_sum.getText());
                a[0]=button_sum.getText();
            }
        });

        JButton button_minus = new JButton();
        button_minus.setText("-");
        button_minus.setPreferredSize(new Dimension(90,50));
        button_minus.setBackground(new Color(224, 200, 191));
        button_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                out.println(numb[0]);

                if(a2[0].equals("-")){
                    a[0]="-";}
                if(a[0].equals("")){
                    numb2[0]=numb[0];
                    numb[0]="";}
                text.setText(button_minus.getText());
                a2[0]=button_minus.getText();

            }

        });

        JButton button_ashar=new JButton();
        button_ashar.setText(".");
        button_ashar.setPreferredSize(new Dimension(90,50));
        button_ashar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                text.setText(numb[0]+".");
                numb[0]+=".";
            }
        });

        JButton button_mosavi=new JButton();
        button_mosavi.setText("=");
        button_mosavi.setPreferredSize(new Dimension(90,50));
        button_mosavi.setBackground(new Color(168, 168, 168));
        button_mosavi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(a[0].equals("/")&& Double.parseDouble(numb[0])==0){
                    text.setText("not valid");
                    numb2[0]="";
                    numb[0]="";
                    a[0]="";
                    a2[0]="";
                }else{
                    out.println(numb[0]+"\n"+"=");
                    text.setText("="+answer(numb2[0],numb [0],a[0]));
                    numb[0]= String.valueOf(answer(numb2[0],numb[0],a[0]));
                    out.println(numb[0]+"\n"+"------------------");
                    numb2[0]="";
                    a[0]="";
                    a2[0]="";}
            }
        });

        JButton button_clear=new JButton();
        button_clear.setText("clear");
        button_clear.setPreferredSize(new Dimension(90,50));
        button_clear.setBackground(new Color(194, 156, 168));
        button_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                numb[0]="";
                numb2[0]="";
                a[0]="";
                a2[0]="";
                text.setText(" ");
            }
        });

        JButton button_log=new JButton();
        button_log.setText("log");
        button_log.setPreferredSize(new Dimension(90,50));

        button_log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                while (input.hasNextLine()){
                    lines[0] += input.nextLine()+"\n";

                }
                System.out.println(lines[0]);

            }

        });

        button_1.setBackground(new Color(207, 227, 227));
        button_2.setBackground(new Color(207, 227, 227));
        button_3.setBackground(new Color(207, 227, 227));
        button_4.setBackground(new Color(207, 227, 227));
        button_5.setBackground(new Color(207, 227, 227));
        button_6.setBackground(new Color(207, 227, 227));
        button_7.setBackground(new Color(207, 227, 227));
        button_8.setBackground(new Color(207, 227, 227));
        button_9.setBackground(new Color(207, 227, 227));
        button_0.setBackground(new Color(207, 227, 227));
        button_ashar.setBackground(new Color(182, 208, 208));
        button_ashar.setFont((new Font("Serif",Font.BOLD,17)));
        button_minus.setFont((new Font("Serif",Font.BOLD,17)));
        button_zarb.setFont((new Font("Serif",Font.BOLD,17)));
        button_sum.setFont((new Font("Serif",Font.BOLD,17)));
        button_mosavi.setFont((new Font("Serif",Font.BOLD,17)));
        button_taghsim.setFont((new Font("Serif",Font.BOLD,17)));



        calculator.add(text);
        calculator.add(button_0);
        calculator.add(button_1);
        calculator.add(button_2);
        calculator.add(button_3);
        calculator.add(button_4);
        calculator.add(button_5);
        calculator.add(button_6);
        calculator.add(button_7);
        calculator.add(button_8);
        calculator.add(button_9);
        calculator.add(button_ashar);
        calculator.add(button_clear);
        calculator.add(button_minus);
        calculator.add(button_mosavi);
        calculator.add(button_sum);
        calculator.add(button_taghsim);
        calculator.add(button_zarb);
        calculator.add(button_log);

        SpringLayout  layout=new SpringLayout();


        layout.putConstraint(SpringLayout.NORTH,text,10,SpringLayout.NORTH,calculator);
        layout.putConstraint(SpringLayout.WEST,text,10,SpringLayout.WEST,calculator);
        layout.putConstraint(SpringLayout.EAST,text,-10,SpringLayout.EAST,calculator);


        layout.putConstraint(SpringLayout.NORTH,button_1,5,SpringLayout.SOUTH,text);
        layout.putConstraint(SpringLayout.WEST,button_1,10,SpringLayout.WEST,calculator);

        layout.putConstraint(SpringLayout.NORTH,button_2,5,SpringLayout.SOUTH,text);
        layout.putConstraint(SpringLayout.WEST,button_2,5,SpringLayout.EAST,button_1);

        layout.putConstraint(SpringLayout.NORTH,button_3,5,SpringLayout.SOUTH,text);
        layout.putConstraint(SpringLayout.WEST,button_3,5,SpringLayout.EAST,button_2);
        layout.putConstraint(SpringLayout.NORTH,button_zarb,5,SpringLayout.SOUTH,text);
        layout.putConstraint(SpringLayout.WEST,button_zarb,5,SpringLayout.EAST,button_3);
        layout.putConstraint(SpringLayout.EAST,button_zarb,-10,SpringLayout.EAST,calculator);


        layout.putConstraint(SpringLayout.NORTH,button_4,5,SpringLayout.SOUTH,button_1);
        layout.putConstraint(SpringLayout.WEST,button_4,10,SpringLayout.WEST,calculator);
        layout.putConstraint(SpringLayout.NORTH,button_5,5,SpringLayout.SOUTH,button_2);
        layout.putConstraint(SpringLayout.WEST,button_5,5,SpringLayout.EAST,button_4);
        layout.putConstraint(SpringLayout.NORTH,button_6,5,SpringLayout.SOUTH,button_3);
        layout.putConstraint(SpringLayout.WEST,button_6,5,SpringLayout.EAST,button_5);
        layout.putConstraint(SpringLayout.NORTH,button_taghsim,5,SpringLayout.SOUTH,button_zarb);
        layout.putConstraint(SpringLayout.WEST,button_taghsim,5,SpringLayout.EAST,button_6);
        layout.putConstraint(SpringLayout.EAST,button_taghsim,-10,SpringLayout.EAST,calculator);

        layout.putConstraint(SpringLayout.NORTH,button_7,5,SpringLayout.SOUTH,button_4);
        layout.putConstraint(SpringLayout.WEST,button_7,10,SpringLayout.WEST,calculator);
        layout.putConstraint(SpringLayout.NORTH,button_8,5,SpringLayout.SOUTH,button_5);
        layout.putConstraint(SpringLayout.WEST,button_8,5,SpringLayout.EAST,button_7);
        layout.putConstraint(SpringLayout.NORTH,button_9,5,SpringLayout.SOUTH,button_6);
        layout.putConstraint(SpringLayout.WEST,button_9,5,SpringLayout.EAST,button_8);
        layout.putConstraint(SpringLayout.NORTH,button_sum,5,SpringLayout.SOUTH,button_taghsim);
        layout.putConstraint(SpringLayout.WEST,button_sum,5,SpringLayout.EAST,button_9);
        layout.putConstraint(SpringLayout.EAST,button_sum,-10,SpringLayout.EAST,calculator);

        layout.putConstraint(SpringLayout.NORTH,button_0,5,SpringLayout.SOUTH,button_7);
        layout.putConstraint(SpringLayout.WEST,button_0,10,SpringLayout.WEST,calculator);
        layout.putConstraint(SpringLayout.NORTH,button_ashar,5,SpringLayout.SOUTH,button_8);
        layout.putConstraint(SpringLayout.WEST,button_ashar,5,SpringLayout.EAST,button_0);
        layout.putConstraint(SpringLayout.NORTH,button_mosavi,5,SpringLayout.SOUTH,button_9);
        layout.putConstraint(SpringLayout.WEST,button_mosavi,5,SpringLayout.EAST,button_ashar);
        layout.putConstraint(SpringLayout.NORTH,button_minus,5,SpringLayout.SOUTH,button_sum);
        layout.putConstraint(SpringLayout.WEST,button_minus,5,SpringLayout.EAST,button_mosavi);
        layout.putConstraint(SpringLayout.EAST,button_minus,-10,SpringLayout.EAST,calculator);

        layout.putConstraint(SpringLayout.NORTH,button_clear,5,SpringLayout.SOUTH,button_0);
        layout.putConstraint(SpringLayout.WEST,button_clear,10,SpringLayout.WEST,calculator);
        layout.putConstraint(SpringLayout.EAST,button_clear,-10,SpringLayout.EAST,calculator);

        layout.putConstraint(SpringLayout.NORTH,button_log,5,SpringLayout.SOUTH,button_clear);
        layout.putConstraint(SpringLayout.WEST,button_log,10,SpringLayout.WEST,calculator);
        layout.putConstraint(SpringLayout.EAST,button_log,-10,SpringLayout.EAST,calculator);





        calculator.setLayout(layout);

        calculator.setVisible(true);

        frame.setVisible(true);

        }


        catch (IOException e){
            System.out.println("An error occurred.");
        }
    }
}
