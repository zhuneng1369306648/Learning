package ����������ʵ��ͬ��;

public class TicketOffice2 implements Runnable{
	private Cinema cinema;
	public TicketOffice2 (Cinema cinema) {
		this.cinema=cinema;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		cinema.sellTickets1(3);
		cinema.sellTickets1(2);
		cinema.sellTickets2(2);
		cinema.sellTickets1(5);
		cinema.sellTickets2(3);
		cinema.sellTickets2(2);
		cinema.sellTickets1(3);
		cinema.returnTickets1(3);
		
	}

}