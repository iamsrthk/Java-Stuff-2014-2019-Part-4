import java.io.*;
public class proj_trial_2
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);

    String book[]={"Anna Karenina                                     ", 
            "The Picture of Dorian Gray                        ", 
            "The Metamorphosis                                 ", 
            "The Stories of Anton Chekhov                      ", 
            "The Adventures of Huckleberry Finn                ", 
            "Lolita                                            ", 
            "The Great Gatsby                                  ", 
            "Hamlet                                            ", 
            "The Idiot                                         ", 
            "In Search Of Lost Time                            ", 
            "And Then There Were None....                      ",
            "The Collected Sherlock Holmes Short Stories       ", 
            "Daughter of Time                                  ", 
            "The Big Sleep                                     ", 
            "Murder on the Orient Express                      ", 
            "The Nine Tailors                                  ", 
            "In Cold Blood                                     ", 
            "The Godfather                                     ", 
            "The Woman in White                                ",
            "The Silence of the Lambs                          ", 
            "The Book Thief                                    ", 
            "The Hunger Games                                  ", 
            "Catching Fire                                     ", 
            "Mockingjay                                        ", 
            "The Curious Incident of the Dog in the Night-Time ", 
            "The Fault in Our Stars                            ", 
            "The Da Vinci Code                                 ", 
            "Fight Club                                        ", 
            "The Kite Runner                                   ", 
            "Angels and Demons                                 ", 
            "The Wolf of Wall Street                           ", 
            "In Spite of the Gods                              ", 
            "The Secret                                        ", 
            "Diary of a Young Girl                             ", 
            "The Universe in a Nutshell                        ", 
            "A Brief History of Time                           ", 
            "Rich Dad, Poor Dad                                ", 
            "Cosmos                                            ", 
            "Tao Te Ching                                      ", 
            "Diaries of Franz Kafka                            ", 
            "Complete Adventures of Tintin                     ", 
            "Tintin in the Land of the Soviets                 ", 
            "Tintin in Congo                                   ", 
            "Tintin and Alph-Art                               ", 
            "Dragon Ball                                       ", 
            "V for Vendetta                                    ", 
            "The Killing Joke                                  ", 
            "Sin City                                          ", 
            "The Dark Knight Returns                           ", 
            "Maus                                              ", 
            "Chinatown                                         ", 
            "Pulp Fiction                                      ", 
            "The Godfather                                     ", 
            "Goodfellas                                        ", 
            "Django Unchained                                  ", 
            "The Dark Knight                                   ", 
            "Apocalypse Now                                    ", 
            "Casablanca                                        ", 
            "Inglourious Basterds                              "};
    String auth[]={"Leo Tolstoy            ", 
            "Oscar Wilde            ", 
            "Franz Kafka            ", 
            "Anton Chekhov          ", 
            "Mark Twain             ", 
            "Vladimir Nabokov       ", 
            "F. Scott Fitzgerald    ", 
            "William Shakespeare    ", 
            "Fyodor Dostoyevsky     ", 
            "Marcel Proust          ",     
            "Agatha Christie        ", 
            "Arthur Conan Doyle     ", 
            "Josephine Tey          ",   
            "Raymond Chandler       ", 
            "Agatha Christie        ", 
            "Dorothy L. Sayers      ", 
            "Truman Capote          ",    
            "Mario Puzo             ", 
            "Wilkie Collins         ", 
            "Thomas Harris          ", 
            "Markus Zusak           ", 
            "Suzanne Collins        ", 
            "Suzanne Collins        ", 
            "Suzanne Collins        ", 
            "Mark Haddon            ", 
            "John Green             ", 
            "Dan Brown              ", 
            "Chuck Palahniuk        ", 
            "Khaled Hosseini        ", 
            "Dan Brown              ", 
            "Jordan Belfort         ", 
            "Edward Luce            ", 
            "Rhonda Byrne           ", 
            "Anne Frank             ", 
            "Stephen Hawking        ", 
            "Stephen Hawking        ", 
            "Robert Kiyosaki        ", 
            "Carl Sagan             ", 
            "Laozi                  ", 
            "Franz Kafka            ", 
            "Hergé                  ", 
            "Hergé                  ",
            "Hergé                  ", 
            "Hergé                  ", 
            "Akira Tokiyama         ", 
            "Alan Moore             ", 
            "Alan Moore             ", 
            "Frank Miller           ", 
            "Frank Miller           ", 
            "Art Spiegelman         ", 
            "Robert Towne           ",
            "Quentin Tarantino      ", 
            "Mario Puzo             ", 
            "Martin Scorsese        ", 
            "Quentin Tarantino      ",
            "Jonathan Nolan         ", 
            "Francis Ford Coppola   ", 
            "Howard E. Koch         ", 
            "Quentin Tarentino      "};
    double bookcost[]={350, 450, 300, 450, 250, 200, 500, 650, 450, 350, 300, 450, 400, 350, 300, 400, 550, 520, 480, 450,300, 400, 350, 250, 350, 300, 400, 200, 250, 270, 460, 340, 290, 420, 280, 450, 400, 350, 300, 380,400, 450, 500, 480, 390, 320, 330, 300, 280, 350, 300, 400, 450, 470, 420, 250, 390, 280, 370};
    double booQ[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    String booktrans[]=new String[60];
    double bookcosttrans[]=new double[60];
    int transB=0;

    String movie[]={"Cast Away                         ", 
            "Avatar                            ", 
            "Indiana Jones and the Last Crusade", 
            "The Dark Knight                   ", 
            "Die Hard                          ", 
            "Saving Private Ryan               ",
            "Apocalypse Now                    ", 
            "Fight Club                        ", 
            "The Avengers                      ", 
            "Inglourious Basterds              ", 
            "Casablanca                        ", 
            "Citizen Kane                      ", 
            "Chinatown                         ", 
            "Django Unchained                  ", 
            "Good Will Hunting                 ", 
            "The Hurt Locker                   ", 
            "The Godfather                     ", 
            "Pulp Fiction                      ", 
            "One Flew Over The Cuckoo's Nest   ", 
            "The Departed                      ", 
            "Taxi Driver                       ", 
            "The Silence of the Lambs          ", 
            "Saw                               ", 
            "The Exorcist                      ", 
            "Shutter Island                    ",
            "The Shining                       ", 
            "Jaws                              ", 
            "The Conjuring                     ", 
            "Silver Linings Playbook           ", 
            "American Hustle                   ", 
            "Young Frankenstein                ", 
            "Snatch                            ", 
            "The Wolf of Wall Street           ", 
            "Bucket List                       ", 
            "Goodfellas                        ",
            "Interstellar                      ", 
            "The Matrix                        ", 
            "2001 : A Space Odyssey            ", 
            "Inception                         ", 
            "The Terminator                    ", 
            "Blade Runner                      ", 
            "Back to the Future                ", 
            "Star Wars                         "};
    //String dir[];
    //String cast[];
    double rating[]={8.0, 8.2, 8.3, 8.9, 8.1, 8.5, 8.5, 8.9, 8.2, 8.4, 8.6, 8.4, 8.5, 8.5, 8.2, 8.6, 9.5, 9.2, 8.7, 8.6, 8.3, 8.4, 8.0, 8.5, 8.5, 8.4, 8.2, 8.0, 7.9, 8.1, 8.0, 8.5, 8.4, 7.8, 8.3, 8.6, 8.4, 8.3, 8.8, 8.3, 8.2, 8.1, 8.5};
    double moviecost[]={500,600,500,400,600,400,300,700,500,300,400,500,600,700,800,300,400,500,600,500,500,600,400,500,500,500,400,300,700,600,600,500,500,400,500,600,700,700,700,600,600,500,300};
    String movietrans[]=new String[43];
    double moviecosttrans[]=new double[43];
    int movieQ[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int transM=0;

    String tech[]={"iPhone 6            ",  
            "iPhone 6 Plus       ", 
            "Nexus 6             ", 
            "Nexus 5             ", 
            "Galaxy S5           ", 
            "Xperia Z3           ", 
            "Moto X              ", 
            "G3                  ", 
            "Galaxy Note 4       ", 
            "Desire Eye          ", 
            "iPad mini 2         ", 
            "Surface Pro 3       ", 
            "G Pad 8.3           ", 
            "iPad Air 2          ", 
            "Fire HDX 8.9        ", 
            "Galaxy Tab S 10.5   ", 
            "Nexus 7             ", 
            "MacBook Air(13 inch)", 
            "Chromebook 11       ", 
            "Flex 2              ", 
            "Stream 13           ", 
            "XPS 13              ", 
            "Aspire E1-510P      ", 
            "ThinkPad T440P      ", 
            "Alienware 17        ", 
            "QuietComfort 25     ", 
            "Momentum            ", 
            "QuietComfort 15     ", 
            "ATH-M50             ", 
            "SRH1540             ", 
            "ANC9                ", 
            "Destiny TTR         ", 
            "Halo 2              ", 
            "Plattan             ", 
            "Zik                 "};
    String techo[]={"Apple          ", "Apple          ", "Google         ", "Google         ", "Samsung        ", "Sony           ", "Motorola       ", "LG             ", "Samsung        ", "HTC            ", "Apple          ", "Microsoft      ", "LG             ", "Apple          ", "Amazon         ", "Samsung        ", "Google         ", "Apple          ", "HP             ", "Lenovo         ", "HP             ", "Dell           ", "Acer           ", "Lenovo         ", "Dell           ", "Bose           ", "Sennheiser     ", "Bose           ", "Audio Technica ", "Shure          ", "Audio Technica ", "House of Marley", "Jabra          ", "Urbanears      ", "Parrot         "};
    double techost[]={53500, 62500, 44000, 30000, 52000, 50000, 32000, 55000, 61500, 42000, 28000, 63000, 25000, 35900, 22000, 43900, 24000, 72000, 18000, 50000, 29500, 40500, 31500, 70000, 1887000, 19000, 24900, 19000, 15500, 31000, 19700, 25600, 6500, 6200, 30200};
    String techtrans[]=new String[35];
    double techosttrans[]=new double[35];
    String techotrans[]=new String[35];
    int transT=0;
    double teQ[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    //static int pid[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60};

    int c1=0;
    int c2;
    int c3;
    int c4;
    int trans=0;

    int out=0;
    int out2=0;
    int out3 = 0;
    int out4 = 0;
    int out5 = 0;

    double cost=0;

    int custcode=300;

    int tcustcode[]=new int[15];
    String tname[]=new String[15];
    double tcost[]=new double[15];
    int index=0;

    public static void mainshop() throws IOException
    {
        proj_trial_2 ob = new proj_trial_2();
        ob.main();
        ob.exit();
    }

    public void main()throws IOException
    {   
        c1=0;
        int w=0;

        do
        {
            System.out.println("\f");
            vortex();
            System.out.println("\n    1. Shop Books");
            System.out.println("\n    2. Shop Movies");
            System.out.println("\n    3. Shop Tech");
            System.out.println("\n    4. Bill");
            System.out.println("\n    5. New customer");  
            System.out.println("\n    6. Reports");
            System.out.println("\n    7. Exit");
            System.out.print("\n\n   Enter your choice ---> ");
            c1=Integer.parseInt(in.readLine());

            switch(c1)
            {
                case 1:
                books();
                break;

                case 2:
                movies();
                break;

                case 3:
                tech();
                break;

                case 4:                
                bill();
                break;

                case 5:
                custcode++;
                System.out.println("New customer code -----> "+custcode);
                break;

                case 6:
                reports();
                break;

                case 7:
                w=0;
                out=1;
                //exit();

                break;

                default:
                System.out.println("Invalid choice entered");
            }

            if(out==0)
            {
                System.out.println("press 1 to remain in main menu");
                w=Integer.parseInt(in.readLine());
            }
        }while(w==1);

    }

    void vortex()
    {
        System.out.println("\f------------------------------------------------------------------------------------ ");
        System.out.println("  ++    ++ ++++++ ++++  ++++++  +       +    xx   xx xx      xxxx  xxxxx ™       ");
        System.out.println("   +    +  +    + +   +    + +++++     +     x x x x x x     x   x   x           ");
        System.out.println("   +   +   +    + ++++     + +    +   +      x  x  x x  x    xxxx    x           ");
        System.out.println("   +  +    +    + ++       + +++    +        x     x xxxxx   xx      x           ");
        System.out.println("   + +     +    + + +      + +    +   +      x     x x    x  x x     x           ");
        System.out.println("   +       ++++++ +  +     + +++++     +     x     xxx    xx x  x    x           ");
        System.out.println("------------------------------------------------------------------------------------      ");
        System.out.println("----------------------------------------------------------------------------------------- ");
    }

    void vbooks()
    {
        System.out.println("\f-------------------------------------------------");
        System.out.println("  ++++  ++++ ++++ +  +  +++ ");
        System.out.println("  +   + +  + +  + + +  +    ");
        System.out.println("  ++++  +  + +  + ++   +++  ");
        System.out.println("  +   + +  + +  + + +     + ");
        System.out.println("  ++++  ++++ ++++ +  + +++  ");
        System.out.println("-------------------------------------------------------");
    }

    void vmovies()
    {
        System.out.println("\f----------------------------------------------------");
        System.out.println("  ++   ++ ++++ ++   ++ +++++ ++++  +++ ");
        System.out.println("  + + + + +  +  +   +    +   +    +    ");
        System.out.println("  +  +  + +  +  +  +     +   +++  +++  ");
        System.out.println("  +     + +  +  + +      +   +       + ");
        System.out.println("  +     + ++++  +      +++++ ++++ +++  ");
        System.out.println("-----------------------------------------------------------");
    }

    void vgadgets()
    {
        System.out.println("\f---------------------------------------------------");
        System.out.println("  +++++ ++++ ++++ +  + ");
        System.out.println("    +   +    +    +  + ");
        System.out.println("    +   +++  +    ++++ ");
        System.out.println("    +   +    +    +  + ");
        System.out.println("    +   ++++ ++++ +  + ");
        System.out.println("----------------------------------------------------------");
    }

    void books()throws IOException
    {
        int w2=0;
        do
        {
            System.out.println("\f");
            vbooks();
            System.out.println("\n   1. Classics");
            System.out.println("   2. Crime and Mystery");
            System.out.println("   3. Contemporary fiction and Young-adult");
            System.out.println("   4. Non-fiction and Science");
            System.out.println("   5. Graphic Novels");
            System.out.println("   6. Scripts and Black Comedies");
            System.out.println("   7. Exit");
            System.out.print("\n      Enter your choice ---> ");
            c2=Integer.parseInt(in.readLine());

            switch(c2)
            {
                case 1:
                classics();
                break;

                case 2:
                crimystery();
                break;

                case 3:
                contempy();
                break;

                case 4:
                nonsci();
                break;

                case 5:
                graphic();
                break;

                case 6:
                scripts();
                break;

                case 7 :
                out2 = 1;
                w2 = 0;
                break;

                default:
                System.out.println("Invalid choice entered");
            }

            if(out2==0)
            {
                System.out.println("Press 1 to remain in Book Menu");
                w2 = Integer.parseInt(in.readLine());
            }

        }while(w2==1);
    }

    void classics()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch1="";
        String ch2="";
        String ch3="";
        String ch4="";
        boolean flag=false;
        double qt=0;
        int g=0;
        do
        {
            g=0;
            System.out.println("\f");
            vbooks();
            System.out.println("\n  ————————————————————————————————————————————————————————————");
            System.out.println("  |Sr. no | Book name                                         |Author                 |Cost(in Rs.)  |");
            System.out.println("  ————————————————————————————————————————————————————————————");
            for(int i=0;i<10;i++)
            {
                if(i<9)
                {
                    System.out.println("  |  "+k+".   | "+book[i]+"|"+auth[i]+"|"+bookcost[i]+"         |");
                    //System.out.println(k+". Book : "+book[i]);
                    //System.out.println("   Cost : Rs."+bookcost[i]);
                    k++;
                }
                else
                {
                    System.out.println("  | "+k+".   | "+book[i]+"|"+auth[i]+"|"+bookcost[i]+"         |");
                }
            }

            System.out.println("  ————————————————————————————————————————————————————————————");

            k=1;

            System.out.print("\n   Do you wish to buy any of the above books? (Enter Y -or- anything else)--->");

            ch1=in.readLine();

            if(ch1.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                System.out.print("\n   Enter the serial number of the book you want to buy ---> ");
                g=0;
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vbooks();
                System.out.print("\n   Do you wish to buy '"+(book[c-1].trim())+"'? (Enter Y -or- anything else)---> ");
                ch2=in.readLine();

                if(ch2.equalsIgnoreCase("y"))
                {
                    System.out.print("\n   Hardcover or Paperback?(Enter H -or- anything else)---> ");
                    ch2=in.readLine();

                    g=0;

                    System.out.print("\n   How many books do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    x=0;
                }
                else
                {
                    //System.out.print("\n  Do you want to exit to book menu or main menu?(Enter B -or- anything else) ---> ");
                    //ch3=in.readLine();

                    t=1;
                    x=1;

                    if(ch3.equalsIgnoreCase("b"))
                    {
                        t=1;
                        //books();
                        break;
                    }
                    else
                    {
                        t=1;
                        //main();
                        break;
                    }
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(ch2.equalsIgnoreCase("H"))
                        {
                            booktrans[transB]=book[c-1];
                            bookcosttrans[transB]=((bookcost[c-1]+(bookcost[c-1]*0.5))*qt);
                            booQ[transB]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= booktrans[transB];
                            tcost[index]=bookcosttrans[transB];
                            transB++;
                        }
                        else
                        {
                            booktrans[transB]=book[c-1];
                            bookcosttrans[transB]=(bookcost[c-1]*qt);
                            booQ[transB]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= booktrans[transB];
                            tcost[index]=bookcosttrans[transB];
                            transB++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+booktrans[transB-1].trim()+"' by "+auth[c-1].trim()+" at Rs. "+bookcosttrans[transB-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n    Do you want to buy any other book? (Enter Y -or- anything else)---> ");
                        ch4=in.readLine();

                        if(ch4.equalsIgnoreCase("y"))
                        {
                            //books();
                            t=0;
                            //break;
                        }
                        else
                        {
                            //main();
                            t=1;
                            //break;
                        }
                    }
                }
                else
                {
                    t=0;
                    //break;
                }

            }
            else
            {
                //main();
                t=1;
                //break;
            }

        }while(t==0);
        //main();
    }

    void crimystery()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch1="";
        String ch2="";
        String ch3="";
        String ch4="";
        boolean flag=false;
        double qt=0;
        int g=0;
        do
        {
            g=0;
            System.out.println("\f");
            vbooks();
            System.out.println("\n  ————————————————————————————————————————————————————————————");
            System.out.println("  |Sr. no | Book name                                         |Author                 |Cost(in Rs.)  |");
            System.out.println("  ————————————————————————————————————————————————————————————");
            for(int i=10;i<20;i++)
            {
                if(i<19)
                {
                    System.out.println("  |  "+k+".   | "+book[i]+"|"+auth[i]+"|"+bookcost[i]+"         |");
                    //System.out.println(k+". Book : "+book[i]);
                    //System.out.println("   Cost : Rs."+bookcost[i]);
                    k++;
                }
                else
                {
                    System.out.println("  | "+k+".   | "+book[i]+"|"+auth[i]+"|"+bookcost[i]+"         |");
                }
            }

            System.out.println("  ————————————————————————————————————————————————————————————");

            k=1;

            System.out.print("\n   Do you wish to buy any of the above books? (Enter Y -or- anything else)--->");

            ch1=in.readLine();

            if(ch1.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                System.out.print("\n   Enter the serial number of the book you want to buy ---> ");
                g=0;
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vbooks();
                System.out.print("\n   Do you wish to buy '"+(book[c+9].trim())+"'? (Enter Y -or- anything else)---> ");
                ch2=in.readLine();

                if(ch2.equalsIgnoreCase("y"))
                {
                    System.out.print("\n   Hardcover or Paperback?(Enter H -or- anything else)---> ");
                    ch2=in.readLine();

                    g=0;

                    System.out.print("\n   How many books do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    x=0;
                }
                else
                {
                    //System.out.print("\n  Do you want to exit to book menu or main menu?(Enter B -or- anything else) ---> ");
                    //ch3=in.readLine();

                    t=1;
                    x=1;

                    if(ch3.equalsIgnoreCase("b"))
                    {
                        t=1;
                        //books();
                        break;
                    }
                    else
                    {
                        t=1;
                        //main();
                        break;
                    }
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(ch2.equalsIgnoreCase("H"))
                        {
                            booktrans[transB]=book[c+9];
                            bookcosttrans[transB]=((bookcost[c+9]+(bookcost[c+9]*0.5))*qt);
                            booQ[transB]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= booktrans[transB];
                            tcost[index]=bookcosttrans[transB];
                            transB++;
                        }
                        else
                        {
                            booktrans[transB]=book[c+9];
                            bookcosttrans[transB]=(bookcost[c+9]*qt);
                            booQ[transB]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= booktrans[transB];
                            tcost[index]=bookcosttrans[transB];
                            transB++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+booktrans[transB-1].trim()+"' by "+auth[c+9].trim()+" at Rs. "+bookcosttrans[transB-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n    Do you want to buy any other book? (Enter Y -or- anything else)---> ");
                        ch4=in.readLine();

                        if(ch4.equalsIgnoreCase("y"))
                        {
                            //books();
                            t=0;
                            break;
                        }
                        else
                        {
                            //main();
                            t=1;
                            break;
                        }
                    }
                }
                else
                {
                    t=0;
                    break;
                }

            }
            else
            {
                //main();
                t=1;
                break;
            }
        }while(t==0);

        //main();
    }

    void contempy()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch1="";
        String ch2="";
        String ch3="";
        String ch4="";
        boolean flag=false;
        double qt=0;
        int g=0;
        do
        {
            g=0;
            System.out.println("\f");
            vbooks();
            System.out.println("\n  ————————————————————————————————————————————————————————————");
            System.out.println("  |Sr. no | Book name                                         |Author                 |Cost(in Rs.)  |");
            System.out.println("  ————————————————————————————————————————————————————————————");
            for(int i=20;i<30;i++)
            {
                if(i<29)
                {
                    System.out.println("  |  "+k+".   | "+book[i]+"|"+auth[i]+"|"+bookcost[i]+"         |");
                    //System.out.println(k+". Book : "+book[i]);
                    //System.out.println("   Cost : Rs."+bookcost[i]);
                    k++;
                }
                else
                {
                    System.out.println("  | "+k+".   | "+book[i]+"|"+auth[i]+"|"+bookcost[i]+"         |");
                }
            }

            System.out.println("  ————————————————————————————————————————————————————————————");

            k=1;

            System.out.print("\n   Do you wish to buy any of the above books? (Enter Y -or- anything else)--->");

            ch1=in.readLine();

            if(ch1.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                System.out.print("\n   Enter the serial number of the book you want to buy ---> ");
                g=0;
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vbooks();
                System.out.print("\n   Do you wish to buy '"+(book[c+19].trim())+"'? (Enter Y -or- anything else)---> ");
                ch2=in.readLine();

                if(ch2.equalsIgnoreCase("y"))
                {
                    System.out.print("\n   Hardcover or Paperback?(Enter H -or- anything else)---> ");
                    ch2=in.readLine();

                    g=0;

                    System.out.print("\n   How many books do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    x=0;
                }
                else
                {
                    //System.out.print("\n  Do you want to exit to book menu or main menu?(Enter B -or- anything else) ---> ");
                    //ch3=in.readLine();

                    t=1;
                    x=1;

                    if(ch3.equalsIgnoreCase("b"))
                    {
                        t=1;
                        //books();
                        //break;
                    }
                    else
                    {
                        t=1;
                        //main();
                        break;
                    }
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(ch2.equalsIgnoreCase("H"))
                        {
                            booktrans[transB]=book[c+19];
                            bookcosttrans[transB]=((bookcost[c+19]+(bookcost[c+19]*0.5))*qt);
                            booQ[transB]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= booktrans[transB];
                            tcost[index]=bookcosttrans[transB];
                            transB++;
                        }
                        else
                        {
                            booktrans[transB]=book[c+19];
                            bookcosttrans[transB]=(bookcost[c+19]*qt);
                            booQ[transB]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= booktrans[transB];
                            tcost[index]=bookcosttrans[transB];
                            transB++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+booktrans[transB-1].trim()+"' by "+auth[c+19].trim()+" at Rs. "+bookcosttrans[transB-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n    Do you want to buy any other book? (Enter Y -or- anything else)---> ");
                        ch4=in.readLine();

                        if(ch4.equalsIgnoreCase("y"))
                        {
                            //books();
                            //t=0;
                            break;
                        }
                        else
                        {
                            //main();
                            //t=1;
                            break;
                        }
                    }
                }
                else
                {
                    //t=0;
                    break;
                }

            }
            else
            {
                //main();
                //t=1;
                break;
            }
        }while(t==0);

        //main();
    }

    void nonsci()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch1="";
        String ch2="";
        String ch3="";
        String ch4="";
        boolean flag=false;
        double qt=0;
        int g=0;
        do
        {
            g=0;
            System.out.println("\f");
            vbooks();
            System.out.println("\n  ————————————————————————————————————————————————————————————");
            System.out.println("  |Sr. no | Book name                                         |Author                 |Cost(in Rs.)  |");
            System.out.println("  ————————————————————————————————————————————————————————————");
            for(int i=30;i<40;i++)
            {
                if(i<39)
                {
                    System.out.println("  |  "+k+".   | "+book[i]+"|"+auth[i]+"|"+bookcost[i]+"         |");
                    //System.out.println(k+". Book : "+book[i]);
                    //System.out.println("   Cost : Rs."+bookcost[i]);
                    k++;
                }
                else
                {
                    System.out.println("  | "+k+".   | "+book[i]+"|"+auth[i]+"|"+bookcost[i]+"         |");
                }
            }

            System.out.println("  ————————————————————————————————————————————————————————————");

            k=1;

            System.out.print("\n   Do you wish to buy any of the above books? (Enter Y -or- anything else)--->");

            ch1=in.readLine();

            if(ch1.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                System.out.print("\n   Enter the serial number of the book you want to buy ---> ");
                g=0;
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vbooks();
                System.out.print("\n   Do you wish to buy '"+(book[c+29].trim())+"'? (Enter Y -or- anything else)---> ");
                ch2=in.readLine();

                if(ch2.equalsIgnoreCase("y"))
                {
                    System.out.print("\n   Hardcover or Paperback?(Enter H -or- anything else)---> ");
                    ch2=in.readLine();

                    g=0;

                    System.out.print("\n   How many books do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    x=0;
                }
                else
                {
                    //System.out.print("\n  Do you want to exit to book menu or main menu?(Enter B -or- anything else) ---> ");
                    //ch3=in.readLine();

                    t=1;
                    x=1;

                    if(ch3.equalsIgnoreCase("b"))
                    {
                        t=1;
                        //books();
                        break;
                    }
                    else
                    {
                        t=1;
                        //main();
                        break;
                    }
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(ch2.equalsIgnoreCase("H"))
                        {
                            booktrans[transB]=book[c+29];
                            bookcosttrans[transB]=((bookcost[c+29]+(bookcost[c+29]*0.5))*qt);
                            booQ[transB]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= booktrans[transB];
                            tcost[index]=bookcosttrans[transB];
                            transB++;
                        }
                        else
                        {
                            booktrans[transB]=book[c+29];
                            bookcosttrans[transB]=(bookcost[c+29]*qt);
                            booQ[transB]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= booktrans[transB];
                            tcost[index]=bookcosttrans[transB];
                            transB++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+booktrans[transB-1].trim()+"' by "+auth[c+29].trim()+" at Rs. "+bookcosttrans[transB-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n    Do you want to buy any other book? (Enter Y -or- anything else)---> ");
                        ch4=in.readLine();

                        if(ch4.equalsIgnoreCase("y"))
                        {
                            //books();
                            //t=0;
                            break;
                        }
                        else
                        {
                            //main();
                            //t=1;
                            break;
                        }
                    }
                }
                else
                {
                    //t=0;
                    break;
                }

            }
            else
            {
                //main();
                //t=1;
                break;
            }
        }while(t==0);

        //main();
    }

    void graphic()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch1="";
        String ch2="";
        String ch3="";
        String ch4="";
        boolean flag=false;
        double qt=0;
        int g=0;
        do
        {
            g=0;
            System.out.println("\f");
            vbooks();
            System.out.println("\n  ————————————————————————————————————————————————————————————");
            System.out.println("  |Sr. no | Book name                                         |Author                 |Cost(in Rs.)  |");
            System.out.println("  ————————————————————————————————————————————————————————————");
            for(int i=40;i<50;i++)
            {
                if(i<49)
                {
                    System.out.println("  |  "+k+".   | "+book[i]+"|"+auth[i]+"|"+bookcost[i]+"         |");
                    //System.out.println(k+". Book : "+book[i]);
                    //System.out.println("   Cost : Rs."+bookcost[i]);
                    k++;
                }
                else
                {
                    System.out.println("  | "+k+".   | "+book[i]+"|"+auth[i]+"|"+bookcost[i]+"         |");
                }
            }

            System.out.println("  ————————————————————————————————————————————————————————————");

            k=1;

            System.out.print("\n   Do you wish to buy any of the above books? (Enter Y -or- anything else)--->");

            ch1=in.readLine();

            if(ch1.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                System.out.print("\n   Enter the serial number of the book you want to buy ---> ");
                g=0;
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vbooks();
                System.out.print("\n   Do you wish to buy '"+(book[c+39].trim())+"'? (Enter Y -or- anything else)---> ");
                ch2=in.readLine();

                if(ch2.equalsIgnoreCase("y"))
                {
                    System.out.print("\n   Hardcover or Paperback?(Enter H -or- anything else)---> ");
                    ch2=in.readLine();

                    g=0;

                    System.out.print("\n   How many books do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    x=0;
                }
                else
                {
                    //System.out.print("\n  Do you want to exit to book menu or main menu?(Enter B -or- anything else) ---> ");
                    //ch3=in.readLine();

                    t=1;
                    x=1;

                    if(ch3.equalsIgnoreCase("b"))
                    {
                        t=1;
                        //books();
                        break;
                    }
                    else
                    {
                        t=1;
                        //main();
                        break;
                    }
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(ch2.equalsIgnoreCase("H"))
                        {
                            booktrans[transB]=book[c+39];
                            bookcosttrans[transB]=((bookcost[c+39]+(bookcost[c+39]*0.5))*qt);
                            booQ[transB]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= booktrans[transB];
                            tcost[index]=bookcosttrans[transB];

                            transB++;
                        }
                        else
                        {
                            booktrans[transB]=book[c+39];
                            bookcosttrans[transB]=(bookcost[c+39]*qt);
                            booQ[transB]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= booktrans[transB];
                            tcost[index]=bookcosttrans[transB];
                            transB++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+booktrans[transB-1].trim()+"' by "+auth[c+39].trim()+" at Rs. "+bookcosttrans[transB-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n    Do you want to buy any other book? (Enter Y -or- anything else)---> ");
                        ch4=in.readLine();

                        if(ch4.equalsIgnoreCase("y"))
                        {
                            //books();
                            //t=0;
                            break;
                        }
                        else
                        {
                            //main();
                            //t=1;
                            break;
                        }
                    }
                }
                else
                {
                    //t=0;
                    break;
                }

            }
            else
            {
                //main();
                //t=1;
                break;
            }
        }while(t==0);

        //main();
    }

    void scripts()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch1="";
        String ch2="";
        String ch3="";
        String ch4="";
        boolean flag=false;
        double qt=0;
        int g=0;
        do
        {
            g=0;
            System.out.println("\f");
            vbooks();
            System.out.println("\n  ————————————————————————————————————————————————————————————");
            System.out.println("  |Sr. no | Book name                                         |Author                 |Cost(in Rs.)  |");
            System.out.println("  ————————————————————————————————————————————————————————————");
            for(int i=50;i<59;i++)
            {
                System.out.println("  |  "+k+".   | "+book[i]+"|"+auth[i]+"|"+bookcost[i]+"         |");
                k++;
            }

            System.out.println("  ————————————————————————————————————————————————————————————");

            k=1;

            System.out.print("\n   Do you wish to buy any of the above books? (Enter Y -or- anything else)--->");

            ch1=in.readLine();

            if(ch1.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                System.out.print("\n   Enter the serial number of the book you want to buy ---> ");
                g=0;
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vbooks();
                System.out.print("\n   Do you wish to buy '"+(book[c+49].trim())+"'? (Enter Y -or- anything else)---> ");
                ch2=in.readLine();

                if(ch2.equalsIgnoreCase("y"))
                {
                    System.out.print("\n   Hardcover or Paperback?(Enter H -or- anything else)---> ");
                    ch2=in.readLine();

                    g=0;

                    System.out.print("\n   How many books do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    x=0;
                }
                else
                {
                    //System.out.print("\n  Do you want to exit to book menu or main menu?(Enter B -or- anything else) ---> ");
                    //ch3=in.readLine();

                    t=1;
                    x=1;

                    if(ch3.equalsIgnoreCase("b"))
                    {
                        t=1;
                        //books();
                        break;
                    }
                    else
                    {
                        t=1;
                        //main();
                        break;
                    }
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(ch2.equalsIgnoreCase("H"))
                        {
                            booktrans[transB]=book[c+49];
                            bookcosttrans[transB]=((bookcost[c+49]+(bookcost[c+49]*0.5))*qt);
                            booQ[transB]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= booktrans[transB];
                            tcost[index]=bookcosttrans[transB];
                            transB++;
                        }
                        else
                        {
                            booktrans[transB]=book[c+49];
                            bookcosttrans[transB]=(bookcost[c+49]*qt);
                            booQ[transB]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= booktrans[transB];
                            tcost[index]=bookcosttrans[transB];
                            transB++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+booktrans[transB-1].trim()+"' by "+auth[c+49].trim()+" at Rs. "+bookcosttrans[transB-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n    Do you want to buy any other book? (Enter Y -or- anything else)---> ");
                        ch4=in.readLine();

                        if(ch4.equalsIgnoreCase("y"))
                        {
                            //books();
                            //t=0;
                            break;
                        }
                        else
                        {
                            //main();
                            //t=1;
                            break;
                        }
                    }
                }
                else
                {
                    //t=0;
                    break;
                }

            }
            else
            {
                //main();
                //t=1;
                break;
            }
        }while(t==0);

        //main();
    }

    void movies()throws IOException
    {
        int w3=0;
        do
        {
            System.out.println("\f");
            vmovies();
            System.out.println("\n   1. Action and Adventure");
            System.out.println("   2. Drama and Black Comedy");
            System.out.println("   3. Thriller and Horror");
            System.out.println("   4. Musical and Comedy");
            System.out.println("   5. Sci-fi");
            System.out.println("   6. Exit");
            System.out.print("\n    Enter your choice ---> ");
            c3=Integer.parseInt(in.readLine());

            switch(c3)
            {
                case 1:
                acture();
                break;

                case 2:
                drama();
                break;

                case 3:
                throll();
                break;

                case 4:
                com();
                break;

                case 5:
                sci();
                break;

                case 6:
                w3 = 0;
                out3 = 1 ;
                break;

                default:
                System.out.println("Invalid choice entered");
            }

            if(out3 == 0 )
            {
                System.out.println("Press 1 to remain in Movies Menu");
                w3=Integer.parseInt(in.readLine());
            }

        }while(w3==1);
    }

    void acture()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch="";
        int q=0;
        boolean flag=false;
        int qt=0;
        int g=0;
        do
        {
            System.out.println("\f");
            vmovies();
            System.out.println("\n  ——————————————————————————————————————");
            System.out.println("  |Sr. no | Movie name                        |Rating   |Cost   |");
            System.out.println("  ——————————————————————————————————————");
            for(int i=0;i<10;i++)
            {
                if(i<9)
                {
                    System.out.println("  |  "+k+".   | "+movie[i]+"|"+rating[i]+"      |"+moviecost[i]+"  |");
                    //System.out.println(k+". movie : "+movie[i]);
                    //System.out.println("   Cost : Rs."+moviecost[i]);
                    k++;
                }
                else
                {
                    System.out.println("  | "+k+".   | "+movie[i]+"|"+rating[i]+"      |"+moviecost[i]+"  |");
                }
            }

            System.out.println("  ——————————————————————————————————————");

            k=1;

            System.out.print("\n  Do you wish to buy any of the above movies? (Enter Y -or- anything else)--->");
            ch=in.readLine();

            if(ch.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                g=0;
                System.out.print("\n  Enter the serial number of the movie you want to buy ---> ");
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vmovies();
                System.out.print("\n  Do you wish to buy '"+(movie[c-1].trim())+"'? (Enter Y -or- anything else)---> ");
                ch=in.readLine();

                if(ch.equalsIgnoreCase("y"))
                {
                    System.out.println("\n What quality do you want? :-");
                    System.out.println("\n  1. DVD");
                    System.out.println("  2. Blu-Ray");
                    System.out.println("  3. Blu-Ray 3D");
                    System.out.print("\n Enter your choice ---> ");
                    g=0;
                    while(g==0)
                    {
                        try
                        {
                            q=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    g=0;
                    System.out.print("\n  How many movies do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }
                }

                else
                {
                    x=1;
                    //movies();
                    break;
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(q==3)//if(ch.equalsIgnoreCase("H"))
                        {
                            movietrans[transM]=movie[c-1];
                            moviecosttrans[transM]=((moviecost[c-1]+1000)*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }

                        else if(q==2)
                        {
                            movietrans[transM]=movie[c-1];
                            moviecosttrans[transM]=((moviecost[c-1]+500)*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }

                        else
                        {
                            movietrans[transM]=movie[c-1];
                            moviecosttrans[transM]=(moviecost[c-1]*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+movietrans[transM-1].trim()+"' at Rs. "+moviecosttrans[transM-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n  Do you want to buy any other movie? (Enter Y -or- anything else)---> ");
                        ch=in.readLine();

                        if(ch.equalsIgnoreCase("y"))
                        {
                            t=1;
                            //movies();
                            break;
                        }
                        else
                        {
                            t=1;
                            //main();
                        }
                    }
                    else
                    {
                        t=1;
                    }
                }
                else
                {
                    t=1;
                    //main();
                }
            }
            else
            {
                t=1;
                //main();
                break;
            }
        }while(t==0);
        //main();
    }

    void drama()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch="";
        int q=0;
        boolean flag=false;
        int qt=0;
        int g=0;
        do
        {
            System.out.println("\f");
            vmovies();
            System.out.println("\n  ——————————————————————————————————————");
            System.out.println("  |Sr. no | Movie name                        |Rating   |Cost   |");
            System.out.println("  ——————————————————————————————————————");
            for(int i=10;i<19;i++)
            {

                System.out.println("  |  "+k+".   | "+movie[i]+"|"+rating[i]+"      |"+moviecost[i]+"  |");
                //System.out.println(k+". movie : "+movie[i]);
                //System.out.println("   Cost : Rs."+moviecost[i]);
                k++;

            }

            System.out.println("  ——————————————————————————————————————");

            k=1;

            System.out.print("\n  Do you wish to buy any of the above movies? (Enter Y -or- anything else)--->");
            ch=in.readLine();

            if(ch.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                g=0;
                System.out.print("\n  Enter the serial number of the movie you want to buy ---> ");
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vmovies();
                System.out.print("\n  Do you wish to buy '"+(movie[c+9].trim())+"'? (Enter Y -or- anything else)---> ");
                ch=in.readLine();

                if(ch.equalsIgnoreCase("y"))
                {
                    System.out.println("\n What quality do you want? :-");
                    System.out.println("\n  1. DVD");
                    System.out.println("  2. Blu-Ray");
                    System.out.println("  3. Blu-Ray 3D");
                    System.out.print("\n Enter your choice ---> ");
                    g=0;
                    while(g==0)
                    {
                        try
                        {
                            q=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    g=0;
                    System.out.print("\n  How many movies do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }
                }

                else
                {
                    x=1;
                    //movies();
                    break;
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(q==3)//if(ch.equalsIgnoreCase("H"))
                        {
                            movietrans[transM]=movie[c+9];
                            moviecosttrans[transM]=((moviecost[c+9]+1000)*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }

                        else if(q==2)
                        {
                            movietrans[transM]=movie[c+9];
                            moviecosttrans[transM]=((moviecost[c+9]+500)*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }

                        else
                        {
                            movietrans[transM]=movie[c+9];
                            moviecosttrans[transM]=(moviecost[c+9]*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+movietrans[transM-1].trim()+"' at Rs. "+moviecosttrans[transM-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n  Do you want to buy any other movie? (Enter Y -or- anything else)---> ");
                        ch=in.readLine();

                        if(ch.equalsIgnoreCase("y"))
                        {
                            t=1;
                            //movies();
                            break;
                        }
                        else
                        {
                            t=1;
                            //main();
                            break;
                        }
                    }
                    else
                    {
                        t=1;
                    }
                }
                else
                {
                    t=1;
                    //main();
                    break;
                }
            }
            else
            {
                t=1;
                //main();
                break;
            }
        }while(t==0);
        //main();
    }

    void throll()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch="";
        int q=0;
        boolean flag=false;
        int qt=0;
        int g=0;
        do
        {
            System.out.println("\f");
            vmovies();
            System.out.println("\n  ——————————————————————————————————————");
            System.out.println("  |Sr. no | Movie name                        |Rating   |Cost   |");
            System.out.println("  ——————————————————————————————————————");
            for(int i=19;i<28;i++)
            {

                System.out.println("  |  "+k+".   | "+movie[i]+"|"+rating[i]+"      |"+moviecost[i]+"  |");
                k++;

            }

            System.out.println("  ——————————————————————————————————————");

            k=1;

            System.out.print("\n  Do you wish to buy any of the above movies? (Enter Y -or- anything else)--->");
            ch=in.readLine();

            if(ch.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                g=0;
                System.out.print("\n  Enter the serial number of the movie you want to buy ---> ");
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vmovies();
                System.out.print("\n  Do you wish to buy '"+(movie[c+18].trim())+"'? (Enter Y -or- anything else)---> ");
                ch=in.readLine();

                if(ch.equalsIgnoreCase("y"))
                {
                    System.out.println("\n What quality do you want? :-");
                    System.out.println("\n  1. DVD");
                    System.out.println("  2. Blu-Ray");
                    System.out.println("  3. Blu-Ray 3D");
                    System.out.print("\n Enter your choice ---> ");
                    g=0;
                    while(g==0)
                    {
                        try
                        {
                            q=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    g=0;
                    System.out.print("\n  How many movies do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }
                }

                else
                {
                    x=1;
                    //movies();
                    break;
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(q==3)//if(ch.equalsIgnoreCase("H"))
                        {
                            movietrans[transM]=movie[c+18];
                            moviecosttrans[transM]=((moviecost[c+18]+1000)*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }

                        else if(q==2)
                        {
                            movietrans[transM]=movie[c+18];
                            moviecosttrans[transM]=((moviecost[c+18]+500)*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }

                        else
                        {
                            movietrans[transM]=movie[c+18];
                            moviecosttrans[transM]=(moviecost[c+18]*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+movietrans[transM-1].trim()+"' at Rs. "+moviecosttrans[transM-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n  Do you want to buy any other movie? (Enter Y -or- anything else)---> ");
                        ch=in.readLine();

                        if(ch.equalsIgnoreCase("y"))
                        {
                            t=1;
                            //movies();
                            break;
                        }
                        else
                        {
                            t=1;
                            //main();
                            break;
                        }
                    }
                    else
                    {
                        t=1;
                    }
                }
                else
                {
                    t=1;
                    //main();
                    break;
                }
            }
            else
            {
                t=1;
                //main();
                break;
            }
        }while(t==0);
        //main();
    }

    void com()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch="";
        int q=0;
        boolean flag=false;
        int qt=0;
        int g=0;
        do
        {
            System.out.println("\f");
            vmovies();
            System.out.println("\n  ——————————————————————————————————————");
            System.out.println("  |Sr. no | Movie name                        |Rating   |Cost   |");
            System.out.println("  ——————————————————————————————————————");
            for(int i=28;i<35;i++)
            {

                System.out.println("  |  "+k+".   | "+movie[i]+"|"+rating[i]+"      |"+moviecost[i]+"  |");
                k++;

            }

            System.out.println("  ——————————————————————————————————————");

            k=1;

            System.out.print("\n  Do you wish to buy any of the above movies? (Enter Y -or- anything else)--->");
            ch=in.readLine();

            if(ch.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                g=0;
                System.out.print("\n  Enter the serial number of the movie you want to buy ---> ");
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vmovies();
                System.out.print("\n  Do you wish to buy '"+(movie[c+27].trim())+"'? (Enter Y -or- anything else)---> ");
                ch=in.readLine();

                if(ch.equalsIgnoreCase("y"))
                {
                    System.out.println("\n What quality do you want? :-");
                    System.out.println("\n  1. DVD");
                    System.out.println("  2. Blu-Ray");
                    System.out.println("  3. Blu-Ray 3D");
                    System.out.print("\n Enter your choice ---> ");
                    g=0;
                    while(g==0)
                    {
                        try
                        {
                            q=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    g=0;
                    System.out.print("\n  How many movies do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }
                }

                else
                {
                    x=1;
                    //movies();
                    break;
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(q==3)//if(ch.equalsIgnoreCase("H"))
                        {
                            movietrans[transM]=movie[c+27];
                            moviecosttrans[transM]=((moviecost[c+27]+1000)*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }

                        else if(q==2)
                        {
                            movietrans[transM]=movie[c+27];
                            moviecosttrans[transM]=((moviecost[c+27]+500)*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }

                        else
                        {
                            movietrans[transM]=movie[c+27];
                            moviecosttrans[transM]=(moviecost[c+27]*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+movietrans[transM-1].trim()+"' at Rs. "+moviecosttrans[transM-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n  Do you want to buy any other movie? (Enter Y -or- anything else)---> ");
                        ch=in.readLine();

                        if(ch.equalsIgnoreCase("y"))
                        {
                            t=1;
                            //movies();
                            break;
                        }
                        else
                        {
                            t=1;
                            //main();
                            break;
                        }
                    }
                    else
                    {
                        t=1;
                    }
                }
                else
                {
                    t=1;
                    //main();
                    break;
                }
            }
            else
            {
                t=1;
                //main();
                break;
            }
        }while(t==0);
        //main();
    }

    void sci()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch="";
        int q=0;
        boolean flag=false;
        int qt=0;
        int g=0;
        do
        {
            System.out.println("\f");
            vmovies();
            System.out.println("\n  ——————————————————————————————————————");
            System.out.println("  |Sr. no | Movie name                        |Rating   |Cost   |");
            System.out.println("  ——————————————————————————————————————");
            for(int i=35;i<43;i++)
            {

                System.out.println("  |  "+k+".   | "+movie[i]+"|"+rating[i]+"      |"+moviecost[i]+"  |");
                k++;

            }

            System.out.println("  ——————————————————————————————————————");

            k=1;

            System.out.print("\n  Do you wish to buy any of the above movies? (Enter Y -or- anything else)--->");
            ch=in.readLine();

            if(ch.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                g=0;
                System.out.print("\n  Enter the serial number of the movie you want to buy ---> ");
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vmovies();
                System.out.print("\n  Do you wish to buy '"+(movie[c+34].trim())+"'? (Enter Y -or- anything else)---> ");
                ch=in.readLine();

                if(ch.equalsIgnoreCase("y"))
                {
                    System.out.println("\n What quality do you want? :-");
                    System.out.println("\n  1. DVD");
                    System.out.println("  2. Blu-Ray");
                    System.out.println("  3. Blu-Ray 3D");
                    System.out.print("\n Enter your choice ---> ");
                    g=0;
                    while(g==0)
                    {
                        try
                        {
                            q=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    g=0;
                    System.out.print("\n  How many movies do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }
                }

                else
                {
                    x=1;
                    //movies();
                    break;
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(q==3)//if(ch.equalsIgnoreCase("H"))
                        {
                            movietrans[transM]=movie[c+34];
                            moviecosttrans[transM]=((moviecost[c+34]+1000)*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }

                        else if(q==2)
                        {
                            movietrans[transM]=movie[c+34];
                            moviecosttrans[transM]=((moviecost[c+34]+500)*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }

                        else
                        {
                            movietrans[transM]=movie[c+34];
                            moviecosttrans[transM]=(moviecost[c+34]*qt);
                            movieQ[transM]=qt;
                            tcustcode[index]=custcode;
                            tname[index]= movietrans[transM];
                            tcost[index]=moviecosttrans[transM];
                            transM++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+movietrans[transM-1].trim()+"' at Rs. "+moviecosttrans[transM-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n  Do you want to buy any other movie? (Enter Y -or- anything else)---> ");
                        ch=in.readLine();

                        if(ch.equalsIgnoreCase("y"))
                        {
                            t=1;
                            //movies();
                            break;
                        }
                        else
                        {
                            t=1;
                            //main();
                            break;
                        }
                    }
                    else
                    {
                        t=1;
                    }
                }
                else
                {
                    t=1;
                    //main();
                    break;
                }
            }
            else
            {
                t=1;
                //main();
                break;
            }
        }while(t==0);
        //main();
    }

    void tech()throws IOException
    {
        int w4=0;
        do
        {
            System.out.println("\f");
            vgadgets();
            System.out.println("\n  1. Mobiles");
            System.out.println("  2. Tablets");
            System.out.println("  3. Laptops");
            System.out.println("  4. Headphones");
            System.out.println("  5. Exit");
            System.out.print(" Enter your choice ---> ");
            c4=Integer.parseInt(in.readLine());
            switch(c4)
            {
                case 1:
                mobs();
                break;

                case 2:
                tabs();
                break;

                case 3:
                laps();
                break;

                case 4:
                hps();
                break;

                case 5:
                w4 = 0;
                out4 = 1;
                break;

                default:
                System.out.println("Invalid choice entered");
            }

            if(out4 == 0)
            {
                System.out.println("Press 1 to remain in Technology Menu");
                w4 = Integer.parseInt(in.readLine());
            }
        }while(w4==1);
    }

    void mobs()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch1="";
        String ch2="";
        String ch3="";
        String ch4="";
        boolean flag=false;
        double qt=0;
        int g=0;
        do
        {
            g=0;
            System.out.println("\f");
            vgadgets();
            System.out.println("\n  ————————————————————————————————————");
            System.out.println("  |Sr. no | Model               |Manufacturer   |Cost(in Rs.)|");
            System.out.println("  ————————————————————————————————————");
            for(int i=0;i<10;i++)
            {
                if(i<9)
                {
                    System.out.println("  |  "+k+".   | "+tech[i]+"|"+techo[i]+"|"+techost[i]+"     |");
                    k++;
                }
                else
                {
                    System.out.println("  | "+k+".   | "+tech[i]+"|"+techo[i]+"|"+techost[i]+"     |");
                }
            }

            System.out.println("  ————————————————————————————————————");

            k=1;

            System.out.print("\n   Do you wish to buy any of the above mobiles? (Enter Y -or- anything else)--->");

            ch1=in.readLine();

            if(ch1.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                System.out.print("\n   Enter the serial number of the mobile you want to buy ---> ");
                g=0;
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vgadgets();
                System.out.print("\n   Do you wish to buy '"+(tech[c-1].trim())+"'? (Enter Y -or- anything else)---> ");
                ch2=in.readLine();

                if(ch2.equalsIgnoreCase("y"))
                {
                    g=0;

                    System.out.print("\n   How many mobiles do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    x=0;
                }
                else
                {
                    System.out.print("\n  Do you want to exit to tech menu or main menu?(Enter T -or- anything else) ---> ");
                    ch3=in.readLine();

                    t=1;
                    x=1;

                    if(ch3.equalsIgnoreCase("t"))
                    {
                        t=1;
                        //tech();
                        break;
                    }
                    else
                    {
                        t=1;
                        //main();
                        break;
                        //break;
                    }
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(ch2.equalsIgnoreCase("y"))
                        {
                            techtrans[transT]=tech[c-1];
                            techotrans[transT]=techo[c-1];
                            techosttrans[transT]=(techost[c-1]*qt);
                            teQ[transT]=qt;
                            tcustcode[index]=custcode;
                            tname[index]=  techtrans[transT];
                            tcost[index]=techosttrans[transT];
                            transT++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+(techotrans[transT-1].trim())+" "+(techtrans[transT-1].trim())+"' at Rs. "+techosttrans[transT-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n    Do you want to buy any more tech? (Enter Y -or- anything else)---> ");
                        ch4=in.readLine();

                        if(ch4.equalsIgnoreCase("y"))
                        {
                            //tech();
                            //t=0;
                            break;
                        }
                        else
                        {
                            //main();
                            //t=1;
                            break;
                        }
                    }
                }
                else
                {
                    //t=0;
                    break;
                }

            }
            else
            {
                //main();
                //t=1;
                break;
            }
        }while(t==0);

        //main();
    }

    void tabs()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch1="";
        String ch2="";
        String ch3="";
        String ch4="";
        boolean flag=false;
        double qt=0;
        int g=0;
        do
        {
            g=0;
            System.out.println("\f");
            vgadgets();
            System.out.println("\n  ————————————————————————————————————");
            System.out.println("  |Sr. no | Model               |Manufacturer   |Cost(in Rs.)|");
            System.out.println("  ————————————————————————————————————");
            for(int i=10;i<17;i++)
            {

                System.out.println("  |  "+k+".   | "+tech[i]+"|"+techo[i]+"|"+techost[i]+"     |");
                k++;

            }

            System.out.println("  ————————————————————————————————————");

            k=1;

            System.out.print("\n   Do you wish to buy any of the above tablets? (Enter Y -or- anything else)--->");

            ch1=in.readLine();

            if(ch1.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                System.out.print("\n   Enter the serial number of the tablet you want to buy ---> ");
                g=0;
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vgadgets();
                System.out.print("\n   Do you wish to buy '"+(techo[c+9].trim())+" "+(tech[c+9].trim())+"'? (Enter Y -or- anything else)---> ");
                ch2=in.readLine();

                if(ch2.equalsIgnoreCase("y"))
                {
                    g=0;

                    System.out.print("\n   How many tabs do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    x=0;
                }
                else
                {
                    System.out.print("\n  Do you want to exit to tech menu or main menu?(Enter T -or- anything else) ---> ");
                    ch3=in.readLine();

                    t=1;
                    x=1;

                    if(ch3.equalsIgnoreCase("t"))
                    {
                        t=1;
                        //tech();
                        break;
                    }
                    else
                    {
                        t=1;
                        //main();
                        break;
                    }
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(ch2.equalsIgnoreCase("y"))
                        {
                            techtrans[transT]=tech[c+9];
                            techotrans[transT]=techo[c+9];
                            techosttrans[transT]=(techost[c+9]*qt);
                            teQ[transT]=qt;
                            tcustcode[index]=custcode;
                            tname[index]=  techtrans[transT];
                            tcost[index]=techosttrans[transT];
                            transT++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+(techotrans[transT-1].trim())+" "+(techtrans[transT-1].trim())+"' at Rs. "+techosttrans[transT-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n    Do you want to buy any more tech? (Enter Y -or- anything else)---> ");
                        ch4=in.readLine();

                        if(ch4.equalsIgnoreCase("y"))
                        {
                            //tech();
                            //t=0;
                            break;
                        }
                        else
                        {
                            //main();
                            //t=1;
                            break;
                        }
                    }
                }
                else
                {
                    //t=0;
                    break;
                }

            }
            else
            {
                //main();
                //t=1;
                break;
            }
        }while(t==0);

        //main();
    }

    void laps()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch1="";
        String ch2="";
        String ch3="";
        String ch4="";
        boolean flag=false;
        double qt=0;
        int g=0;
        do
        {
            g=0;
            System.out.println("\f");
            vgadgets();
            System.out.println("\n  ————————————————————————————————————");
            System.out.println("  |Sr. no | Model               |Manufacturer   |Cost(in Rs.)|");
            System.out.println("  ————————————————————————————————————");
            for(int i=17;i<25;i++)
            {
                if(i<24)
                {
                    System.out.println("  |  "+k+".   | "+tech[i]+"|"+techo[i]+"|"+techost[i]+"     |");
                    k++;
                }
                else
                {
                    System.out.println("  |  "+k+".   | "+tech[i]+"|"+techo[i]+"|"+techost[i]+"   |");
                }
            }

            System.out.println("  ————————————————————————————————————");

            k=1;

            System.out.print("\n   Do you wish to buy any of the above laptops? (Enter Y -or- anything else)--->");

            ch1=in.readLine();

            if(ch1.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                System.out.print("\n   Enter the serial number of the laptop you want to buy ---> ");
                g=0;
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vgadgets();
                System.out.print("\n   Do you wish to buy '"+(techo[c+16].trim())+" "+(tech[c+16].trim())+"'? (Enter Y -or- anything else)---> ");
                ch2=in.readLine();

                if(ch2.equalsIgnoreCase("y"))
                {
                    g=0;

                    System.out.print("\n   How many laptops do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    x=0;
                }
                else
                {
                    System.out.print("\n  Do you want to exit to tech menu or main menu?(Enter T -or- anything else) ---> ");
                    ch3=in.readLine();

                    t=1;
                    x=1;

                    if(ch3.equalsIgnoreCase("t"))
                    {
                        t=1;
                        //tech();
                        break;
                    }
                    else
                    {
                        t=1;
                        //main();
                        break;
                    }
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(ch2.equalsIgnoreCase("y"))
                        {
                            techtrans[transT]=tech[c+16];
                            techotrans[transT]=techo[c+16];
                            techosttrans[transT]=(techost[c+16]*qt);
                            teQ[transT]=qt;
                            tcustcode[index]=custcode;
                            tname[index]=  techtrans[transT];
                            tcost[index]=techosttrans[transT];
                            transT++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+(techotrans[transT-1].trim())+" "+(techtrans[transT-1].trim())+"' at Rs. "+techosttrans[transT-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n    Do you want to buy any more tech? (Enter Y -or- anything else)---> ");
                        ch4=in.readLine();

                        if(ch4.equalsIgnoreCase("y"))
                        {
                            //tech();
                            //t=0;
                            break;
                        }
                        else
                        {
                            //main();
                            //t=1;
                            break;
                        }
                    }
                }
                else
                {
                    //t=0;
                    break;
                }

            }
            else
            {
                //main();
                //t=1;
                break;
            }
        }while(t==0);

        //main();
    }

    void hps()throws IOException
    {
        int k=1;
        int x=0;
        int c=0;
        int t=0;
        String ch1="";
        String ch2="";
        String ch3="";
        String ch4="";
        boolean flag=false;
        double qt=0;
        int g=0;
        do
        {
            g=0;
            System.out.println("\f");
            vgadgets();
            System.out.println("\n  ————————————————————————————————————");
            System.out.println("  |Sr. no | Model               |Manufacturer   |Cost(in Rs.)|");
            System.out.println("  ————————————————————————————————————");
            for(int i=25;i<35;i++)
            {
                if(i<32)
                {
                    System.out.println("  |  "+k+".   | "+tech[i]+"|"+techo[i]+"|"+techost[i]+"     |");
                    k++;
                }
                else if(i==32||i==33)
                {
                    System.out.println("  |  "+k+".   | "+tech[i]+"|"+techo[i]+"|"+techost[i]+"      |");
                    k++;
                }
                else
                {
                    System.out.println("  | "+k+".   | "+tech[i]+"|"+techo[i]+"|"+techost[i]+"     |");
                }
            }

            System.out.println("  ————————————————————————————————————");

            k=1;

            System.out.print("\n   Do you wish to buy any of the above headphones? (Enter Y -or- anything else)--->");

            ch1=in.readLine();

            if(ch1.equalsIgnoreCase("y"))
            {
                flag=true;
            }
            else
            {
                flag=false;
            }

            if(flag==true)
            {
                System.out.print("\n   Enter the serial number of the headphones you want to buy ---> ");
                g=0;
                while(g==0)
                {
                    try
                    {
                        c=Integer.parseInt(in.readLine());
                        g=1;
                    }
                    catch(NumberFormatException e)
                    {
                        g=0;
                        System.out.print("\n Invalid input. Please enter again --->");
                    }
                }

                System.out.println("\f");
                vgadgets();
                System.out.print("\n   Do you wish to buy '"+(techo[c+24].trim())+" "+(tech[c+24].trim())+"'? (Enter Y -or- anything else)---> ");
                ch2=in.readLine();

                if(ch2.equalsIgnoreCase("y"))
                {
                    g=0;

                    System.out.print("\n   How many headphones do you want to buy? --->");
                    while(g==0)
                    {
                        try
                        {
                            qt=Integer.parseInt(in.readLine());
                            g=1;
                        }
                        catch(NumberFormatException e)
                        {
                            g=0;
                            System.out.print("\n Invalid input. Please enter again --->");
                        }
                    }

                    x=0;
                }
                else
                {
                    System.out.print("\n  Do you want to exit to tech menu or main menu?(Enter T -or- anything else) ---> ");
                    ch3=in.readLine();

                    t=1;
                    x=1;

                    if(ch3.equalsIgnoreCase("t"))
                    {
                        t=1;
                        //tech();
                        break;
                    }
                    else
                    {
                        t=1;
                        //main();
                        break;
                    }
                }

                if(x==0)
                {
                    if(qt>0)
                    {
                        if(ch2.equalsIgnoreCase("y"))
                        {
                            techtrans[transT]=tech[c+24];
                            techotrans[transT]=techo[c+24];
                            techosttrans[transT]=(techost[c+24]*qt);
                            teQ[transT]=qt;
                            tcustcode[index]=custcode;
                            tname[index]=  techtrans[transT];
                            tcost[index]=techosttrans[transT];
                            transT++;
                        }
                        index++;

                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.println("\n   Your purchase ==> '"+(techotrans[transT-1].trim())+" "+(techtrans[transT-1].trim())+"' at Rs. "+techosttrans[transT-1]);
                        System.out.println("\n  ————————————————————————————————————————————————————————————");
                        System.out.print("\n    Do you want to buy any more tech? (Enter Y -or- anything else)---> ");
                        ch4=in.readLine();

                        if(ch4.equalsIgnoreCase("y"))
                        {
                            //tech();
                            //t=0;
                            break;
                        }
                        else
                        {
                            //main();
                            //t=1;
                            break;
                        }
                    }
                }
                else
                {
                    //t=0;
                    break;
                }

            }
            else
            {
                //main();
                //t=1;
                break;
            }
        }while(t==0);

        //main();
    }

    void bill()throws IOException
    {
        System.out.print("\f");
        System.out.println("Enter customer code");
        int ccode=Integer.parseInt(in.readLine());
        double bill=0;
        boolean f=false;

        System.out.println("\n");
        System.out.println("----------------------------------------");
        for(int i=0;i<15;i++)
        {
            if(ccode==tcustcode[i])
            {
                System.out.println(tname[i]+"\t"+tcost[i]);
                bill=bill+tcost[i];
                f=true;
            }
        }

        System.out.println();
        if(f==true)
        {
            System.out.println("----------------------------------------");
            System.out.println("         Final bill ----> "+bill);
            System.out.println("----------------------------------------");
        }
        else
        {
            System.out.println("Wrong custome code");
        }
    }

    void reports()
    {
        System.out.print("\f");
        double bill=0;
        System.out.println("----------------------------------------");
        for(int i=0;i<15;i++)
        {
            System.out.println(tname[i]+"\t"+tcost[i]);
            bill=bill+tcost[i];
        }

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("         Total Income ----> "+bill);
        System.out.println("----------------------------------------");
    }

    void bill1()throws IOException
    {
        int k=1;
        int l=0;
        int g=0;
        int w5=0;

        cost=0;

        int c=0;
        System.out.println("\f");
        vortex();
        System.out.println("Enter customer code");
        int ccode=Integer.parseInt(in.readLine());

        System.out.println("  Here's your bill :---> ");
        System.out.println("\n  ———————————————————————————————————————————————————");
        System.out.println("  |Sr. no | Product                                                   |Cost(in Rs.)    ");
        System.out.println("  ———————————————————————————————————————————————————");
        for(int i=0;i<60;i++)
        {
            if(ccode==tcustcode[i])
            {
                if(booQ[i]>0)
                {
                    if(i<10)
                    {
                        System.out.println("  | "+k+".    | "+booktrans[i]+"        | "+bookcosttrans[i]+" ");
                        cost=cost+bookcosttrans[i];

                        k++;
                    }
                    else
                    {
                        System.out.println("  | "+k+".   | "+booktrans[i]+"        | "+bookcosttrans[i]+" ");
                        cost=cost+bookcosttrans[i];
                        k++;
                    }
                }

            }
        }

        for(int i=0;i<43;i++)
        {
            if(ccode==tcustcode[i])
            {
                if(movieQ[i]>0)
                {
                    if(i<10)
                    {
                        System.out.println("  | "+k+".    | "+movietrans[i]+"                        | "+moviecosttrans[i]+" ");
                        cost=cost+moviecosttrans[i];
                        k++;
                        //l++;
                    }

                    else
                    {
                        System.out.println("  | "+k+".   | "+movietrans[i]+"                        | "+moviecosttrans[i]+" ");
                        cost=cost+moviecosttrans[i];
                        k++;
                        //l++;
                    }
                }

            }
        }

        for(int i=0;i<35;i++)
        {
            if(ccode==tcustcode[i])
            {
                if(teQ[i]>0)
                {
                    if(i<10)
                    {
                        System.out.println("  | "+k+".    | "+techotrans[i]+" "+techtrans[i]+"                      | "+techosttrans[i]+" ");
                        cost=cost+techosttrans[i];
                        k++;
                        //l++;
                    }

                    else
                    {
                        System.out.println("  | "+k+".   | "+techotrans[i]+" "+techtrans[i]+"                      | "+techosttrans[i]+" ");
                        cost=cost+techosttrans[i];
                        k++;
                        //l++;
                    }
                }

            } 
        }
        System.out.println("  ———————————————————————————————————————————————————");

        System.out.println("   TOTAL ===>> Rs. "+cost);

        System.out.println("  ———————————————————————————————————————————————————");

        do
        {
            System.out.println("\n   1. Proceed to payment");
            System.out.println("   2. Shop More");
            System.out.println("   3. Exit");
            System.out.print("\n Enter your choice ---> ");
            g=0;
            while(true)
            {
                try
                {
                    l=Integer.parseInt(in.readLine());
                    if(l >=1 && l <= 3)
                    {
                        break;
                    }
                }
                catch(NumberFormatException e)
                {
                    System.out.print("\n Invalid input. Please enter again --->");
                }
            }

            switch(l)
            {
                case 1:
                pay();
                break;

                case 2:
                //main();
                break;

                case 3 :
                w5 = 0;
                out5 = 1;
                break;

                default:

            }

            if(out5 == 0)
            {
                System.out.println("Press 1 to remain in Payment Menu");
                w5 = Integer.parseInt(in.readLine());
            }
        }while(w5==1);
    }

    void pay()throws IOException
    {
        int p=0;
        int g=0;
        int w6=0;

        System.out.println("\f");
        vortex();
        System.out.println("\n Choose payment method :--->");
        System.out.println("\n  1. Credit Card");
        System.out.println("  2. Cash on delivery");
        //System.out.println("  3. Exit");

        System.out.print("\n Enter your choice ---> ");
        g=0;
        do
        {
            try
            {
                p=Integer.parseInt(in.readLine());
                g=1;
            }
            catch(NumberFormatException e)
            {
                g=0;
                System.out.print("\n Invalid input. Please enter again --->");
            }
        }while(g==0);

        switch(p)
        {
            case 1:
            credit();
            break;

            case 2:
            cod();
            break;

            //case 3 :
            //w6 = 0;
            //out6 = 1;

            default:
            System.out.println("Invalid choice entered");
            break;
        }
    }

    void credit()throws IOException
    {
        String n="";
        String cno="";
        String add="";
        String pno="";
        String cvv="";

        System.out.println("AMOUNT PAYABLE ===> "+cost);
        System.out.print("Please enter your name ---> ");
        n=in.readLine();
        System.out.print("Enter your address     ---> ");
        add=in.readLine();
        System.out.print("Enter your phone no.   ---> ");
        pno=in.readLine();
        System.out.println("Enter your credit card number ---> ");
        cno=in.readLine();
        System.out.println("Enter your CVV number ---> ");
        cvv=in.readLine();

        System.out.println("ORDER SUMMARY :---> ");
        System.out.println("Customer name      --> "+n);
        System.out.println("\n  Your order is placed. Thank you for ordering.......");
        System.out.println(" You will receive your order within 2-3 business days.");

        for(int i=0;i<1000000000;i++);
        System.out.print(".");
        for(int i=0;i<1000000000;i++);
        System.out.print(".");
        for(int i=0;i<1000000000;i++);
        System.out.print(".");
        for(int i=0;i<1000000000;i++);
        System.out.print(".");
        for(int i=0;i<1000000000;i++);
        System.out.print(".");
        for(int i=0;i<1000000000;i++);

        //exit();
    }

    void cod()throws IOException
    {
        String n="";
        String add="";
        String pno="";
        String em="";

        System.out.println("\f");

        vortex();

        System.out.println("\n AMOUNT PAYABLE ===> "+cost);
        System.out.print("  Please enter your name ---> ");
        n=in.readLine();
        System.out.print("  Enter your address     ---> ");
        add=in.readLine();
        System.out.print("  Enter your phone no.   ---> ");
        pno=in.readLine();
        System.out.print("  Enter your e-mail ID   ---> ");
        em=in.readLine();

        System.out.println("\n  Your order is placed. Thank you for ordering.......");
        System.out.println(" You will receive your order within 2-3 business days.");
        delay();

        //exit();
    }

    void exit()
    {
        System.out.println("\f");
        vortex();
        System.out.println("\n  Thank you for visiting us.");
        System.out.println("\n  Please visit again");
    }

    void delay()
    {
        for(int i=0;i<1000000000;i++);
        System.out.print(".");
        for(int i=0;i<1000000000;i++);
        System.out.print(".");
        for(int i=0;i<1000000000;i++);
        System.out.print(".");
        for(int i=0;i<1000000000;i++);
        System.out.print(".");
        for(int i=0;i<1000000000;i++);
        System.out.print(".");
        for(int i=0;i<1000000000;i++);

    }
}

