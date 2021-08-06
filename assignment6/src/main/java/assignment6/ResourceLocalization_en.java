package localization;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceLocalization_en extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {

		return new Object[][] {
				{ ResourceKeysLocalization.HELLO.toString(), AnimalNames.LION.toString() },
				{ ResourceKeysLocalization.HOW_ARE_YOU.toString(), "How are you ?" } };
	}

	public static void main(String[] args) {

		Locale en = new Locale("en");
		ResourceBundle resource = ResourceBundle
				.getBundle("com.localization.ResourceLocalization", en);

		System.out.println(resource.getString(ResourceKeysLocalization.HELLO.toString()));
		System.out.println(
				resource.getString(ResourceKeysLocalization.HOW_ARE_YOU.toString()));
	}

}