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
 * @author szedo
 */
public class Szakember{
    private List<MesterEmber> mesterek;
    Scanner sc =new Scanner(System.in);
    public Szakember(MesterEmber m) {
        this.mesterek.add(m);
    }

    public Szakember() {
        this.mesterek = new ArrayList<>();
      
        this.mesterek.add(new Burkolo("Tapéta Lajos",60000,Helyszin.Belso));
        this.mesterek.add(new VizVezetekSzerelo("Megszer Elek", 12000, 3));
        this.mesterek.add(new Burkolo("Vakolat Péter",50000,Helyszin.Kulso));
        this.mesterek.add(new VizVezetekSzerelo("Víz Elek", 15000, 5));
        this.mesterek.add(new Burkolo("Eresz János",30000,Helyszin.Kulso));


    }
  /*  public void asdd(){
        for (int i = 0; i < this.mesterek.size(); i++) {
            this.mesterek.get(i).
        }
    }

   */

    public List<MesterEmber> getMesterek() {
        return mesterek;
    }

    public void mesterHozzaad(MesterEmber m) {
        this.mesterek.add(m);
    }
   
   

    @Override
    public String toString() {
        String s = super.toString();
        return s+=mesterek;
    }

    
    
}
