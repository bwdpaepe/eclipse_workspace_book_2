package ui;

import domein.DomeinController;

public class WinkelApplicatie {
	private DomeinController dc;
	public WinkelApplicatie(DomeinController dc) {
		this.dc = dc;
	}
	public void start() {
		dc.serialiseerWinkels();
	}

}
