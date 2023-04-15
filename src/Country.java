public class Country implements Comparable<Country>{

    private String name;
    private int goldMedals;
    private int silverMedals;
    private int bronzeMedals;
    private int totalMedals;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoldMedals() {
        return goldMedals;
    }

    public void setGoldMedals(int goldMedals) {
        this.goldMedals = goldMedals;
    }

    public int getSilverMedals() {
        return silverMedals;
    }

    public void setSilverMedals(int silverMedals) {
        this.silverMedals = silverMedals;
    }

    public int getBronzeMedals() {
        return bronzeMedals;
    }

    public void setBronzeMedals(int bronzeMedals) {
        this.bronzeMedals = bronzeMedals;
    }

    public int getTotalMedals() {
        return totalMedals;
    }

    public void setTotalMedals(int totalMedals) {
        this.totalMedals = totalMedals;
    }

    public void addGoldMedal(int additionalG){
       goldMedals= goldMedals +  additionalG;
    }

    public void addSilverMedal(int additionalS){
        silverMedals= silverMedals + additionalS;
    }

    public void addBronzeMedal(int additionalB){
      bronzeMedals= bronzeMedals + additionalB;
    }

    public void addMedal(String medal, int additional){
        if (medal.equalsIgnoreCase("oro")){
            addGoldMedal(additional);
        } else if (medal.equalsIgnoreCase("plata")) {
            addSilverMedal(additional);
        } else if (medal.equalsIgnoreCase("bronce")) {
            addBronzeMedal(additional);
        }
        totalMedals = bronzeMedals + goldMedals + silverMedals;
    }

    @Override
    public int compareTo(Country o) {
        int criterionOne= o.goldMedals - this.goldMedals;
        if (criterionOne==0){
            int criterionTwo= o.silverMedals - this.silverMedals;
            if (criterionTwo == 0){
                int criterionThree= o.bronzeMedals - this.bronzeMedals;
                if (criterionThree == 0){
                    return this.name.compareTo(o.name);
                }else {
                    return criterionThree;
                }
            }else {
                return criterionTwo;
            }
        }else {
            return criterionOne;
        }

    }
}
