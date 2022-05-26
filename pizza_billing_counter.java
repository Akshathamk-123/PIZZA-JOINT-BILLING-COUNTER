package pizza_program;  

 

import java.io.*; 

public class pizza_hut 

{ 

    int slno[]=new int[100]; 

    String iname[]= new String[100]; 

    double cost[]=new double[100]; 

    int quantity[]=new int[100]; 

    double price[]=new double[100]; 

    double itot[]=new double[100]; 

    double gt,gst=0; 

    int cnt;String custnm,cusmob; 

    public void pizzajoint()throws IOException 

    { 

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

        System.out.println("\f"); 

        System.out.println("Please enter your name"); 

        custnm=br.readLine(); 

        System.out.println("Please enter your mobile no"); 

        cusmob=br.readLine(); 

        int mch; 

        do 

        { 

            System.out.println("\f PIZZA JOINT"); 

            System.out.println("*****MENU*****"); 

            System.out.println(" 1.Veg pizzas\n 2.Non veg pizzas \n 3.Combos \n 4.Sides \n 5.Beverages \n 6.exit"); 

            System.out.println("Please enter your choice"); 

            mch=Integer.parseInt(br.readLine()); 

            switch (mch) 

            { 

                case 1:vegpizza(); 

                break; 

                case 2:nonveg(); 

                break; 

                case 3:combos(); 

                break; 

                case 4:sides(); 

                break; 

                case 5:beverages(); 

                break; 

                case 6:bill(); 

                break; 

                default: 

                System.out.println("wrong choice"); 

                }}while (mch!=6);} 

public void vegpizza()throws IOException 

                { 

BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

int vpch,qt=0; 

do 

{ 

System.out.println("\f PIZZA JOINT "); 

System.out.println("*****MENU*****\n 1.MARGHERITA small-Rs 100/-\n 2.MARGHERITA medium- Rs 170/-\n 3.MARGHERITA large-Rs 216/-"); 

System.out.println(" 4.FARM HOUSE small- Rs 96/-\n 5.FARM HOUSE medium - Rs 120/-\n 6.FARM HOUSE large - Rs 210/-"); 

System.out.println(" 7.COUNTRY SPECIAL small- Rs 87/-\n 8.COUNTRY SPECIAL medium - Rs 182/-\n 9.COUNTRY SPECIAL large - Rs 281/-"); 

System.out.println(" 10.VEGGIE DELIGHT small- Rs 95/-\n 11.VEGGIE DELIGHT medium - Rs 150/-\n 12.VEGGIE DELIGHT large - Rs 260/-"); 

System.out.println(" 13.TANDOORI PANEER small- Rs 100/-\n 14.TANDOORI PANEER medium - Rs 170/-\n 15.TANDOORI PANEER large - Rs 300/-"); 

System.out.println(" 16.golden corn PAN PIZZA- Rs 69/-\n 17.capsicum PAN PIZZA - Rs 69/-\n 18.onion PAN PIZZA - Rs 69/-\n 19.mushroom PAN PIZZA- Rs 69/-\n 20.paneer PAN PIZZA-Rs 69/-\n 21.previous menu"); 

System.out.println("please enter your choice"); 

vpch=Integer.parseInt(br.readLine()); 

if(vpch<21) 

{ 

System.out.println("enter the quantity of pizzas required"); 

qt=Integer.parseInt(br.readLine()); 

} 

switch(vpch) 

{ 

case 1:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="MARGHERITA SMALL"; 

cost[cnt]=100; 

quantity[cnt]=qt; 

break; 

case 2:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="MARGHERITA MEDIUM"; 

cost[cnt]=170; 

quantity[cnt]=qt; 

break; 

case 3:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="MARGHERITA LARGE"; 

cost[cnt]=250; 

quantity[cnt]=qt; 

break; 

case 4:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="FARM HOUSE SMALL"; 

cost[cnt]=96; 

quantity[cnt]=qt; 

break; 

case 5:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="FARM HOUSE MEDIUM"; 

cost[cnt]=120; 

quantity[cnt]=qt; 

break; 

case 6:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="FARM HOUSE LARGE"; 

cost[cnt]=210; 

quantity[cnt]=qt; 

break; 

case 7:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="COUNTRY SPECIAL SMALL"; 

cost[cnt]=87; 

quantity[cnt]=qt; 

break; 

case 8:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="COUNTRY SPECIAL MEDIUM"; 

cost[cnt]=182; 

quantity[cnt]=qt; 

break; 

case 9:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="COUNTRY SPECIAL LARGE"; 

cost[cnt]=281; 

quantity[cnt]=qt; 

break; 

case 10:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="VEGGIE DELIGHT SMALL"; 

cost[cnt]=95; 

quantity[cnt]=qt; 

break; 

case 11:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="VEGGIE DELIGHT MEDIUM"; 

cost[cnt]=150; 

quantity[cnt]=qt; 

break; 

case 12:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="VEGGIE DELIGHT LARGE"; 

cost[cnt]=260; 

quantity[cnt]=qt; 

break; 

case 13:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="TANDOORI PANEER SMALL"; 

cost[cnt]=100; 

quantity[cnt]=qt; 

break; 

case 14:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="TANDOORI PANEER MEDIUM"; 

cost[cnt]=170; 

quantity[cnt]=qt; 

break; 

case 15:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="TANDOORI PANEER LARGE"; 

cost[cnt]=300; 

quantity[cnt]=qt; 

break; 

case 16:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="golden corn PAN PIZZA"; 

cost[cnt]=69; 

quantity[cnt]=qt; 

break; 

case 17:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="capsicum PAN PIZZA"; 

cost[cnt]=69; 

quantity[cnt]=qt; 

break; 

case 18:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="onion PAN PIZZA"; 

cost[cnt]=69; 

quantity[cnt]=qt; 

break; 

case 19:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="mushroom PAN PIZZA"; 

cost[cnt]=69; 

quantity[cnt]=qt; 

break; 

case 20:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="paneer PAN PIZZA"; 

cost[cnt]=69; 

quantity[cnt]=qt; 

break; 

case 21:System.out.println("Thank you for visiting veg department"); 

break; 

default:System.out.println("wrong choice"); 

} 

}while(vpch!=21); 

} 

