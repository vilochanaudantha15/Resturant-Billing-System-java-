/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resturant212;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vilochana udantha
 */
public class SuperClass_Parent {
     public double Filet_O_Fish;
    public double ChickenBurger;
    public double ChickenBurgerM;
    public double BaconCheeseBurger;
    public double ChickenLegend;
    
    public double MilkShake;
    public double VanilaCone;
    public double ClassVanila;
    public double VanMilkShake;
    public double ChocMilkShake;
    
    public double Meals;
    public double Drinks;
      public double TotalofMD;
       public double AllTotalofMD;
   
    public double GetAmount()
    {
        Meals = Filet_O_Fish +ChickenBurger +ChickenLegend + ChickenBurgerM +BaconCheeseBurger ;
        Drinks = MilkShake +VanilaCone+ClassVanila+VanMilkShake+ChocMilkShake;
        
        
         TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;
    }
    
    private JFrame frame;
    
    public void ExitSystem() {
        frame = new JFrame("Exit");
         
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit ","Resturant Management System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
               System.exit(0);
        }
            
        }
    public double pFilet_O_Fish = 3.56;
    public double pChickenBurger = 2.95;
    public double pChickenBurgerM = 3.98;
    public double pBaconCheeseBurger = 2.64;
    public double pChickenLegend = 3.64;
    
    public double pMilkShake = 2.10;
    public double pVanilaCone = 2.20;
    public double pClassVanila = 2.50; 
    public double pVanMilkShake = 1.95;
    public double pChocMilkShake = 2.37;



//===========================================================================

public double mcTax = 0.90;

public Double cFindTax(double cAmount)
{
double FindTax = cAmount -(cAmount * mcTax);
return  FindTax;}

    }
//============================================price============================

  

