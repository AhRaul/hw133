package com.example.hw133;

public class Presenter {

    private Model model;
    private ViewInterface viewInterface;

    public Presenter (ViewInterface viewInterface) {
        this.viewInterface = viewInterface;
        model = new Model();
    }

    private String concatenateWord(String word) {
        return model.getWord() + word;
    }

    public void onButtonClick(String word) {
        String oldWord = model.getWord();
        String newWord = concatenateWord(word);
        model.setWord(newWord);
        viewInterface.setTextView(newWord);
    }
}
