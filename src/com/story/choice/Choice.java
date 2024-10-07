package com.story.choice;

import com.youtube.projects.story.util.Story;

@FunctionalInterface
public interface Choice {

    String name = Story.name;
    String gender = Story.gender;

    void continueStory();

}
