package quest.search;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Readクラス.ここでFileを読み込む.
 * List; //クエストの一覧
 */
public class Read {
    final private Map<String, ArrayList<String>> maps = new HashMap<>();
    /**
     * コンストラクタ.Fileを読み込む.
     * @param array　ギミック名
     */
    public Read(ArrayList<String> array){
        for (String gimmick :array){
            ArrayList<String> list = new ArrayList<>();
            try {
                File file = new File("."+gimmick);
                String pass = file.getAbsolutePath();
                File data = new File(pass);
                Scanner scan = new Scanner(data);
                while (scan.hasNext()){
                    String str = scan.next();
                    list.add(str);
                }
                this.maps.put(gimmick,list);
            }catch(FileNotFoundException e){
                System.out.println("ファイル無し");
            }
        }
    }
    public Map<String, ArrayList<String>> getMaps(){
        return this.maps;
    }
}