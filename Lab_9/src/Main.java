public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        CurrentTimeWidget currentTimeWidget = new CurrentTimeWidget(mediator);
        WaqtTimeTablesWidget waqtTimeTablesWidget = new WaqtTimeTablesWidget(mediator);
        PrayerTimeTablesWidget prayerTimeTablesWidget = new PrayerTimeTablesWidget(mediator);
        CurrentWaqtWidget currentWaqtWidget = new CurrentWaqtWidget(mediator);
        NextPrayerWidget nextPrayerWidget = new NextPrayerWidget(mediator);
        LocationWidget locationWidget = new LocationWidget(mediator);
        TimeZoneWidget timeZoneWidget = new TimeZoneWidget(mediator);
        PrayerTimeSettingsWidget prayerTimeSettingsWidget = new PrayerTimeSettingsWidget(mediator);

        mediator.setCurrentTimeWidget(currentTimeWidget);
        mediator.setWaqtTimeTablesWidget(waqtTimeTablesWidget);
        mediator.setPrayerTimeTablesWidget(prayerTimeTablesWidget);
        mediator.setCurrentWaqtWidget(currentWaqtWidget);
        mediator.setNextPrayerWidget(nextPrayerWidget);
        mediator.setLocationWidget(locationWidget);
        mediator.setTimeZoneWidget(timeZoneWidget);
        mediator.setPrayerTimeSettingsWidget(prayerTimeSettingsWidget);

        // Example usage
        locationWidget.changeLocation();
        timeZoneWidget.changeTimeZone();
        prayerTimeSettingsWidget.changePrayerTimeSettings();
        currentTimeWidget.changeTime();
    }
}