import java.util.List;

public class DiceInputDTO {
    private List<Integer> myInput;
    private List<List<Integer>> otherPlayersInputs;


    public List<Integer> getMyInput() {
        return myInput;
    }

    public List<List<Integer>> getOtherPlayersInputs() {
        return otherPlayersInputs;
    }
}
