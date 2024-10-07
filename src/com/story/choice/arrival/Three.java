package com.story.choice.arrival;

import com.story.choice.Choice;

public class Three implements Choice {
    @Override
    public void continueStory() {
        System.out.println(name + " is a " + gender + " and chose three");
    }
}
