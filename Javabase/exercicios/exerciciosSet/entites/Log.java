package Javabase.exercicios.exerciciosSet.entites;

import java.time.Instant;


public class Log implements Comparable<Log>{
    private String name;
    private Instant logDate;

    public Log(){}
    public Log(String name, Instant logDate){
        this.logDate = logDate;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Instant getLogDate() {
        return logDate;
    }
    public void setLogDate(Instant logDate) {
        this.logDate = logDate;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Log other = (Log) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return  name + " "+ logDate;
    }
    @Override
    public int compareTo(Log o) {
        return logDate.compareTo(o.getLogDate());
    }

    
    
}