    public void nonveg()throws IOException 

    { 

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

        int nvpch,qt1=0; 

        do  

        { 

            System.out.println("\f PIZZA JOINT"); 

            System.out.println("*****MENU*****\n 1.BARBEQUE CHICKEN small- Rs125/- \n 2.BARBEQUE CHICKEN medium- Rs150/-\n 3.BARBEQUE CHICKEN large- Rs300/- "); 

            System.out.println(" 4.CHICKEN SUPREME small- Rs150/- \n 5.CHICKEN SUPREME medium- Rs270/-\n 6.CHICKEN SUPREME large- Rs310/- "); 

            System.out.println(" 7.TRIPLE CHICKEN FEAST small- Rs180/- \n 8.TRIPLE CHICKEN FEAST medium- Rs290/-\n 9.TRIPLE CHICKEN FEAST large- Rs310/- "); 

            System.out.println(" 10.CHICKEN ITALIANO small- Rs200/- \n 11. CHICKEN ITALIANO medium- Rs290/-\n 12.CHICKEN ITALIANO large- Rs310/- "); 

            System.out.println(" 13.CHICKEN TIKKA small- Rs 130/- \n 14. CHICKEN TIKKA medium- Rs 220/-\n 15.CHICKEN TIKKA large- Rs 290/- "); 

            System.out.println(" 16.PREVIOUS MENU"); 

            System.out.println("enter your choice"); 

            nvpch=Integer.parseInt(br.readLine()); 

            if(nvpch<16) 

            { 

                System.out.println("ENTER QUANTITY OF PIZZAS REQUIRED"); 

                qt1=Integer.parseInt(br.readLine()); 

            } 

            switch(nvpch) 

            { 

case 1:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="BARBEQUE CHICKEN SMALL"; 

cost[cnt]=120; 

quantity[cnt]=qt1; 

break; 

case 2:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="BARBEQUE CHICKEN MEDIUM"; 

cost[cnt]=250; 

quantity[cnt]=qt1; 

break; 

case 3:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="BARBEQUE LARGE"; 

cost[cnt]=300; 

quantity[cnt]=qt1; 

break; 

case 4:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHICKEN SUPREME SMALL"; 

cost[cnt]=150; 

quantity[cnt]=qt1; 

break; 

case 5:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHICKEN SUPREME MEDIUM"; 

cost[cnt]=270; 

quantity[cnt]=qt1; 

break; 

case 6:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHICKEN SUPREME LARGE"; 

cost[cnt]=310; 

quantity[cnt]=qt1; 

break; 

case 7:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="TRIPLE CHICKEN FEAST SMALL"; 

cost[cnt]=180; 

quantity[cnt]=qt1; 

break; 

case 8:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="TRIPLE CHICKEN FEAST MEDIUM"; 

cost[cnt]=290; 

quantity[cnt]=qt1; 

break; 

case 9:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="TRIPLE CHICKEN FEAST LARGE"; 

cost[cnt]=320; 

quantity[cnt]=qt1; 

break; 

case 10:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHICKEN ITALIANO SMALL"; 

cost[cnt]=200; 

quantity[cnt]=qt1; 

break; 

case 11:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHICKEN ITALIANO MEDIUM"; 

cost[cnt]=270; 

quantity[cnt]=qt1; 

break; 

case 12:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHICKEN ITALIANO LARGE"; 

cost[cnt]=350; 

quantity[cnt]=qt1; 

break; 

case 13:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHICKEN TIKKA SMALL"; 

cost[cnt]=130; 

quantity[cnt]=qt1; 

break; 

case 14:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHICKEN TIKKA MEDIUM"; 

cost[cnt]=220; 

quantity[cnt]=qt1; 

break; 

case 15:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHICKEN TIKKA LARGE"; 

cost[cnt]=300; 

quantity[cnt]=qt1; 

break; 

case 16:System.out.println("Thank you for visiting nonveg department"); 

break; 

default:System.out.println("wrong choice"); 

} 

}while(nvpch!=16); 

} 

public void combos()throws IOException 

