package com.story.choice.arrival;

import com.story.choice.Choice;

public class One implements Choice {
    @Override
    public void continueStory() {
        System.out.println(name + " chose one");
    }
}
