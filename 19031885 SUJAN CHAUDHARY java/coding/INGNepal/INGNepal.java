 import javax.swing.JFrame;
import java.awt.EventQueue; 
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.Event;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
public class INGNepal{
    ArrayList<StaffHire> abc = new ArrayList<StaffHire>();
    private JFrame Frame;
    
    private JPanel panel1,panel2,panel3;
    private JButton btn1;
    private JButton btn2;
    private JButton btnclear;
    private JButton btnclear2;
    private JButton btnappoint;
    private JButton btnappoint2;

    private JButton btnsubmit;
    private JButton btnsubmit2;

    private JButton btndisplay;
    private JButton btndisplay2;
    private JButton btnterminate;

    private JButton btnBack1,btnBack2;

    private JTextField tfvacancy1,tfdesignation,tfjobType,tfworkingHour,tfsalary,tfvacancy2,tfstaffName,tfjoiningDate,tfappointedBy,tfqualification,tfwagesPerHour,tfshifts,tfvacancy3;
    private JLabel lbl1,lbl2,lbvacancy1,lbdesignation,lbjobType,lbworkingHour,lbsalary,lbvacancy2,lbstaffName,lbjoiningDate,lbappointedBy,lbqualification,lbwagesPerHour,lbshifts,lbvacancy3;
    public INGNepal(){
        initializeFrame();
        initializeMenu();
        initializeBody();
    }

    private void initializeFrame(){
        Frame = new JFrame("INGNepal");
        Frame.setBounds(0,0,900,700);
        Frame.setLayout(null);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setResizable(false);
    }

