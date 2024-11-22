public class CurrentWaqtWidget extends Widget
{
  public CurrentWaqtWidget(Mediator mediator){
      super(mediator);
  }



    @Override
    public void update() {
        System.out.println("Current Waqt has been changed");
    }

    public void CurrentWaqtChange(){
        System.out.println("Current waqt is changing");
        mediator.Notify(this,"CurrentWaqtChanged");
    }
}
