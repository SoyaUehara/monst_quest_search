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
     * @param List　ギミックがあるクエスト一覧
     * @param result　検索結果の保存
     * @return 検索結果を返す
     */
    public ArrayList<String> Searching(ArrayList<String> List, ArrayList<String> result){
        int delete = result.size();
        if (result.size()==0){
            result = new ArrayList<>(List);
        }else{
            for(String name : List){
                if (result.contains(name)){
                    result.add(name);
                }
            }
            for (int a=0; a<delete; a++){
                result.remove(result.get(0));
            }
        }
        if (result.size()==0){
            System.out.println("クエストがありません");
            System.out.println("リセットします");
            result.clear();
        }
        return result;
    }
}