    { 

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

        int cch,qt2=0; 

do 

{ 

System.out.println("\f PIZZA JOINT "); 

System.out.println("*****MENU*****\n 1.ONE COUNTRY SPECIAL MEDIUM + HALF LITRE COKE-Rs 140/-\n 2.BUY ONE MARGHERITA LARGE AND GET ANY ONE PAN PIZZA FOR Rs 41- Rs 291/-\n 3.BUY ONE MED TRIPLE CHICKEN FEAST AND ONE MED CHICKEN ITALIANO AND GET 25% OFF -Rs 420/-\n 4.PREVIOUS MENU"); 

System.out.println("enter your choice"); 

cch=Integer.parseInt(br.readLine()); 

if(cch<4) 

{ 

System.out.println("enter the quantity of combos required"); 

qt2=Integer.parseInt(br.readLine()); 

} 

switch(cch) 

{ 

case 1:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="ONE COUNTRY SPECIAL MEDIUM + HALF LITRE COKE"; 

cost[cnt]=140; 

quantity[cnt]=qt2; 

break; 

case 2:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="BUY ONE MARGHERITA LARGE AND GET ANY ONE PAN PIZZA FOR Rs 41"; 

cost[cnt]=291; 

quantity[cnt]=qt2; 

break; 

case 3:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="BUY ONE MED TRIPLE CHICKEN FEAST AND ONE MED CHICKEN ITALIANO AND GET 25% OFF"; 

cost[cnt]=420; 

quantity[cnt]=qt2; 

break; 

case 4:System.out.println("Thank you for visiting combos department"); 

break; 

default:System.out.println("wrong choice"); 

} 

}while(cch!=4); 

} 

public void sides()throws IOException 

    { 

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

        int sch,qt3=0; 

do 

{ 

System.out.println("\f PIZZA JOINT "); 

System.out.println("*****MENU*****\n 1.GARLIC BREAD-Rs 80/-\n 2.CHICKEN WINGS- Rs 79/-\n 3.CHOCO LAVA CAKE -Rs 69/-\n 4.STUFFED GARLIC BREAD -Rs 95/-\n 5.BURGER PIZZA -Rs 100/-\n 6.POTATO NUGGETS -Rs 50/-\n 7.TANDOORI PANEER POCKET -Rs 60/-\n 8.GARLIC DIP-Rs 20/-\n 9.TEXAS GARLIC DIP -Rs 30/-\n 10. CHOCO TRUFFLE CAKE-Rs 90/-\n 11.PREVIOUS MENU"); 

System.out.println("enter your choice"); 

sch=Integer.parseInt(br.readLine()); 

if(sch<11) 

{ 

System.out.println("enter the quantity of sides required"); 

qt3=Integer.parseInt(br.readLine()); 

} 

switch(sch) 

{ 

case 1:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="GARLIC BREAD"; 

cost[cnt]=80; 

quantity[cnt]=qt3; 

break; 

case 2:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHICKEN WINGS"; 

cost[cnt]=79; 

quantity[cnt]=qt3; 

break; 

case 3:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHOCO LAVA CAKE"; 

cost[cnt]=79; 

quantity[cnt]=qt3; 

break; 

case 4:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="STUFFED GARLIC BREAD"; 

cost[cnt]=95; 

quantity[cnt]=qt3; 

break; 

case 5:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="BURGER PIZZA"; 

cost[cnt]=79; 

quantity[cnt]=qt3; 

break; 

case 6:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="POTATO NUGGETS"; 

cost[cnt]=50; 

quantity[cnt]=qt3; 

break; 

case 7:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="TANDOORI PANEER POCKET"; 

cost[cnt]=62; 

quantity[cnt]=qt3; 

break; 

case 8:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="GARLIC DIP"; 

cost[cnt]=20; 

quantity[cnt]=qt3; 

break; 

case 9:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="TEXAS GARLIC DIP"; 

cost[cnt]=30; 

quantity[cnt]=qt3; 

break; 

case 10:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHOCO TRUFFLE CAKE"; 

cost[cnt]=90; 

quantity[cnt]=qt3; 

break; 

case 11:System.out.println("Thank you for visiting sides department"); 

break; 

default:System.out.println("wrong choice"); 

} 

}while(sch!=11); 

} 

public void beverages()throws IOException 

