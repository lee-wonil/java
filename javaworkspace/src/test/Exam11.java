package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class Exam11 {

    static class Data {
        String value;

        public Data(String value) {
            this.value = value.toUpperCase();
        }
        public String toString() {
        	return "Data("+"\""+value+"\""+")";
        }
        @Override
        public boolean equals(Object obj) {
        	if(obj instanceof Data==false) return false;
        	Data d = (Data)obj;        	
        	return Objects.equals(d.value, value);
        }

    }

    public static void main(String[] args) {
        Collection<Data> a = new ArrayList<Data>();
        a.add(new Data("a"));
        a.add(new Data("b"));
        a.add(new Data("c"));
        

        a.remove(new Data("B"));
        System.out.println(a.toString());
    }

}
