package com.example.hw133;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class Presenter extends MvpPresenter<ViewInterface> {

    private Model model;

    public Presenter () {
        this.model = new Model();
    }

    private String concatenateWord(String word) {
        return model.getWord() + word;
    }

    public void onButtonClick(String word) {
        //String oldWord = model.getWord();
        String newWord = concatenateWord(word);
        model.setWord(newWord);
        getViewState().setTextView(newWord);
    }
}
