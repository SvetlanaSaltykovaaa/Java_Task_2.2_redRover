public class Loot {

   double lootForCaptain(int piastr, int pirate){
       return   (piastr * 0.25) + ((piastr * 0.25)/ pirate);
   }
   double lootForShipOwner(int piastr){
       return piastr *0.5;
   }
   double lootForCaptainAndOwner(int piastr, int pirate){
       return lootForShipOwner(piastr)+lootForCaptain(piastr,pirate);
   }
   double lootForUsualPirate(int piastr, int pirate){
       return (piastr * 0.25)/pirate;
   }
}
