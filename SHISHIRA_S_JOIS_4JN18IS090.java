import java.util.*;

public class SHISHIRA_S_JOIS_4JN18IS090 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Reservation r = new Reservation();

        System.out.println("USN - 4JN18IS090  NAME - SHISHIRA S JOIS  SECTION - B\n");
        while(true){

            System.out.println("Railway Reservation Menu");
            System.out.println("1. Reservation");
            System.out.println("2. Cancellation");
            System.out.println("3. Details");
            System.out.println("4. Settings");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            int choice = in.nextInt();

            switch(choice){
                       
                case 1: r.reserve();		
                        break;
                               
                case 2: r.cancel();
                        break;
                                   
                case 3:r.print_details();
                        break;
                                   
                case 4:System.out.println("Which setting to change: C-Confirmation, R-RAC, W-Waiting List");
                        in = new Scanner(System.in);
                        String ch=in.nextLine();

                        if(ch.equals("C")){
                            System.out.println("Enter new value ");
                            int nw=in.nextInt();
                            r.setC(nw);
                        } 
                        else if(ch.equals("R")){
                            System.out.println("Enter new value ");
                            int nw=in.nextInt();
                            r.setR(nw);
                        } 
                        else if(ch.equals("W")){
                            System.out.println("Enter new value ");
                            int nw=in.nextInt();
                            r.setW(nw); 
                        }    
                        break;
                               
                case 5: r.print_details();
                        System.out.println("\nThankyou...!\n");
                    	System.exit(0);
            }
        }
    }
}