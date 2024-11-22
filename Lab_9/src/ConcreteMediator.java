public class ConcreteMediator implements Mediator {
    private CurrentTimeWidget currentTimeWidget;
    private WaqtTimeTablesWidget waqtTimeTablesWidget;
    private PrayerTimeTablesWidget prayerTimeTablesWidget;
    private CurrentWaqtWidget currentWaqtWidget;
    private NextPrayerWidget nextPrayerWidget;
    private LocationWidget locationWidget;
    private TimeZoneWidget timeZoneWidget;
    private PrayerTimeSettingsWidget prayerTimeSettingsWidget;

    public void setCurrentTimeWidget(CurrentTimeWidget currentTimeWidget) {
        this.currentTimeWidget = currentTimeWidget;
    }

    public void setWaqtTimeTablesWidget(WaqtTimeTablesWidget waqtTimeTablesWidget) {
        this.waqtTimeTablesWidget = waqtTimeTablesWidget;
    }

    public void setPrayerTimeTablesWidget(PrayerTimeTablesWidget prayerTimeTablesWidget) {
        this.prayerTimeTablesWidget = prayerTimeTablesWidget;
    }

    public void setCurrentWaqtWidget(CurrentWaqtWidget currentWaqtWidget) {
        this.currentWaqtWidget = currentWaqtWidget;
    }

    public void setNextPrayerWidget(NextPrayerWidget nextPrayerWidget) {
        this.nextPrayerWidget = nextPrayerWidget;
    }

    public void setLocationWidget(LocationWidget locationWidget) {
        this.locationWidget = locationWidget;
    }

    public void setTimeZoneWidget(TimeZoneWidget timeZoneWidget) {
        this.timeZoneWidget = timeZoneWidget;
    }

    public void setPrayerTimeSettingsWidget(PrayerTimeSettingsWidget prayerTimeSettingsWidget) {
        this.prayerTimeSettingsWidget = prayerTimeSettingsWidget;
    }

    @Override
    public void Notify(Object sender, String event) {
        switch (event) {
            case "TimeZoneChanged":
                updateCurrentTime();
                break;
            case "PrayerTimeSettingsChanged":
                updatePrayerTimeTables();
                break;
            case "CurrentTimeChanged":
                updateCurrentWaqt();
                updateNextPrayer();
                break;
            case "WaqtTimeTablesChanged":
                updateCurrentWaqt();
                break;
            case "PrayerTimeTablesChanged":
                updateNextPrayer();
                break;
        }
    }


    @Override
    public void updateWaqtTimeTables() {
        if (waqtTimeTablesWidget != null) {
            waqtTimeTablesWidget.update();
        }
    }

    @Override
    public void updateCurrentTime() {
        if (currentTimeWidget != null) {
            currentTimeWidget.update();
        }
    }

    @Override
    public void updatePrayerTimeTables() {
        if (prayerTimeTablesWidget != null) {
            prayerTimeTablesWidget.update();
        }
    }

    @Override
    public void updateCurrentWaqt() {
        if (currentWaqtWidget != null) {
            currentWaqtWidget.update();
        }
    }

    @Override
    public void updateNextPrayer() {
        if (nextPrayerWidget != null) {
            nextPrayerWidget.update();
        }
    }
}