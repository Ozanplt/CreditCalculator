package business.concretes;

import business.abstracts.CreditCalculatorService;

public class OfficerCreditManager implements CreditCalculatorService{

	@Override
	public void add(int creditYear, double creditPay) {

		double creditPayBack= (creditYear*creditPay*0.20+creditPay);
		System.out.println(creditPay+" miktarindaki talebin geri ödemesi "+creditYear+" yil sonunda "+creditPayBack+"dır");
	}

}
