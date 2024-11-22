public abstract class Widget {
    public Mediator mediator;

    public Widget(Mediator mediator) {
        this.mediator = mediator;
    }

   public abstract void update();
}
