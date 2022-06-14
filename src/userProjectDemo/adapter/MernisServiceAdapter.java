package userProjectDemo.adapter;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import userProjectDemo.business.abstracts.UserCheckService;
import userProjectDemo.entities.User;

public class MernisServiceAdapter implements UserCheckService{
    private UserCheckService userCheckService;
	@Override
	public boolean CheckIfRealPerson(User user) {
		try {
			KPSPublicSoap kpsPublicSoap= new KPSPublicSoapProxy();
			boolean isValid =kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(user.getTcNo()),user.getFirstName().toUpperCase(),
					user.getLastName().toUpperCase(),user.getGetDateOfBirth());
			return isValid;
		} catch (Exception e) {
			
			System.out.println("Giris bilgileri dogru degil");
		}
		return false;
	}

}