    private void initializeMenu(){
        JMenuBar file = new JMenuBar();
        file.setBounds(0,0,1095,26);
        Frame.getContentPane().add(file);
        JMenu mfile = new JMenu("File");
        file.add(mfile);
        JMenuItem minew = new JMenuItem("New");
        mfile.add(minew);
        mfile.addSeparator();
        minew.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                    tfvacancy1.setText(null);
                    tfdesignation.setText(null);
                    tfjobType.setText(null);
                    tfworkingHour.setText(null);
                    tfsalary.setText(null);
                    tfvacancy2.setText(null);
                    tfstaffName.setText(null);
                    tfjoiningDate.setText(null);
                    tfappointedBy.setText(null);
                    tfqualification.setText(null);
                    tfwagesPerHour.setText(null);
                    tfshifts.setText(null);

            }
        });
        JMenuItem miexit= new JMenuItem("Exit");
        mfile.add(miexit);
        miexit.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae) {
                    System.exit(0);
                };
            });

        JMenu mabout= new JMenu("About");
        file.add(mabout);

        JMenuItem miapp = new JMenuItem("App");
        mabout.add(miapp);
        miapp.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(Frame, "App:version 2.0","App",JOptionPane.INFORMATION_MESSAGE);
                };
            });

        JMenuItem mideveloper = new JMenuItem("Developer");
        mabout.add(mideveloper);     
        mabout.addSeparator();
        mideveloper.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    JOptionPane.showMessageDialog(Frame, "App is desingned by sujan chaudhary","Developer",JOptionPane.INFORMATION_MESSAGE);
                };
            });
    }

    private void initializeBody(){
        panel1=new JPanel();
        Frame.add(panel1);
        panel1.setSize(900,700);
        panel1.setLayout(null);

        btn1=new JButton("FullTimeStaffHire");
        btn1.setBounds(300,250,200,50);
        panel1.add(btn1);
        btn1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    panel1.setVisible(false);
                    forFullTimeStaffHire();

                }
        });

        btn2=new JButton("PartTimeStaffHire");
        btn2.setBounds(300,350,200,50);
        panel1.add(btn2);
        btn2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    panel1.setVisible(false);
                    forPartTimeStaffHire();

                }
            });
    }

    public void forFullTimeStaffHire(){
        panel2=new JPanel();
        Frame.add(panel2);
        panel2.setSize(900,700);
        panel2.setLayout(null);

        lbvacancy1 = new JLabel("Vacancy number:");
        panel2.add(lbvacancy1);
        lbdesignation = new JLabel("Designation:");
        panel2.add(lbdesignation);
        lbjobType = new JLabel("Job type:");
        panel2.add(lbjobType);
        lbsalary = new JLabel("Salary:");
        panel2.add(lbsalary);
        lbworkingHour = new JLabel("WorkingHours:");
        panel2.add(lbworkingHour);
        lbvacancy2 = new JLabel("Vacancy Number:");
        panel2.add(lbvacancy2);
        lbstaffName = new JLabel("Staff Name");
        panel2.add(lbstaffName);
        lbjoiningDate = new JLabel("Joining Date:");
        panel2.add(lbjoiningDate);
        lbappointedBy = new JLabel("Appointed by:");
        panel2.add(lbappointedBy);
        lbqualification = new JLabel("Qualification:");
        panel2.add(lbqualification);
        lbl1 = new JLabel("For Full Time Staff");
        panel2.add(lbl1);
        
        tfvacancy1 = new JTextField();
        panel2.add(tfvacancy1);
        tfdesignation = new JTextField();
        panel2.add(tfdesignation);
        tfjobType= new JTextField();
        panel2.add(tfjobType);
        tfsalary = new JTextField();
        panel2.add(tfsalary);
        tfworkingHour = new JTextField();
        panel2.add(tfworkingHour);
        tfvacancy2 = new JTextField();
        panel2.add(tfvacancy2);
        tfstaffName= new JTextField();
        panel2.add(tfstaffName);
        tfjoiningDate = new JTextField();
        panel2.add(tfjoiningDate);
        tfappointedBy = new JTextField();
        panel2.add(tfappointedBy);
        tfqualification = new JTextField();
        panel2.add(tfqualification);
        
        
        lbl1.setBounds(350,50,150,50);
        lbvacancy1.setBounds(50,100,100,40);
        lbdesignation.setBounds(50,150,100,40);
        lbjobType.setBounds(50,200,100,40);
        lbsalary.setBounds(50,250,100,40);
        lbworkingHour.setBounds(50,300,100,40);
        lbvacancy2.setBounds(450,100,100,40);
        lbstaffName.setBounds(450,150,100,40);
        lbjoiningDate.setBounds(450,200,100,40);
        lbappointedBy.setBounds(450,250,100,40);
        lbqualification.setBounds(450,300,100,40);

        tfvacancy1.setBounds(150,105,170,30);
        tfdesignation.setBounds(150,155,170,30);
        tfjobType.setBounds(150,205,170,30);
        tfsalary.setBounds(150,255,170,30);
        tfworkingHour.setBounds(150,305,170,30);
        tfvacancy2.setBounds(550,105,170,30);
        tfstaffName.setBounds(550,155,170,30);
        tfjoiningDate.setBounds(550,205,170,30);
        tfappointedBy.setBounds(550,255,170,30);
        tfqualification.setBounds(550,305,170,30);

        btnclear = new JButton("clear");
        panel2.add(btnclear);
        btnclear.setBounds(50,405,100,40);
        btnclear.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    btnclear.setText("cleared");
                    tfvacancy1.setText(null);
                    tfdesignation.setText(null);
                    tfjobType.setText(null);
                    tfworkingHour.setText(null);
                    tfsalary.setText(null);
                    tfvacancy2.setText(null);
                    tfstaffName.setText(null);
                    tfjoiningDate.setText(null);
                    tfappointedBy.setText(null);
                    tfqualification.setText(null);

                };
        });

        btnsubmit = new JButton("submit");
        panel2.add(btnsubmit);
        btnsubmit.setBounds(50,450,100,40);
        btnsubmit.addActionListener(new ActionListener(){
                public  void actionPerformed(ActionEvent ae){
                    submit();
                };
            });

        btnappoint = new JButton("Appoint");
        panel2.add(btnappoint);
        btnappoint.setBounds(600,405,100,40);
        btnappoint.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    appoint();
                };
            });

        btnBack1=new JButton("Back");
        btnBack1.setBounds(350,430,100,40);
        panel2.add(btnBack1);
        btnBack1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    panel1.setVisible(true);
                    panel2.setVisible(false);

                };
            });

        btndisplay=new JButton("Display");
        panel2.add(btndisplay);
        btndisplay.setBounds(600,450,100,40);
        btndisplay.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    display();
                }
            });
    }

    public void submit(){
        int vc= 0,wh= 0,sy= 0;
        String designation = tfdesignation.getText();
        String jobType = tfjobType.getText();
        String vacancyNumber= tfvacancy1.getText();
        String workingHour= tfworkingHour.getText();
        String salary= tfsalary.getText();
        if(vacancyNumber.trim().equals("")||designation.trim().equals("")||jobType.trim().equals("")||workingHour.trim().equals("")||salary.trim().equals("")){
            JOptionPane.showMessageDialog(Frame, "please fill all the fields", "error",0);
        }else{
            try{
                vc = Integer.parseInt(vacancyNumber);
                wh = Integer.parseInt(workingHour);
                sy = Integer.parseInt(salary);
            }catch(NumberFormatException e){
                 JOptionPane.showMessageDialog(Frame, "give correct input.","error",0);
                return;

            }
            for(StaffHire s: abc){
                if(s instanceof FullTimeStaffHire){
                    FullTimeStaffHire ft= (FullTimeStaffHire) s;
                    if(ft.getVacancyNumber()== vc){
                        JOptionPane.showMessageDialog(Frame, "give same vacancy no.","error",0);
                        return;
                    }else{      

                    }
                }
            }
            
            FullTimeStaffHire full=new FullTimeStaffHire(vc,sy,wh,designation,jobType);
            abc.add(full);
            JOptionPane.showMessageDialog(Frame, "Succuessfully added.");
        }
    }

    public void appoint(){
        int vc=0;
        String staffName = tfstaffName.getText();
        String joiningDate = tfjoiningDate.getText();
        String qualification = tfqualification.getText();
        String appointedBy = tfappointedBy.getText();
        String vacancyNumber = tfvacancy2.getText();
        if(staffName.trim().equals("")||joiningDate.trim().equals("")||qualification.trim().equals("")||appointedBy.trim().equals("")||vacancyNumber.trim().equals("")){
            JOptionPane.showMessageDialog(Frame, "please fill all the fields", "error",0);
        }else{

            try{
                vc = Integer.parseInt(vacancyNumber);

            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(Frame, "give correct input.","error",0);
                return;
            }
            boolean found= false;
            for(int i = 0; i < abc.size(); ++i){
                StaffHire sh= abc.get(i);
                if(sh instanceof FullTimeStaffHire) {
                    FullTimeStaffHire full = (FullTimeStaffHire) sh;
                    if(full.getVacancyNumber()==vc){
                        full.hireFullTimeStaff (staffName,joiningDate,qualification,appointedBy);
                        JOptionPane.showMessageDialog(Frame, "Succuessfully appointed.");
                        found= true;
                        break;
                    }
                }  
            }
            if(!found){
                JOptionPane.showMessageDialog(Frame, "vacancy number not found.","error",0);
            } 
        }
    }

    public void display(){
        for(StaffHire hire: abc){
            if(hire instanceof FullTimeStaffHire){
                FullTimeStaffHire full = (FullTimeStaffHire) hire;
                full.display();
            }
            
        }
    }

    public void forPartTimeStaffHire(){
        panel3=new JPanel();
        Frame.add(panel3);
        panel3.setSize(900,700);
        panel3.setLayout(null);

        lbvacancy1 = new JLabel("Vacancy number:");
        panel3.add(lbvacancy1);

        lbdesignation = new JLabel("Designation:");
        panel3.add(lbdesignation);

        lbjobType = new JLabel("Job type:");
        panel3.add(lbjobType);

        lbwagesPerHour = new JLabel("WagesPerHour:");
        panel3.add(lbwagesPerHour);

        lbworkingHour = new JLabel("WorkingHours:");
        panel3.add(lbworkingHour);

        lbshifts = new JLabel("shifts:");
        panel3.add(lbshifts);

        lbvacancy2 = new JLabel("Vacancy Number:");
        panel3.add(lbvacancy2);
        
        lbstaffName = new JLabel("Staffname:");
        panel3.add(lbstaffName);

        lbjoiningDate = new JLabel("Joining Date:");
        panel3.add(lbjoiningDate);

        lbappointedBy = new JLabel("Appointed by:");
        panel3.add(lbappointedBy);

        
        lbqualification = new JLabel("Qualification:");
        panel3.add(lbqualification);

        lbl2 = new JLabel("For Part Time Staff");
        panel3.add(lbl2);
       

        tfvacancy1 = new JTextField();
        panel3.add(tfvacancy1);
        
        tfdesignation = new JTextField();
        panel3.add(tfdesignation);
        
        tfjobType= new JTextField();
        panel3.add(tfjobType);
        
        tfwagesPerHour= new JTextField();
        panel3.add(tfwagesPerHour);
        
        tfworkingHour = new JTextField();
        panel3.add(tfworkingHour);
        
        tfshifts = new JTextField();
        panel3.add(tfshifts);
        
        tfvacancy2 = new JTextField();
        panel3.add(tfvacancy2);
        
        tfstaffName= new JTextField();
        panel3.add(tfstaffName);
        
        tfjoiningDate = new JTextField();
        panel3.add(tfjoiningDate);
        
        tfappointedBy = new JTextField();
        panel3.add(tfappointedBy);
        
        tfqualification = new JTextField();
        panel3.add(tfqualification);

        lbvacancy3= new JLabel("vacancy:");
        panel3.add(lbvacancy3);
        lbvacancy3.setBounds(200,500,170,30);
        tfvacancy3 = new JTextField();
        panel3.add(tfvacancy3);
        tfvacancy3.setBounds(300,500,170,30);
        // bounding for labels
        lbl2.setBounds(350,50,150,50);
        lbvacancy1.setBounds(50,100,100,40);
        lbdesignation.setBounds(50,150,100,40);
        lbjobType.setBounds(50,200,100,40);
        lbwagesPerHour.setBounds(50,250,100,40);
        lbworkingHour.setBounds(50,300,100,40);
        lbshifts.setBounds(50,350,100,40);
        lbvacancy2.setBounds(450,100,100,40);
        lbstaffName.setBounds(450,150,100,40);
        lbjoiningDate.setBounds(450,200,100,40);
        lbappointedBy.setBounds(450,250,100,40);
        lbqualification.setBounds(450,300,100,40);
        //bounding for text field
        tfvacancy1.setBounds(150,105,170,30);
        tfdesignation.setBounds(150,155,170,30);
        tfjobType.setBounds(150,205,170,30);
        tfwagesPerHour.setBounds(150,305,170,30);
        tfworkingHour.setBounds(150,255,170,30);
        tfshifts.setBounds(150,355,170,30);
        tfvacancy2.setBounds(550,105,170,30);
        tfstaffName.setBounds(550,155,170,30);
        tfjoiningDate.setBounds(550,205,170,30);
        tfappointedBy.setBounds(550,255,170,30);
        tfqualification.setBounds(550,305,170,30);

        btnclear2 = new JButton("clear");
        panel3.add(btnclear2);
        btnclear2.setBounds(50,405,100,40);
        btnclear2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    clear1();
                }

                public void clear1(){
                    btnclear.setText("cleared");
                    tfvacancy1.setText(null);
                    tfdesignation.setText(null);
                    tfshifts.setText(null);
                    tfwagesPerHour.setText(null);
                    tfworkingHour.setText(null);
                    tfjobType.setText(null);
                    tfvacancy2.setText(null);
                    tfjoiningDate.setText(null);
                    tfappointedBy.setText(null);
                    tfstaffName.setText(null);
                    tfqualification.setText(null);

                }
            });
        btnsubmit2 = new JButton("submit");
        panel3.add(btnsubmit2);
        btnsubmit2.setBounds(50,450,100,40);
        btnsubmit2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    submit1();
                };
            });

        btnBack2=new JButton("Back");
        btnBack2.setBounds(350,430,100,40);
        panel3.add(btnBack2);
        btnBack2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    panel1.setVisible(true);
                    panel3.setVisible(false);

                };

            });

        btnappoint2 = new JButton("Appoint");
        panel3.add(btnappoint2);
        btnappoint2.setBounds(600,405,100,40);
        btnappoint2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    appoint1();  
                };
            });

        btnterminate= new JButton("terminate");
        panel3.add(btnterminate);
        btnterminate.setBounds(350,600,100,40);
        btnterminate.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    terminateStaff();
                };
            });

        btndisplay2=new JButton("Display");
        panel3.add(btndisplay2);
        btndisplay2.setBounds(600,450,100,40);
        btndisplay2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    display1();
                };
            });

    }

    public void submit1(){
        int vc=0,wh=0,wp=0;
        String designation = tfdesignation.getText();
        String shifts = tfshifts.getText();
        String vacancy= tfvacancy1.getText();
        String workingHour= tfworkingHour.getText();
        String wagesPerHour= tfwagesPerHour.getText();
        String jobType= tfjobType.getText();
        if(vacancy.trim().equals("")||designation.trim().equals("")||jobType.trim().equals("")||workingHour.trim().equals("")||wagesPerHour.trim().equals("")||shifts.trim().equals("")){
            JOptionPane.showMessageDialog(Frame, "please fill all the fields", "error",0);
        }else{
            try{
                vc = Integer.parseInt(vacancy);
                wh = Integer.parseInt(workingHour);
                wp = Integer.parseInt(wagesPerHour);

            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(Frame, "give correct input.","error",0);
                return;

            }
            for(StaffHire s: abc){
                if(s instanceof PartTimeStaffHire){
                    PartTimeStaffHire pt= (PartTimeStaffHire) s;
                    if(pt.getVacancyNumber()== vc){
                        JOptionPane.showMessageDialog(Frame, "give same vacancy no.","error",0);
                        return;
                    }else{ 
                    }
                }
            }

            PartTimeStaffHire part= new PartTimeStaffHire(vc,designation,shifts,wp,wh,jobType);
            abc.add(part);
            JOptionPane.showMessageDialog(Frame, "Succuessfully added.");
        }
    }

    public void appoint1(){
        int vc=0;
        String staffName = tfstaffName.getText();
        String joiningDate = tfjoiningDate.getText();
        String qualification = tfqualification.getText();
        String appointedBy = tfappointedBy.getText();
        String vacancyNumber = tfvacancy2.getText();
        if(staffName.trim().equals("")||joiningDate.trim().equals("")||qualification.trim().equals("")||appointedBy.trim().equals("")||vacancyNumber.trim().equals("")){
            JOptionPane.showMessageDialog(Frame, "please fill all the fileds","error",0);
        }else{
            try{
                vc = Integer.parseInt(vacancyNumber);

            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(Frame, "give correct input.");
                return;
            }
            boolean found= true;
            for(int i = 0; i < abc.size(); i++){
                StaffHire sh= abc.get(i);
                if(sh instanceof PartTimeStaffHire) {
                    PartTimeStaffHire part = (PartTimeStaffHire) sh;
                    if(part.getVacancyNumber()==vc){
                        part.hirePartTimeStaff (staffName,joiningDate,qualification,appointedBy);
                        JOptionPane.showMessageDialog(Frame, "Succuessfully appointed.");
                        found= true;
                        break;

                    }
                }
            }
            if(!found){
                JOptionPane.showMessageDialog(Frame, "vacancy number not found.", "error", 0);
            }
        }
    }

    

    public void terminateStaff(){
        int vc=0;
        String vacancyNumber= tfvacancy3.getText();
        if(vacancyNumber.trim().equals("")){
            JOptionPane.showMessageDialog(Frame,"please fill all the field", "error",0);
        }else{
            try{
                vc = Integer.parseInt(vacancyNumber);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(Frame,"please give data in correct format", "error",0);
                return;
            }
            boolean found= false;
                for(StaffHire sh: abc){
                    if(sh instanceof PartTimeStaffHire){
                        PartTimeStaffHire pt= (PartTimeStaffHire)sh;
                        if(sh.getVacancyNumber()==vc){
                            pt.terminateStaff();
                            abc.remove(pt);
                            JOptionPane.showMessageDialog(Frame,"successfully terminated.");
                            found = true;
                            return;
                        }

                    }
                }
                
            if(!found){
                JOptionPane.showMessageDialog(Frame,"vacancy number not found", "error",0);
            }
        }
    }

    public void display1(){
        for(StaffHire hire: abc){
            if(hire instanceof PartTimeStaffHire){
                PartTimeStaffHire part = (PartTimeStaffHire) hire;
                part.display();
            }
        }
    }

    public static  void main(String []args){
        new INGNepal().Frame.setVisible(true);
    }
}

