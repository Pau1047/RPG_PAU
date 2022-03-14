package Character.Job;

import Character.Stat.Stat;

public abstract class Job {

    //Devuelve el modificador de la professión segun el stat
    public abstract int modifier (Stat stat);

    @Override
    //Devuelve true si son la misma clase
    public boolean equals(Object obj){

        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
