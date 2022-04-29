import java.util.ArrayList;

public class Campaign {
    private Hero h;
    private ArrayList<Encounter> encounters;
    private int currEncIdx;

    public Campaign(Hero h){
        this.h = h;
        encounters = new ArrayList<>();
        encounters.add(Encounter.firstEncounter(h));
        currEncIdx = 0;
    }


    public void playCampaign(){
        // while not dead, go to next encounter
        boolean heroIsAlive = true;
        while (currEncIdx < encounters.size() && heroIsAlive){
            Encounter curr = encounters.get(currEncIdx);     // grab current encounter
            System.out.println(curr.getBegText());      // beg message
            heroIsAlive= curr.battle();
            currEncIdx++;
        }
    }

}
