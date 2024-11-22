public class NextPrayerWidget extends Widget {
       public NextPrayerWidget(Mediator mediator){
           super(mediator);
       }

    @Override
    public void update() {
        System.out.println("Next Prayer updated");
    }

    public void NextPrayerChange(){
        System.out.println("next prayer is changing");
      mediator.Notify(this,"NextPrayerChanged");
    }
}
