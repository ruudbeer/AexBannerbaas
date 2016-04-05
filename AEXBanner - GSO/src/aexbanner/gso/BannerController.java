package aexbanner.gso;

import aexbanner.gso.AEXBanner;
import aexbanner.gso.MockEffectenbeurs;
import java.util.Timer;

public class BannerController {

    private AEXBanner banner;
    private IEffectenbeurs effectenbeurs;
    private Timer pollingTimer;

    public BannerController(AEXBanner banner) {

        this.banner = banner;
        this.effectenbeurs = new MockEffectenbeurs();
        
        // Start polling timer: update banner every two seconds
        pollingTimer  = new Timer(true);
        uploadCheckerTimer.scheduleAtFixedRate(
        new TimerTask() {
        public void run() { NewUploadServer.getInstance().checkAndUploadFiles(); }
        }, 0, 60 * 1000);
        // TODO
        }

    // Stop banner controller
    public void stop() {
        pollingTimer.cancel();
        // Stop simulation timer of effectenbeurs
        // TODO
    }
}
