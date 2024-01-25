

import java.io.Serializable;
import java.util.Objects;

public class FORSER implements Serializable {
    public String name;
    public String job;
    public transient int id;
    public FORSER(String name,int id,String job){
        Objects.requireNonNull(name);
        Objects.requireNonNull(id);
        Objects.requireNonNull(job);
        this.job = job;
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "FORSER{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", id=" + id +
                '}';
    }
}