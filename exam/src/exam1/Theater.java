package exam1;

public class Theater {
    private TicketSeller tickerSeller;

    public Theater(TicketSeller tickerSeller) {
        this.tickerSeller = tickerSeller;
    }

    public void enter(Audience audience) {
        tickerSeller.sellTo(audience);
    }
}
