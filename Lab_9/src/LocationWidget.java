public class LocationWidget extends Widget {
    public LocationWidget(Mediator mediator) {
        super(mediator);
    }

    public void changeLocation() {
       
        System.out.println("LocationWidget: Changing location.");
        mediator.Notify(this, "LocationChanged");
    }

    @Override
    public void update() {
        
        System.out.println("LocationWidget: Updating location.");
    }
}