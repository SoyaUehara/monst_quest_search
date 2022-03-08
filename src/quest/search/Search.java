package quest.search;
import java.util.ArrayList;

public class Search {
    public Search(){
    }
    public ArrayList<String> Searching(ArrayList<String> quest_list, ArrayList<String> result){
        ArrayList<String> pure_result = new ArrayList<>();
        if (result.size()==0){
            result = new ArrayList<>(quest_list);
        }else{
            for(String name : quest_list){
                if (result.contains(name)){
                    pure_result.add(name);
                }
            }
            result = pure_result;
        }
        if (result.size()==0){
            System.out.println("クエストがありません");
            System.out.println("リセットします");
            result.clear();
        }
        return result;
    }
}