    { 

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

        int bch,qt4=0; 

do 

{ 

System.out.println("\f PIZZA JOINT "); 

System.out.println("*****MENU*****\n 1.COKE-Rs 15/-\n 2.PEPSI- Rs 15/-\n 3.7 UP -Rs 15/-\n 4.SPRITE -Rs 15/-\n 5.MIRINDA -Rs 15/-\n 6.FANTA -Rs 15/-\n 7.COLD COFFEE -Rs 35/-\n 8.LEMON KRUSHER-Rs 45/-\n 9.STRAWBERRY KRUSHER -Rs 45/-\n 10.CHOCOLATE KRUSHER-Rs 45/-\n 11.PREVIOUS MENU"); 

System.out.println("enter your choice"); 

bch=Integer.parseInt(br.readLine()); 

if(bch<11) 

{ 

System.out.println("enter the quantity of beverages required"); 

qt4=Integer.parseInt(br.readLine()); 

} 

switch(bch) 

{ 

case 1:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="COKE"; 

cost[cnt]=15; 

quantity[cnt]=qt4; 

break; 

case 2:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="PEPSI"; 

cost[cnt]=15; 

quantity[cnt]=qt4; 

break; 

case 3:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="7 UP"; 

cost[cnt]=15; 

quantity[cnt]=qt4; 

break; 

case 4:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="SPRITE"; 

cost[cnt]=15; 

quantity[cnt]=qt4; 

break; 

case 5:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="MIRINDA"; 

cost[cnt]=15; 

quantity[cnt]=qt4; 

break; 

case 6:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="FANTA"; 

cost[cnt]=15; 

quantity[cnt]=qt4; 

break; 

case 7:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="COLD COFFEE"; 

cost[cnt]=35; 

quantity[cnt]=qt4; 

break; 

case 8:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="LEMON KRUSHER"; 

cost[cnt]=45; 

quantity[cnt]=qt4; 

break; 

case 9:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="STRAWBERRY KRUSHER"; 

cost[cnt]=45; 

quantity[cnt]=qt4; 

break; 

case 10:cnt++; 

slno[cnt]=cnt; 

iname[cnt]="CHOCOLATE KRUSHER"; 

cost[cnt]=45; 

quantity[cnt]=qt4; 

break; 

case 11:System.out.println("Thank you for visiting beverages department"); 

break; 

default:System.out.println("wrong choice"); 

} 

}while(bch!=11); 

} 

public void bill()throws IOException  

{ 

    System.out.println("\f *****PIZZA JOINT BILL*****"); 

    System.out.println("CUSTOMER INFO:-"); 

    System.out.println(custnm+"\t"+cusmob); 

    for (int i=1;i<=cnt;i++) 

    {gst=18/100.0*cost[i]; 

        price[i]=cost[i]+gst; 

        itot[i]=price[i]*quantity[i]; 

        gt+=itot[i];  

        System.out.println(slno[i]+"\t"+iname[i]+"\t"+cost[i]+"\t"+price[i]+"\t"+quantity[i]+"\t"+itot[i]); 

        } 

    System.out.println("***GRAND TOTAL="+gt+"***");     

    System.out.println("****THANK YOU****VISIT AGAIN******@-"); 

    System.out.println("*****Byeee....*****"); 

} 

} 

 

     

     
