//https://www.javatpoint.com/java-actionlistener
import javax.swing.*;
import java.awt.event.*;
public class Main extends JFrame   {
    public static void main(String[] args) {
        JFrame ATM =new JFrame("ATM");
        ATM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ATM.setLayout(null);
        ATM.setSize(1620,850);
        JButton English =new JButton("ٍٍEnglish");
        JButton farsi  =new JButton("فارسی");

        English.setBounds( 35, 425 , 130  ,40);
        farsi.setBounds( 1380, 425 , 130  , 40 );
        ATM.add(English);
        ATM.add(farsi);
        JLabel l1,l2;
        l1=new JLabel("Choose Language ");
        l1.setBounds(400,430, 200,35);
        l2=new JLabel(" زبان خود را انتخاب کنید .");
        l2.setBounds(980,430,300 ,35);

        ATM.add(l1);
        ATM.add(l2);

        English.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                ATM.setVisible(false);
                JFrame first = new JFrame("first");
                first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                first.setLayout(null);
                first.setSize(1300, 860);
                JLabel code = new JLabel ("Enter your code") ;
                code.setBounds( 700,300 ,350 ,40 );
                first.add(code);

                JTextField digit = new JTextField();
                digit.setBounds( 600 , 430, 350 , 40);
                first.add(digit);
                first.setVisible(true);
                JButton record = new JButton("Record");
                record.setBounds( 700 ,600 , 109,50 );
                first.add(record);
                JButton Back = new JButton("Back");
                Back.setBounds( 300,600 , 109,50 );

                first.add(Back);
                Back.addActionListener(new ActionListener (){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        first.setVisible(false);
                        ATM.setVisible(true);

                    }});
                record.addActionListener(new ActionListener (){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        first.setVisible(false);
                        JFrame second = new JFrame("second");
                        second.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        second.setLayout(null);
                        second.setSize(1300, 860);
                        JButton changeCode = new JButton(" Change the code");
                        JButton withdrawal = new JButton(" Inventory withdrawal");
                        JButton transfer = new JButton  ("Make a transfer");
                        JButton inventory = new JButton("Inventory announcement");
                        changeCode.setBounds(100, 300, 200, 60);
                        withdrawal.setBounds(75, 600, 200, 60);
                        transfer.setBounds(1000, 300, 200, 60);
                        inventory.setBounds(1000, 600, 200, 60);



                        second.add(changeCode);
                        second.add(withdrawal);
                        second.add(transfer);
                        second.add(inventory);

                        JButton Back1 = new JButton("Back");
                        Back1.setBounds( 609,700 , 109,50 );

                        second.add(Back1);
                        Back1.addActionListener(new ActionListener (){

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                ATM.setVisible(true);
                                second.setVisible(false);

                            }});
                        second.setVisible(true);

                        changeCode. addActionListener(new ActionListener (){

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                second.setVisible(false);
                                JFrame  secondCode =new JFrame("ATM");
                                secondCode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                secondCode.setLayout(null);
                                secondCode.setSize(1300 ,860 );

                                JLabel l3= new JLabel("Enter your new code");
                                l3.setBounds( 700,370, 200,35);
                                JTextField f1 =  new JTextField();
                                f1.setBounds(600 , 430, 350 , 40);
                                JButton record1 =new JButton ("Record") ;
                                record1.setBounds(700 ,600 , 90,50 );

                                secondCode.add(record1);
                                secondCode.add(l3);
                                secondCode.add(f1);
                                JButton Back2 = new JButton("Back");
                                Back2.setBounds( 700,500 , 109,50 );

                                secondCode.add(Back2);
                                Back2.addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        secondCode.setVisible(false);
                                        second.setVisible(true);

                                    }});

                                secondCode.setVisible(true);



