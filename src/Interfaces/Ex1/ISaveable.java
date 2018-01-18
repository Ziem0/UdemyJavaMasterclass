package Interfaces.Ex1;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable<t> {

    List<String> write();
    void read(List<String> data);

}
