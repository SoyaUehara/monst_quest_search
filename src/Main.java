import quest.search.*;

import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<String> gimmick_data = new ArrayList<>(Arrays.asList(
                "damage_wall","block","deceleration_wall","gravity_barrier","magic_circle","mines","warp","wind"));
        Search search = new Search();
        Read quest_list = new Read(gimmick_data);
        Scanner scan = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
        while (true){
            System.out.println(gimmick_data);
            System.out.println("上のギミック一覧の中から入力してください");
            System.out.println("終了する場合はendと入力してください");
            System.out.println("リセットする場合はresetと入力してください");
            System.out.print("=>");
            String input = scan.nextLine();
            boolean TorF = true;
            switch (input){
                case "damage_wall":
                case "block":
                case "deceleration_wall":
                case "gravity_barrier":
                case "magic_circle":
                case "mines":
                case "warp":
                case "wind":
                    result = search.Searching(quest_list.getMaps().get(input),result);
                    break;
                case "reset":
                    System.out.println("リセットします");
                    result.clear();
                    TorF = false;
                    break;
                case "end":
                    break;
                default:
                    System.out.println("もう一度,入力してください");
                    TorF = false;
                    break;
            }
            if (input.equals("end")){
                System.out.println("終了します");
                break;
            }else if(TorF) {
                for (String quest : result){
                    System.out.println(quest);
                }
            }
        }
    }
}
