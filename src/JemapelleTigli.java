import data.Idee;

import java.util.List;

/**
 * Created by Benjamin on 02/05/2017.
 */
public class JemapelleTigli {
    private Service service;
    private List<Idee> list;
    /*
    *
     */
    JemapelleTigli(String serverString){
        String[] tigli = serverString.split(";");
        switch (tigli[0]){
            case "add":
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(tigli[1]);
                String[] tigli2 = tigli[2].split(",");
                String nom = tigli[3];
                String email = tigli[4];
                Idee idee = new Idee(stringBuffer,tigli2,nom,email);
                list.add(idee);
                break;
            case "choose":
                break;
            case "list":
                break;
        }
    }
}
