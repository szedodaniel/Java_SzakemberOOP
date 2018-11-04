
package szakemberszimulator;

import java.util.List;


public abstract class MesterEmber {
    protected String nev;
    protected int napiDij;
    protected boolean[] foglaltNapok;
    
    
    public MesterEmber(String nev, int napiDij){
        this.nev = nev;
        this.napiDij = napiDij;
        foglaltNapok = new boolean[31];
        for (int i = 0; i < foglaltNapok.length; i++) {
            foglaltNapok[i] = false;
        }
    }

    @Override
    public String toString() {
        String s = String.format("[%s-%d Ft]\n\n", this.nev, this.napiDij);
        
        for (int i = 0; i < foglaltNapok.length; i++) {
            s+= String.format("%-2d ", (i+1));
        }
        s+="\n";
        for (int i = 0; i < foglaltNapok.length; i++) {
            s+= String.format("%-2s ",foglaltNapok[i] ? "F" : "SZ");
        }
        s+="\n";
        return s; 
    }
    public abstract boolean munkatVallal(int nap);

   public int szabadNapSzam(){
      int db = 0;
       for (int i = 0; i < this.foglaltNapok.length; i++) {
           if(this.foglaltNapok[i] == false){
               db++;
           }
       }
       return db;
   }
   public MesterEmber(List<MesterEmber> m){
       int max = 0;
       for (int i = 0; i < 10; i++) {
           if(m.get(i).szabadNapSzam() > m.get(max).szabadNapSzam()){
               max = i;
           }
           
       }
       System.out.println(m.get(max));
       
   }
   
    public boolean burkoloE(Object obj) {
    return (this == obj);
    }
    
    
}
