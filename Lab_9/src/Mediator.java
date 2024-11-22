public interface Mediator {

    void Notify (Object sender, String event );
    void updateWaqtTimeTables();
    void updateCurrentTime();
    void updatePrayerTimeTables();
    void updateCurrentWaqt();
    void updateNextPrayer();
}
