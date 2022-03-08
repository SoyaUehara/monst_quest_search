import quest.search.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Read dw = new Read("damage_wall");
        Read block = new Read("block");
        Read deceleration = new Read("deceleration_wall");
        Read gb = new Read("gravity_barrier");
        Read magic = new Read("magic_circle");
        Read mines = new Read("mines");
        Read wp = new Read("warp");
        Read wind = new Read("wind");
        Scanner scan = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
        while (true){
            Search search = new Search();
            System.out.println("上のギミック一覧の中から入力してください");
            System.out.println("＝＞");
            String input = scan.nextLine();
            switch (input){
                case "Damage_wall":
                    result = search.Searching(dw.getList(), result);
                    break;
                case "block":
                    result = search.Searching(block.getList(),result);
                    break;
                case "Deceleration_Wall":
                    result = search.Searching(deceleration.getList(),result);
                    break;
                case "Gravity_Barrier":
                    result = search.Searching(gb.getList(),result);
                    break;
                case "Magic_Circle":
                    result = search.Searching(magic.getList(),result);
                    break;
                case "Mines":
                    result = search.Searching(mines.getList(),result);
                    break;
                case "Warp":
                    result = search.Searching(wp.getList(),result);
                    break;
                case "wind":
                    result = search.Searching(wind.getList(),result);
                    break;
                case "リセット":
                    System.out.println("リセットします。");
                    result.clear();
                    break;
                case "end":
                    break;
                default:
                    System.out.println("もう一度、入力してください");
                    break;
            }
            if (input.equals("end")){
                System.out.println("終了します");
                break;
            }else {
                for (String quest : result){
                    System.out.println(quest);
                }
            }
        }
    }
}
