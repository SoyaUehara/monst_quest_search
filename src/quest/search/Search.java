package quest.search;
import java.util.ArrayList;

/**
 * Searchクラス.
 * gimmick_data　//ギミックのリスト
 */
public class Search {
    /**
     *コンストラクタ 誰でも使用できるようにギミックの一覧を表示する.
     */
    public Search(){
    }
    /**
     *
     * @param quest_list　ギミックがあるクエスト一覧
     * @param result　検索結果の保存
     * @return 検索結果を返す
     */
    public ArrayList<String> Searching(ArrayList<String> quest_list, ArrayList<String> result){
        int delete = result.size();
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