public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int atualTime){
        return expectedMinutesInOven() - atualTime;
    }
    public int preparationTimeInMinutes(int numberOfLayers){
        int minutesByPreparationLayer = 2;
        return numberOfLayers * minutesByPreparationLayer;
    } 
    public int totalTimeInMinutes(int layers, int minutes){
        return preparationTimeInMinutes(layers) + minutes;
    }
}
