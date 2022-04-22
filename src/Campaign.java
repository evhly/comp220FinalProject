import java.util.ArrayList;

public class Campaign {
    private Hero h;
    private ArrayList<Encounter> encounters;
    private int currEncIdx;

    public Campaign(Hero h){
        this.h = h;
        encounters = new ArrayList<>();
        encounters.add(Encounter.firstEncounter());
        currEncIdx = 0;
    }


    public void playCampaign(){
        // part 2 -- loop --- while not dead - go to next encounter
        startNextEncounter();
    }

    private void startNextEncounter(){
        Encounter curr = encounters.get(currEncIdx);     // grab current encounter
        System.out.println(curr.getBegText());      // beg message
        curr.battle();                        // call battle loop
        currEncIdx++;                        //inc currencidx
    }

    public boolean gameComplete(){
        return false;
    }


}
