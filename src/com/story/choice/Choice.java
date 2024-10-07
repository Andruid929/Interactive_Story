package com.story.choice;

import com.story.util.Story;

@FunctionalInterface
public interface Choice {

    String name = Story.name;
    String gender = Story.gender;

    void continueStory();

}
