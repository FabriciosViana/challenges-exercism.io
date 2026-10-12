public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int atualTime){
        return expectedMinutesInOven() - atualTime;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers){
        int minutesByPreparationLayer = 2;
        return numberOfLayers * minutesByPreparationLayer;
    } 
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutes){
        int minutesByPreparationLayer = 2;
        return layers * minutesByPreparationLayer + minutes;
    }
}
