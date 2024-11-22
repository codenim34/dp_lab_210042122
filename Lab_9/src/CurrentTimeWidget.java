public class CurrentTimeWidget extends Widget {
    public CurrentTimeWidget(Mediator mediator) {
        super(mediator);
    }

    public void changeTime() {
       
        System.out.println("CurrentTimeWidget: Changing current time.");
        mediator.Notify(this, "CurrentTimeChanged");
    }

    @Override
    public void update() {
      
        System.out.println("CurrentTimeWidget: Updating current time.");
    }
}