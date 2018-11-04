/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szakemberszimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import szakemberszimulator.Burkolo.Helyszin;

/**
 *
 * @author Diak
 */
public class SzakemberSzimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       // MesterEmber geza = new MesterEmber("Burkoló", 18000);
        //System.out.println(geza);
        Burkolo geza = new Burkolo("Burkoló", 18000, Burkolo.Helyszin.Belso);
        System.out.println(geza);
        geza.munkatVallal(1);
        
        System.out.println(geza.osszesSzabadNap());
        
        geza.munkatVallal(20);
        geza.munkatVallal(21);
        geza.munkatVallal(22);
        
        geza.munkatVallal(30);
        
        System.out.println(geza);
        System.out.println(geza.osszesSzabadNap());
        
        
       /*  List<MesterEmber> szakEmberLista = new ArrayList<>();
       szakEmberLista.add(geza);
        
        szakEmberLista.add(new Burkolo("Kis Elemér", 60000, Burkolo.Helyszin.Kulso));
        szakEmberLista.add(new VizVezetekSzerelo("Viz Elek", 45000, 12));
        for (MesterEmber sze : szakEmberLista) {
            System.out.println(sze);
        }*/
        Szakember a = new Szakember();
        //System.out.println(a);
        
       List<MesterEmber> szakemberek = a.getMesterek();
      
       char menuPont;
        do{
       menuPont = menu();
       
       switch(menuPont){
            case '1':
               Burkolo b1 = new Burkolo(sc.next(),sc.nextInt(), Helyszin.Belso);
                
                a.mesterHozzaad(b1);
               break;
            case '2':
               Burkolo b2 = new Burkolo(sc.next(),sc.nextInt(), Helyszin.Kulso);
               
                a.mesterHozzaad(b2);
                
               break;
           case '3':
               VizVezetekSzerelo v1 = new VizVezetekSzerelo(sc.next(),sc.nextInt(), sc.nextInt());
              
               a.mesterHozzaad(v1);
               break;
           case '4':
               for (int i = 0; i < szakemberek.size(); i++) {
                   if(szakemberek.get(i).getClass().equals(Burkolo.class)){
                          System.out.println(szakemberek.get(i));

                    }
               }
               
               break;
           case '5':
               for (int i = 0; i < szakemberek.size(); i++) {
                   if(szakemberek.get(i).getClass().equals(VizVezetekSzerelo.class)){
                          System.out.println(szakemberek.get(i));

                    }
               }
               break;
           
           default:System.out.println("Helytelen menüpont!");break;
       }
        }while(menuPont != 'f');         
        
    }
    
    public static char  menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println(
        "1  belső burkoló megadása (vnev_knev napidíj)\n" +
        "2  külső burkoló megadása (vnev_knev napidíj)\n" +
        "3  Vízvezeték szerelő megadása vnev_knev napidíj értékelés\n" +
        "4  Összes burkoló\n" +
        "5 Összes vízvezeték szerelő\n" +
        
        "f Kilépni"
                + "Kérem válasszon menüpontot");
        char m = sc.nextLine().charAt(0);
        
        return m;
    
    }
}
