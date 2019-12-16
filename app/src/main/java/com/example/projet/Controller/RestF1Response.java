package com.example.projet.Controller;

import com.example.projet.Model.F1;

import java.util.List;

public class RestF1Response {

    private List<F1> races;

    public List<F1> getResults() {
        return races;
    }

    public void setResults(List<F1> results) {
        this.races = results;
    }

    private List<F1> members;

    public List<F1> getResults2() {
        return members;
    }

    public void setResults2(List<F1> results2) {
        this.members = results2;
    }
}
