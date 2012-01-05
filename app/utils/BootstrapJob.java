package utils;

import models.Talk;
import play.Logger;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

import java.util.Date;

@OnApplicationStart
public class BootstrapJob extends Job {
    @Override
    public void doJob() throws Exception {
        Logger.info("Adding sample talks");
        final Talk talk = new Talk();
        talk.title = "Play! with Sencha";
        talk.date = new Date();
        talk.speaker = "Vijay";
        talk.save();
    }
}