                                record1. addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        secondCode.setVisible(false);
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JLabel mission = new JLabel(" mission accomplished ");
                                        mission.setBounds(650, 430, 200, 40);
                                        result.add(mission);
                                        result.setVisible(true);


                                    }});

                            }});
                        inventory. addActionListener(new ActionListener (){

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                second.setVisible(false);
                                JFrame left= new JFrame("ATM");
                                left.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                left.setLayout(null);
                                left.setSize(1300 ,860 );
                                JLabel pol= new JLabel("Your account balance is 100");
                                pol.setBounds( 650,430 ,500 ,50 );


                                left.add(pol);
                                JButton Back2 = new JButton("Back");
                                Back2.setBounds( 670,500 , 109,50 );

                                left.add(Back2);
                                Back2.addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        left.setVisible(false);
                                        second.setVisible(true);

                                    }});



                                left.setVisible(true);





                            }});

                        transfer. addActionListener(new ActionListener (){

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                second.setVisible(false);
                                JFrame card= new JFrame("ATM");
                                card.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                card.setLayout(null);
                                card.setSize(1300 ,860 );
                                JLabel number =new JLabel("Enter the price you would like to transfer   ");
                                number.setBounds( 650 ,300 ,200 ,40 );
                                JLabel price =new   JLabel("Enter the destination card  ");
                                price.setBounds(650  ,500 ,200 ,40 );

                                JTextField number1 =new JTextField();
                                number1.setBounds( 650 ,380 ,200 ,40 );
                                JTextField price1 =new JTextField();
                                price1.setBounds(650  ,580 ,200 ,40 );

                                JButton record1 =new JButton("Record");
                                record1.setBounds( 650 ,680 ,200 ,40 );


                                card.add(record1);
                                card.add(number1);
                                card.add(price1);
                                card.add(number);
                                card.add(price);
                                JButton Back3 = new JButton("Back");
                                Back3.setBounds( 700,200 , 109,50 );

                                card.add(Back3);
                                Back3.addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        card.setVisible(false);
                                        second.setVisible(true);

                                    }});
                                card.setVisible(true);
                                record1. addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        card.setVisible(false);
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JLabel mission = new JLabel(" mission accomplished ");
                                        mission.setBounds(650, 430, 200, 40);
                                        result.add(mission);
                                        result.setVisible(true);


                                    }});

                            }});

                        withdrawal. addActionListener(new ActionListener (){


                            @Override
                            public void actionPerformed(ActionEvent e) {
                                second.setVisible(false);
                                JFrame g =new JFrame("ATM");
                                g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                g.setLayout(null);
                                g.setSize(1300 ,860 );
                                JButton o =new JButton(" 1000000");
                                o.setBounds( 0,300 , 150,40);
                                JButton u =new JButton(" 2000000");
                                u.setBounds(1150,300 ,150 ,40);
                                JButton l =new JButton(" 1500000");
                                l.setBounds( 1150,400 ,150 ,40);
                                JButton b =new JButton(" 500000 ");
                                b.setBounds( 0, 400,150 ,40);

                                g.add(o);
                                g.add(u);
                                g.add(l);
                                g.add(b);
                                JButton Back5 = new JButton("Back");
                                Back5.setBounds( 620,500 , 109,50 );

                                g.add(Back5);
                                Back5.addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        g.setVisible(false);
                                        second.setVisible(true);

                                    }});

                                g.setVisible(true);
                                o. addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        g.setVisible(false);
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JLabel mission = new JLabel(" mission accomplished ");
                                        mission.setBounds(650, 430, 200, 40);
                                        result.add(mission);
                                        result.setVisible(true);


                                    }});
                                u. addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        g.setVisible(false);
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JLabel mission = new JLabel(" mission accomplished ");
                                        mission.setBounds(650, 430, 200, 40);
                                        result.add(mission);
                                        result.setVisible(true);


                                    }});
                                l. addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        g.setVisible(false);
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JLabel mission = new JLabel(" mission accomplished ");
                                        mission.setBounds(650, 430, 200, 40);
                                        result.add(mission);
                                        result.setVisible(true);


                                    }});
                                b. addActionListener(new ActionListener (){


                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        g.setVisible(false);
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JLabel mission = new JLabel(" mission accomplished ");
                                        mission.setBounds(650, 430, 200, 40);
                                        result.add(mission);
                                        result.setVisible(true);


                                    }});



                            }});







                    }});















            }});

        farsi.addActionListener(new ActionListener (){

            @Override
            public void actionPerformed(ActionEvent e) {
                ATM.setVisible(false);
                JFrame first = new JFrame("first");
                first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                first.setLayout(null);
                first.setSize(1300, 860);
                JLabel code = new JLabel ("رمز را وارد کنید") ;
                code.setBounds( 700,300 ,350 ,40 );
                first.add(code);

                JTextField digit = new JTextField();
                digit.setBounds( 600 , 430, 350 , 40);
                first.add(digit);
                first.setVisible(true);
                JButton record = new JButton("ثبت");
                record.setBounds( 700 ,600 , 109,50 );
                first.add(record);
                JButton Back = new JButton("بازگشت");
                Back.setBounds( 300,600 , 109,50 );

                first.add(Back);
                Back.addActionListener(new ActionListener (){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        first.setVisible(false);
                        ATM.setVisible(true);

                    }});
                record.addActionListener(new ActionListener (){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        first.setVisible(false);
                        JFrame second = new JFrame("second");
                        second.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        second.setLayout(null);
                        second.setSize(1300, 860);
                        JButton changeCode = new JButton(" تغییر رمز");
                        JButton withdrawal = new JButton(" برداشت موجودی");
                        JButton transfer = new JButton  ("کارت به کارت");
                        JButton inventory = new JButton("اعلام موجودی");
                        changeCode.setBounds(100, 300, 200, 60);
                        withdrawal.setBounds(75, 600, 200, 60);
                        transfer.setBounds(1000, 300, 200, 60);
                        inventory.setBounds(1000, 600, 200, 60);



                        second.add(changeCode);
                        second.add(withdrawal);
                        second.add(transfer);
                        second.add(inventory);

                        JButton Back1 = new JButton("بازگشت");
                        Back1.setBounds( 609,700 , 109,50 );

                        second.add(Back1);
                        Back1.addActionListener(new ActionListener (){

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                ATM.setVisible(true);
                                second.setVisible(false);

                            }});
                        second.setVisible(true);

                        changeCode. addActionListener(new ActionListener (){

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                second.setVisible(false);
                                JFrame  secondCode =new JFrame("ATM");
                                secondCode.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                secondCode.setLayout(null);
                                secondCode.setSize(1300 ,860 );

                                JLabel l3= new JLabel("رمز جدید را وارد کنید");
                                l3.setBounds( 700,370, 200,35);
                                JTextField f1 =  new JTextField();
                                f1.setBounds(600 , 430, 350 , 40);
                                JButton record1 =new JButton ("ثبت") ;
                                record1.setBounds(700 ,600 , 90,50 );

                                secondCode.add(record1);
                                secondCode.add(l3);
                                secondCode.add(f1);
                                JButton Back2 = new JButton("بازگشت");
                                Back2.setBounds( 700,500 , 109,50 );

                                secondCode.add(Back2);
                                Back2.addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        secondCode.setVisible(false);
                                        second.setVisible(true);

                                    }});

                                secondCode.setVisible(true);



                                record1. addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        secondCode.setVisible(false);
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JLabel mission = new JLabel("عملیات موفقیت امیز بود");
                                        mission.setBounds(650, 430, 200, 40);
                                        result.add(mission);
                                        result.setVisible(true);


                                    }});

                            }});
                        inventory. addActionListener(new ActionListener (){

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                second.setVisible(false);
                                JFrame left= new JFrame("ATM");
                                left.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                left.setLayout(null);
                                left.setSize(1300 ,860 );
                                JLabel pol= new JLabel("Your account balance is 100");
                                pol.setBounds( 650,430 ,500 ,50 );


                                left.add(pol);
                                JButton Back2 = new JButton("بازگشت");
                                Back2.setBounds( 670,500 , 109,50 );

                                left.add(Back2);
                                Back2.addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        left.setVisible(false);
                                        second.setVisible(true);

                                    }});



                                left.setVisible(true);





                            }});

                        transfer. addActionListener(new ActionListener (){

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                second.setVisible(false);
                                JFrame card= new JFrame("ATM");
                                card.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                card.setLayout(null);
                                card.setSize(1300 ,860 );
                                JLabel number =new JLabel("مبلغ مورد نظر را وارد کنید ");
                                number.setBounds( 650 ,300 ,200 ,40 );
                                JLabel price =new   JLabel("کارت مقصد را وارد کنید  ");
                                price.setBounds(650  ,500 ,200 ,40 );

                                JTextField number1 =new JTextField();
                                number1.setBounds( 650 ,380 ,200 ,40 );
                                JTextField price1 =new JTextField();
                                price1.setBounds(650  ,580 ,200 ,40 );

                                JButton record1 =new JButton("ثبت");
                                record1.setBounds( 650 ,680 ,200 ,40 );


                                card.add(record1);
                                card.add(number1);
                                card.add(price1);
                                card.add(number);
                                card.add(price);
                                JButton Back3 = new JButton("بازگشت");
                                Back3.setBounds( 700,200 , 109,50 );

                                card.add(Back3);
                                Back3.addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        card.setVisible(false);
                                        second.setVisible(true);

                                    }});
                                card.setVisible(true);
                                record1. addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        card.setVisible(false);
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JLabel mission = new JLabel(" عملیات موفقیت امیز بود");
                                        mission.setBounds(650, 430, 200, 40);
                                        result.add(mission);
                                        result.setVisible(true);


                                    }});

                            }});

                        withdrawal. addActionListener(new ActionListener (){


                            @Override
                            public void actionPerformed(ActionEvent e) {
                                second.setVisible(false);
                                JFrame g =new JFrame("ATM");
                                g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                g.setLayout(null);
                                g.setSize(1300 ,860 );
                                JButton o =new JButton(" 1000000");
                                o.setBounds( 0,300 , 150,40);
                                JButton u =new JButton(" 2000000");
                                u.setBounds(1150,300 ,150 ,40);
                                JButton l =new JButton(" 1500000");
                                l.setBounds( 1150,400 ,150 ,40);
                                JButton b =new JButton(" 500000 ");
                                b.setBounds( 0, 400,150 ,40);

                                g.add(o);
                                g.add(u);
                                g.add(l);
                                g.add(b);
                                JButton Back5 = new JButton("بازگشت");
                                Back5.setBounds( 620,500 , 109,50 );

                                g.add(Back5);
                                Back5.addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        g.setVisible(false);
                                        second.setVisible(true);

                                    }});

                                g.setVisible(true);
                                o. addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        g.setVisible(false);
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JLabel mission = new JLabel(" عملیات موفقیت امیز بود ");
                                        mission.setBounds(650, 430, 200, 40);
                                        result.add(mission);
                                        result.setVisible(true);


                                    }});
                                u. addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        g.setVisible(false);
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JLabel mission = new JLabel(" عملیات موفقیت امیز بود ");
                                        mission.setBounds(650, 430, 200, 40);
                                        result.add(mission);
                                        result.setVisible(true);


                                    }});
                                l. addActionListener(new ActionListener (){

                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        g.setVisible(false);
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JLabel mission = new JLabel(" عملیات موفقیت امیز بود ");
                                        mission.setBounds(650, 430, 200, 40);
                                        result.add(mission);
                                        result.setVisible(true);


                                    }});
                                b. addActionListener(new ActionListener (){


                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        g.setVisible(false);
                                        JFrame result = new JFrame("ATM");
                                        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                        result.setLayout(null);
                                        result.setSize(1300, 860);
                                        JLabel mission = new JLabel(" عملیات موفقیت امیز بود ");
                                        mission.setBounds(650, 430, 200, 40);
                                        result.add(mission);
                                        result.setVisible(true);


                                    }});



                            }});


                    }});

            }});


        ATM.setVisible(true);

    }
}