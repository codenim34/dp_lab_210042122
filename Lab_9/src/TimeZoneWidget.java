public class TimeZoneWidget extends Widget {
    public TimeZoneWidget(Mediator mediator) {
        super(mediator);
    }

    public void changeTimeZone() {
       
        System.out.println("TimeZoneWidget: Changing timezone.");
        mediator.Notify(this, "TimeZoneChanged");
    }

    @Override
    public void update() {
       
        System.out.println("TimeZoneWidget: Updating timezone.");
    }
}