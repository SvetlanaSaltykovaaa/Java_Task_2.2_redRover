public class Loot {

   double countLootForCaptain(int piastr, int pirate){
       return   (piastr * 0.25) + ((piastr * 0.25)/ pirate);
   }
   double countLootForShipOwner(int piastr){
       return piastr *0.5;
   }
   double countLootForCaptainAndOwner(int piastr, int pirate){
       return countLootForShipOwner(piastr)+lootForCaptain(piastr,pirate);
   }
   double countLootForUsualPirate(int piastr, int pirate){
       return (piastr * 0.25)/pirate;
   }
}
