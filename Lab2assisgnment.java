package com.mycompany.lab2assisgnment;

import java.util.*;



class battleship{
    
    int start_time=0;
    int end_time= 5;
 
    int game_point=2;
    int tie_point=1;
    public void gametime(){
        
   System.out.println("Game time start is  "+ start_time+ " "+"to"+ " "+end_time+" "+"minutes");

       }
    
    public void gameoutcome(){
       System.out.println("Winner will be awarded" +" "+game_point+" " +"points"); 
       System.out.println("In TIE situation, each player will be awarded"+tie_point+"point");
    }
}






class Grid{
    
    int grid_length = 5;
    String measure= "by";
    int grid_breadth= 5; 
            
    public void select_gridsize(){
        System.out.println("Grid size is:" +" "+grid_length+" "+ measure+" "+ grid_breadth);
    }


    public void select_side(){
        System.out.println("Select your attacking side:");

        System.out.println("Your grid is on Right side");
    }
    
}


class Ship {
     int engine = 15000;
     String model = "Tanker";
     String horse_power= "Horse Power";
     int ship_count =6;

     
       public void arrange_ship(){
        System.out.println(" Arrange ships strategically");
         } 
     
     
     
    public void select_model() {
        System.out.println("Player can select only" +" "+ ship_count +" "+"ships in this game ");
        System.out.println("Select the Ship Model");
        System.out.println(" The Ship model is: " + model+ "Ship size is: "+ " "+  engine +" "+ horse_power);
          }
    
    
    }






class Torpedo {
    int tor =45;
 /*   
    public void torpedo_count(){
   for (int i = tor; i >= 0; i--) {
            System.out.println("Torpedos left " + i);
        }
    }
    */ 
//this will let player to hit 45 torpedos one by 1
  
    


    
    
     public void available_torpedo(){
        System.out.println("You will have only" +" "+tor  +" "+"torpedos to attack opponents ship");

         
         
     }
    
     public void select_location(){
                System.out.println("Select location to Fire");


    }
    public void enetr_angle(){
        System.out.println("Enter torpedo torpedo angle to fire");
         
    
    
    }
    
   
   
}






class Round{
    public void Show_round(){
        System.out.println("Starting round 1 of 3");
    }


    public void Round_result(){
        System.out.println("Showing result of previous round");
    }
    
}






class Player {
}

class Human extends Player {
   int lvl=1;
    
    public void level(){
        System.out.println("Select level to compete");
                System.out.println("Starting level"+lvl+"as per your selection");

        
    }
      public void select_torpedo(){
                 System.out.println(" Player selecting Torpedo type");
      
      
      }
      
     public void throw_torpedo(){
                    
                System.out.println("Throwing 1st torpedo out of 45 ");       

         
                 System.out.println("Player throws Torpedo on opponent");       
     }
     
}



class CPU extends Player {
    public void select_torpedo(){
                 System.out.println(" Cpu Select's Torpedo type");
    }
    public void throw_torpedo(){
                 System.out.println("Cpu throws torpedo on opponent");
    }
}











public class Lab2assisgnment {
    
    
    
  
          public static void main(String[] args) {
        // Create Human and CPU players
        
        
         Scanner sc = new Scanner(System.in);

    System.out.println("Enter Player Name");
    String player_name = sc.nextLine();
    System.out.println("Player Name is : "+player_name);
    
    
    battleship bs = new battleship();
    bs.gametime();
    bs.gameoutcome();
    
    Human p = new Human();
     p.level();
     p.select_torpedo();
     p.throw_torpedo();
    
    
    
    Grid grid = new Grid();
      grid.select_gridsize();
      grid.select_side();
      
      
      
      Ship ship = new Ship();
     ship.select_model();
     ship.arrange_ship();
     
     Round rd = new Round();
     rd.Show_round();
      
     
     Torpedo fire = new Torpedo();
     fire.select_location();
     fire.enetr_angle();
     fire.available_torpedo();
      
 
     p.select_torpedo();
     p.throw_torpedo();
     
     CPU cpu = new CPU();
     cpu.select_torpedo();
     cpu.throw_torpedo();
     
     
     
      
 fire.select_location();
     fire.enetr_angle();
     
     
     
   
   
             rd.Round_result();


   
  
     
    }
}
