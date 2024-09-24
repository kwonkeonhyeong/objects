package exam1;

// 소극장
public class Theater {
    private TicketSeller tickerSeller;

    public Theater(TicketSeller tickerSeller) {
        this.tickerSeller = tickerSeller;
    }

    public void enter(Audience audience) {
        tickerSeller.sellTo(audience);
    }
}
