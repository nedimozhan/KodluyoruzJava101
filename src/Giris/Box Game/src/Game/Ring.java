package Game;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        // added
        Fighter firstFighter;
        Fighter secondFighter;

        double randomValue = Math.random() * 100;
        System.out.println("RAND : " + randomValue);
        if(randomValue<50){
            firstFighter = this.f1;
            secondFighter = this.f2;
        }
        else{
            firstFighter = this.f2;
            secondFighter = this.f1;
        }

        if (checkWeight() && firstFighter!=null && secondFighter!=null) {
            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                secondFighter.health = firstFighter.hit(f2);
                if (isWin()){
                    break;
                }
                firstFighter.health = secondFighter.hit(firstFighter);
                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
