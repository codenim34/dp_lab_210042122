public class PrayerTimeTablesWidget extends Widget {
    public PrayerTimeTablesWidget(Mediator mediator){
        super(mediator);
    }

    @Override
    public void update() {
        System.out.println("Prayers table updated");
    }

    public void PrayerTableChange(){
        System.out.println("Prayer tables changed");
        mediator.Notify(this, "PrayerTableChanged");
    }
}
