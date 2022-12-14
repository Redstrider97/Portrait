package com.example.portrait;

public class Candidate {




    public Candidate( String new_name,
                      String new_title,
                      String[] new_professional_info,
                      String[] new_nerd_info,
                      String[] new_human_info   ){
        this.human_info = new_human_info;
        this.title = new_title;
        this.name = new_name;
        this.nerd_info = new_nerd_info;
        this.human_info = new_human_info;
        this.professional_info = new_professional_info;
    }

    public String name;
    public String title;
    public String [] professional_info ={
            "",
            "",
            "",
            ""
    };

    public String [] nerd_info ={
            "",
            "",
            "",
            ""
    };

    public String [] human_info ={
            "",
            "",
            "",
            ""
    };


}
