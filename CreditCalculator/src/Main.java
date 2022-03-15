import java.util.ArrayList;
import java.util.List;

import business.abstracts.CreditCalculatorService;
import business.concretes.Application;
import business.concretes.CarCreditManager;
import business.concretes.NeedCreditManager;
import business.concretes.OfficerCreditManager;


public class Main {

	public static void main(String[] args) {


		List<CreditCalculatorService> credits = new ArrayList<CreditCalculatorService>();
//		credits.add(new OfficerCreditManager());
	//	credits.add(new CarCreditManager());
	//	credits.add(new NeedCreditManager());
		Application application = new Application(credits);
		application.calculate(2, 50000);
	}

}
