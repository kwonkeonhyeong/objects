package exam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 매표소
public class TicketOffice {
    // 티켓 판매 금액
    private Long amount;
    // 판매할 티켓
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(long amount, Ticket ... tickets) {
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }

    public Ticket getTicket() {
        return tickets.removeFirst();
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }

    public void plusAmount(long amount) {
        this.amount += amount;
    }
}
