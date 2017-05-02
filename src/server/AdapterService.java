package server;

import data.Idee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Benjamin on 02/05/2017.
 */
public class AdapterService {
    private Service lastService;
    private List<Idee> list;
    private int size;

    public AdapterService(){
        list = new ArrayList<>();
        size = 0;
    }

    public void manage(String serverString){

        String[] serverstr = serverString.split(";");
        switch (serverstr[0]){
            case "add":
                add(serverstr);
                break;
            case "choose":
                break;
            case "list":
                break;
            case "stop":
                break;
        }
    }

    public void add(String[] str){
        size = list.size();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str[1]);
        String[] part2 = str[2].split(",");
        String nom = str[3];
        String email = str[4];
        Idee idee = new Idee(stringBuffer,part2,nom,email);
        list.add(idee);
        if (size+1==list.size()){
            size+=1;
        }
    }

    public boolean isAdded() {
        return size == list.size();
    }

    public Idee getList(int pos){
        return list.get(pos);
    }

    public Service getLastService(){
        return lastService;
    }
}
