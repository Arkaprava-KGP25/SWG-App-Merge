package com.example.apphomepage;

import java.util.List;

public class ParentModelClass {

    String title;
    List<ChildModelClass> childModelClassesList;

    public ParentModelClass(String title, List<ChildModelClass> childModelClassesList) {
        this.title = title;
        this.childModelClassesList = childModelClassesList;
    }
}

