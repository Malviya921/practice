package collection_FRAMEWORK;

import java.util.HashSet;
import java.util.Set;

public class HashsetStudent {
    public static void main(String[] args) {

        Set<student> studentsSet = new HashSet<>();
        studentsSet.add(new student("ravi",67));
        studentsSet.add(new student("prince",67));
        studentsSet.add(new student("prince",61));
        studentsSet.add(new student("ravi",67));

        System.out.println(studentsSet);

    }
}
