public class WaqtTimeTablesWidget extends Widget {
    public WaqtTimeTablesWidget(Mediator mediator){
        super(mediator);
    }

    public void WaqtChange( ){
        System.out.println("Waqt has been changed");
        mediator.Notify(this,"WaqtTimeTablesChanged");
    }

    @Override
    public void update() {
        System.out.println("Waqt table changed");
    }
}
