package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Island2 {

    private final Wood3 wood3;

    public Island2(Wood3 wood3) {
        this.wood3 = wood3;
    }


    @Override
    public String toString() {
        return ", на острове дерево " + wood3.toString();
    }
}
