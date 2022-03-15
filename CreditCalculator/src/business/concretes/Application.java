package business.concretes;

import java.util.List;

import business.abstracts.CreditCalculatorService;

public class Application {
	List<CreditCalculatorService> creditList;

	public Application(List<CreditCalculatorService> creditList) {

		this.creditList = creditList;

	}

	public void calculate(int year, int pay) {
		if (creditList.size() > 0) {
			for (CreditCalculatorService credit : creditList) {
				credit.add(year, pay);
			}
		}
		else {
			System.out.println("en az bir kredi girmelisiniz");
		}
	}

}
