public class PrayerTimeSettingsWidget extends Widget {
    public PrayerTimeSettingsWidget(Mediator mediator) {
        super(mediator);
    }

    public void changePrayerTimeSettings() {
        
        System.out.println("PrayerTimeSettingsWidget: Changing prayer time settings.");
        mediator.Notify(this, "PrayerTimeSettingsChanged");
    }

    @Override
    public void update() {
        
        System.out.println("PrayerTimeSettingsWidget: Updating prayer time settings.");
    }
}